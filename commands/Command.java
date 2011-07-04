package commands;

import java.io.BufferedReader;

import main.Main;

/**
 * @author raido
 */
public abstract class Command {
   
   public abstract void execute(BufferedReader in, String param);
   
   protected int getPostIndex(BufferedReader in, String param) throws Exception {
      if ("".equals(param)) {
         System.out.println("Number of the post: ");
         param = in.readLine();
      }
      int index = Integer.parseInt(param);
      if (index < 1 || index > Main.getCount()) throw new Exception("Invalid index!");
      return index;
   }
}
