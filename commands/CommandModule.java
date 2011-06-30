package commands;

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
   
   public void call(String location, String command) {
      Command cmd = commandGroups.get(location).get(command.split(" ")[0]);
      if (cmd != null) {
         cmd.execute(command.substring(command.indexOf(" ")));
      } else {
         new UnknownCommand().execute("");
      }
   }
}
