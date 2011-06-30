package commands;

import java.io.IOException;

import main.View;

/**
 * @author raido
 */
public class ViewTopic extends Command {

   @Override
   public void execute(String extra) {
      try {
         View.posts(extra, 10, "");
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
