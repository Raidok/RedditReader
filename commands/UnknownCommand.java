package commands;

import java.io.BufferedReader;

/**
 * @author raido
 */
public class UnknownCommand extends Command {

   @Override
   public void execute(BufferedReader in) {
      System.out.println("No such command!");
   }
}
