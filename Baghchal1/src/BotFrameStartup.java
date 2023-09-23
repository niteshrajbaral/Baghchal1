import javax.swing.SwingUtilities;


public class BotFrameStartup{
    public static void main(String args[]){
          BotFrameStartup game = new BotFrameStartup();
          game.displayBoardFromMain(); 
    }

        public void displayBoardFromMain(){
            SwingUtilities.invokeLater(() -> {

            BotFrame BotFrame = new BotFrame();
            BotFrame.setVisible(true);
        });
    }
 }