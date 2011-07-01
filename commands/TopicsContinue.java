package commands;

import java.io.BufferedReader;

import main.Main;
import main.View;
import main.RedditData.Data;

/**
 * @author raido
 */
public class TopicsContinue extends Command {

   @Override
   public void execute(BufferedReader in) {
      String after = Main.getData().getAfter();
      Data data = View.getData(Main.getTopic(), 10, after);
      Main.addData(data);
      View.posts(data, Main.getCount()-10);
   }
}
