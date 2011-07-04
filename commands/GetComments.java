package commands;

import java.io.BufferedReader;

import main.Main;
import main.RedditData;
import main.View;

/**
 * @author raido
 */
public class GetComments extends Command {

   @Override
   public void execute(BufferedReader in, String param) {
      try {
         int index = getPostIndex(in, param);
         RedditData[] data = View.getComments(Main.getData().getChildren().get(index).getData().getPermalink(), 10);
         View.singlePostComments(data);
      } catch (NumberFormatException e) {
         System.out.println("Not a number!");
      } catch (Exception e) {
         e.printStackTrace();
      }
      
   }
}
