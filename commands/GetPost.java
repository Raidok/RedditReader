package commands;

import java.io.BufferedReader;

import main.Main;
import main.View;

/**
 * @author raido
 */
public class GetPost extends Command {

   @Override
   public void execute(BufferedReader in, String param) {
      try {
         int index = getPostIndex(in, param);
         View.singlePost(Main.getData().getChildren().get(index-1).getData());
      } catch (NumberFormatException e) {
         System.out.println("Not a number!");
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }
}
