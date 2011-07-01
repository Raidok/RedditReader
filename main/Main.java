package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import main.RedditData.Data;

import commands.CommandModule;

/**
 * @author raido
 */
public class Main {

   private boolean alive = true;
   private String location = "titles";
   private BufferedReader in;
   private CommandModule commandModule;
   private static Data data;
   private static String topic;

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
         commandModule.call(location, command, in);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public static Data getData() {
      return data;
   }

   public static void setData(Data data) {
      Main.data = data;
   }

   public static void addData(Data data) {
      Main.data.getChildren().addAll(data.getChildren());
      Main.data.setAfter(data.getAfter());
   }
   
   public static int getCount() {
      return Main.data.getChildren().size();
   }

   public static String getTopic() {
      return topic;
   }

   public static void setTopic(String topic) {
      Main.topic = topic;
   }
}
