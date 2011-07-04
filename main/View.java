package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

import com.google.gson.Gson;

import main.RedditData.Child;
import main.RedditData.ChildData;
import main.RedditData.Data;

/**
 * @author raido
 */
public class View {

   private View() {
   }

   public static void singlePostComments(RedditData[] data) {
      System.out.println(data.length + " COMMENTS");
      for (int i = 1; i < data.length; i++) {
         commentLevel(data[i].getData().getChildren(), " ");
      }
   }
   
   private static void commentLevel(List<Child> data, String padding) {
      for (int i = 1; i < data.size(); i++) {
         System.out.println(padding + data.get(i).getData().getBody());
         if (data.get(i).getData().getReplies() != null) {
            commentLevel(data.get(i).getData().getReplies().getData().getChildren(), padding + " ");
         }
      }
   }

   public static void singlePost(ChildData data) {
      System.out.println("TITLE: " + data.getTitle());
      if (data.getSelftext().length() > 0) {
         System.out.println(data.getSelftext());
      }
      System.out.println("LINK: " + data.getUrl());
   }
   
   public static void posts(Data data, int offset) {
      ChildData child = null;
      for (int i = 0; i < data.getChildren().size(); i++) {
         child = data.getChildren().get(i).getData();
         System.out.println(offset+i+1 + ". " + child.getTitle().replace("\n", "") + " (" + child.getDomain() + ")");
      }
   }
   
   public static Data getPosts(String topic, int count, String after) {
      Gson gson = new Gson();
      if (!"".equals(after)) after = "&after=" + after;
      RedditData reddit = gson.fromJson(getJSONData("http://www.reddit.com/" + topic.trim() + "/.json?limit=" + count + after, false), RedditData.class);
      return reddit.getData();
   }
   
   public static RedditData[] getComments(String post, int count) {
      Gson gson = new Gson();
      RedditData[] reddit = gson.fromJson(getJSONData("http://www.reddit.com/" + post + "comments/.json?limit=" + count, true), RedditData[].class);
      return reddit;
   }

   private static InputStreamReader getJSONData(String address, boolean debug){
      InputStreamReader reader = null;
      try {
         URL url = new URL(address);
         reader = new InputStreamReader(url.openStream());
      } catch (IOException e) {
         e.printStackTrace();
      }
      
      // FOR DEBUGGING
      if (debug) {
         BufferedReader in = new BufferedReader(reader);
         String text = null;
         try {
            if ((text = in.readLine()) != null) {
               System.out.println(text.replace("{", "{\n")
                     .replace("}", "}\n")
                     .replace("[", "[\n")
                     .replace("]", "]\n")
                     .replace(", ", ",\n"));
            }
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
      // END OF DEBUGGING PART
      
      return reader;
  }
}
