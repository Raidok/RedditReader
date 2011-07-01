package commands;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author raido
 */
public class CommandModule {

   private Map<String, Map<String, Command>> commandGroups;
   
   public CommandModule() {
      commandGroups = new HashMap<String, Map<String, Command>>();
      
      Map<String, Command> titlesViewCommands = new HashMap<String, Command>();
      titlesViewCommands.put("read", new ViewTopic());
      titlesViewCommands.put("next", new TopicsContinue());
      
      commandGroups.put("titles", titlesViewCommands);
   }
   
   public void call(String location, String command, BufferedReader in) {
      Command cmd = commandGroups.get(location).get(command.toLowerCase());
      if (cmd != null) {
         cmd.execute(in);
      } else {
         new UnknownCommand().execute(in);
      }
   }
}
