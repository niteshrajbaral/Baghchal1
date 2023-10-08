package click;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class extendJFrame implements ActionListener {
    private JTextField textField1, textField2;

    public TextFieldEnterTraversal(){
        setTitle("Text Field Enter Traversal");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textField1 = new JTextField(20);
        textField2 = new JTextField(20);

        // Add key listener to the first text field
        textField1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    // Move focus to the second text field on Enter key
                    textField2.requestFocus();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        // Add action listener to the second text field
        textField2.addActionListener(this);

        setLayout(new FlowLayout());
        add(new JLabel("Text Field 1:"));
        add(textField1);
        add(new JLabel("Text Field 2:"));
        add(textField2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // When Enter is pressed in the second text field, do something
        JOptionPane.showMessageDialog(this, "Enter key pressed in Text Field 2");
    }

    //public static void main(String[] args) {
       // SwingUtilities.invokeLater(() -> {
          //  TextFieldEnterTraversal example = new TextFieldEnterTraversal();
            //example.setVisible(true);
      //  });
   // }
}

