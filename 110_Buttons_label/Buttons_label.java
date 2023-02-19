import javax.swing.*;
import java.awt.event.*;

public class Buttons_label extends JFrame{

    private JLabel label;
    private JButton button1;
    private JButton button2;
    private JPanel panel;

    public Buttons_label(){
        
        label = new JLabel("no enoguh button pressed");
        button1 = new JButton("button one");
        button2 = new JButton("button two");
        panel = new JPanel();
        panel.add(label);
        panel.add(button1);
        panel.add(button2);
        add(panel);
        ActionListen listener_button = new ActionListen();
        button1.addActionListener(listener_button);
        button2.addActionListener(listener_button);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("interaccion window");
        pack();
        setVisible(true);
    }

    public static void main(String[] args){

        Buttons_label window = new Buttons_label();
    }

    class ActionListen implements ActionListener{

        public void actionPerformed(ActionEvent event){

            JButton button = (JButton)event.getSource();
            label.setText("Button pressed: " + button.getText());
        }
    }
}


