import javax.swing.SwingUtilities;


public class MultiPlayStartup{
    public static void main(String args[]){
    	MultiPlayStartup game = new MultiPlayStartup();
          game.displayBoardFromMain(); 
    }

        public void displayBoardFromMain(){
            SwingUtilities.invokeLater(() -> {

            MultiPlayFrame displayBoard = new MultiPlayFrame();
            displayBoard.setVisible(true);
        });
    }
        }
    