//import javax.swing.SwingUtilities;
//
//
//public class BotFrameStartup{
//    public static void main(String args[]){
//          BotFrameStartup game = new BotFrameStartup();
//          game.displayBoardFromMain(); 
//    }
//
//        public void displayBoardFromMain(){
//            SwingUtilities.invokeLater(() -> {
//
//            BotFrame BotFrame = new BotFrame();
//            BotFrame.setVisible(true);
//        });
//    }
// }
import javax.swing.SwingUtilities;

public class BotFrameStartup {
    private String username1;

    public BotFrameStartup(String username1) {
        this.username1 = username1;
    }

    public void displayBoardFromMain() {
        SwingUtilities.invokeLater(() -> {
            BotFrame BotFrame = new BotFrame(username1); // Pass the username to BotFrame's constructor
            BotFrame.setVisible(true);
        });
    }
}