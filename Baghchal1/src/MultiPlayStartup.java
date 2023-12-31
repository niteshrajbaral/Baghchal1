//import javax.swing.SwingUtilities;
//
//
//public class MultiPlayStartup{
//    public static void main(String args[]){
//    	MultiPlayStartup game = new MultiPlayStartup();
//          game.displayBoardFromMain(); 
//    }
//
//        public void displayBoardFromMain(){
//            SwingUtilities.invokeLater(() -> {
//
//            MultiPlayFrame displayBoard = new MultiPlayFrame();
//            displayBoard.setVisible(true);
//        });
//    }
//        }
   import javax.swing.SwingUtilities;

public class MultiPlayStartup {
    private String username1;

    public MultiPlayStartup(String username1) {
        this.username1 = username1;
    }

    public void displayBoardFromMain() {
        SwingUtilities.invokeLater(() -> {
        	MultiPlayFrame Frame = new MultiPlayFrame(username1); // Pass the username to BotFrame's constructor
            Frame.setVisible(true);
        });
    }
} 