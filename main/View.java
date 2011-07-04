package main;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import com.google.gson.Gson;

import main.RedditData.ChildData;
import main.RedditData.Data;

/**
 * @author raido
 */
public class View {

   private View() {
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

   public static Data getData(String topic, int count, String after) {
      Gson gson = new Gson();
      RedditData reddit = null;
      String additional = "";
      if (!"".equals(after)) additional = "&after=" + after;
      reddit = gson.fromJson(getJSONData("http://www.reddit.com/" + topic.trim() + "/.json?limit=" + count + additional), RedditData.class);
      return reddit.getData();
   }

   private static InputStreamReader getJSONData(String address){
      InputStreamReader reader = null;
      try {
         URL url = new URL(address);
         reader = new InputStreamReader(url.openStream());
      } catch (IOException e) {
         e.printStackTrace();
      }
      
      // FOR DEBUGGING
//      BufferedReader in = new BufferedReader(reader);
//      String text = null;
//      try {
//         if ((text = in.readLine()) != null) {
//            System.out.println(text.replace("{", "{\n")
//                                    .replace("}", "}\n")
//                                    .replace("[", "[\n")
//                                    .replace("]", "]\n")
//                                    .replace(", ", ",\n"));
//         }
//      } catch (IOException e) {
//         e.printStackTrace();
//      }
      // END OF DEBUGGING PART
      
      return reader;
  }
}
