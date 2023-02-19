import javax.swing.*;
import java.awt.event.*;

public class External_listener extends JFrame{

    private JLabel label1;
    private JLabel label2;
    private JButton button1;
    private JButton button2;
    private JPanel panel;

    public External_listener(){

        label1 = new JLabel("Button one: 0 times");
        label2 = new JLabel("Button two: 0 times");
        button1 = new JButton("button one");
        button2 = new JButton("button two");
        panel = new JPanel();
        panel.add(label1);
        panel.add(button1);
        panel.add(label2);
        panel.add(button2);
        add(panel);

        External_action_listener button1_listener = new External_action_listener(label1);
        External_action_listener button2_listener = new External_action_listener(label2);

        button1.addActionListener(button1_listener);
        button2.addActionListener(button2_listener);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("interactive window");
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args){

        External_listener window = new External_listener();
    }
}

class External_action_listener implements ActionListener{

    private int num_times;
    private JLabel label;

    public External_action_listener(JLabel label){

            num_times = 0;
            this.label = label;
    }

    public void actionPerformed(ActionEvent event){

            num_times++;
            JButton button = (JButton)event.getSource();
            label.setText(button.getText() + ": " + num_times + " times");
    }
}

