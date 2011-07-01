package commands;

import java.io.BufferedReader;

/**
 * @author raido
 */
public abstract class Command {
   
   public abstract void execute(BufferedReader in, String param);
}
