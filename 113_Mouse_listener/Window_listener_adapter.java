import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Window_listener_adapter extends JFrame{

    private JTextArea text_area;
    public Window_listener_adapter(){

        JButton button = new JButton("clean");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        text_area = new JTextArea(12,30);
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(text_area);
        add(panel);
        ActionListener Listener_button = new Listener_action();
        button.addActionListener(Listener_button);
        MouseListener Listener_mouse = new Listener_mouse();
        text_area.addMouseListener(Listener_mouse);
    }

    class Listener_mouse extends MouseInputAdapter{

        public void mouseClicked(MouseEvent e){

            text_area.append("click happens\n");
            text_area.append("X: " + e.getX());
            text_area.append("\nY: " + e.getY());
        }

        public void mousePressed(MouseEvent e){
    
            if((e.getModifiers() & InputEvent.BUTTON3_MASK) != 0){
                
                text_area.append("button pressed was the right one\n");
            }

            text_area.append("a mouse button has been pressed\n");
        }

        public void mouseReleased(MouseEvent e){

            text_area.append("a mouse button has been released\n");
        }

        public void mouseEntered(MouseEvent e){

            text_area.append("the mouse has entered in the component\n");
        }

        public void mouseExited(MouseEvent e){

            text_area.append("the mouse has left the component\n");
        }
    }

    class Listener_action implements ActionListener{

            public void actionPerformed(ActionEvent event){
                
                text_area.setText("");
            }
    }

    public static void main(String[] args){

        Window_listener_adapter window = new Window_listener_adapter();
        window.setTitle("mouse events");
        window.pack();
        window.setVisible(true);
    }
}
