package commands;

/**
 * @author raido
 */
public class UnknownCommand extends Command {

   @Override
   public void execute(String extra) {
      System.out.println("No such command!");
   }
}
