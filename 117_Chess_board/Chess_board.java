import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Chess_board extends JPanel{

    public Chess_board(int size){
    
        JButton[][] buttons;
        buttons = new JButton[size][size];
        Listener_action listener = new Listener_action(this);
        
        for(int i = 0; i < buttons.length; i++){
            
            for(int j = 0; j < buttons[i].length; j++){

                buttons[i][j] = new JButton();
                buttons[i][j].setPreferredSize(new Dimension(50,50));

                if(((i + j + 1) % 2) == 0){

                    buttons[i][j].setBackground(Color.BLACK);
                }

                buttons[i][j].addActionListener(listener);
                add(buttons[i][j]);
            }

        }

            setLayout(new GridLayout(size,size));
        }

        class Listener_action implements ActionListener{

            private JPanel panel;
            public Listener_action(JPanel panel){
            
                this.panel = panel;
            }

            public void actionPerformed(ActionEvent event){

                JButton button = (JButton)event.getSource();
                String color = "white";

                if(button.getBackground() == Color.BLACK){
    
                    color = "black";
                }

                JOptionPane.showMessageDialog(

                    panel, "a color square has been pressed " + color,
                    "square pressed",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
        }

        public static void main(String[] args){

            JFrame window = new JFrame("board");
            Chess_board board = new Chess_board(8);
            window.add(board);
            window.pack();
            window.setVisible(true);
        }
}
