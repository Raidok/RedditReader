package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import commands.CommandModule;

/**
 * @author raido
 */
public class Main {

   private boolean alive = true;
   private String location = "titles";
   private BufferedReader in;
   private CommandModule commandModule;

   public static void main(String[] args)  {
      new Main();
   }

   public Main() {
      in = new BufferedReader(new InputStreamReader(System.in));
      commandModule = new CommandModule();
      while (alive) {
         readCommand();
      }
   }

   private void readCommand() {
      String command = null;
      System.out.println(">> ");
      try {
         if (!"".equals(command = in.readLine()))
         commandModule.call(location, command);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
