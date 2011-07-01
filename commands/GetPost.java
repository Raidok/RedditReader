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
         if ("".equals(param)) {
            System.out.println("Number of the post: ");
            param = in.readLine();
         }
         System.out.println("IN: " + param);
         int index = Integer.parseInt(param);
         if (index < 1 || index > Main.getCount()) throw new Exception("Invalid index!");
         View.singlePost(Main.getData().getChildren().get(index-1).getData());
      } catch (NumberFormatException e) {
         System.out.println("Not a number!");
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }
}
