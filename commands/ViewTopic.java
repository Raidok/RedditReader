package commands;

import java.io.BufferedReader;
import java.io.IOException;

import main.Main;
import main.RedditData.Data;
import main.View;

/**
 * @author raido
 */
public class ViewTopic extends Command {

   @Override
   public void execute(BufferedReader in, String topic) {
      try {
         if ("".equals(topic)) {
            System.out.print("Choose topic: ");
            topic = in.readLine();
         }
         Data data = View.getPosts(topic, 10, "");
         Main.setTopic(topic);
         Main.setData(data);
         View.posts(data, 0);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
