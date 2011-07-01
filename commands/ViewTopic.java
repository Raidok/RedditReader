package commands;

import java.io.BufferedReader;
import java.io.IOException;

import main.View;

/**
 * @author raido
 */
public class ViewTopic extends Command {

   @Override
   public void execute(BufferedReader in) {
      String topic = null;
      try {
         System.out.print("Choose topic: ");
         topic = in.readLine();
         View.posts(topic, 10, "");
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
