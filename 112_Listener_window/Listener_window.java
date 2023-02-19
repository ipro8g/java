import javax.swing.*;
import java.awt.event.*;

public class Listener_window extends JFrame implements WindowListener{

    private JTextArea text_area;
    private JLabel label;
    private JPanel panel;
    private final String end = "\n";

    public Listener_window(){

        label = new JLabel("events");
        text_area = new JTextArea(10,30);
        text_area.setText("initial text area");
        panel = new JPanel();

        panel.add(label);
        panel.add(text_area);
        add(panel);
        addWindowListener(this);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("listener window");
        setVisible(true);
        pack();
    }

    public void windowOpened(WindowEvent e){
        
        text_area.append(end + "window open");
    }

    public void windowClosing(WindowEvent e){
        
        text_area.append(end + "window closing");
    }

    public void windowClosed(WindowEvent e){
        
        text_area.append(end + "window closed");
    }

    public void windowIconified(WindowEvent e){
        
        text_area.append(end + "window iconified");
    }

    public void windowDeiconified(WindowEvent e){
        
        text_area.append(end + "window deiconified");
    }

    public void windowActivated(WindowEvent e){
        
        text_area.append(end + "window activated");
    }

    public void windowDeactivated(WindowEvent e){
        
        text_area.append(end + "window deactivated");
    }

    public static void main(String[] args){
    
        Listener_window window = new Listener_window();
    }
}
