import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Card_layout extends JFrame{

    final static String simple_box = "simple boxlayout";
    final static String glue_box = "glue boxlayout";
    final static String strut_box = "strut boxlayout";
    private CardLayout Card_manager;
    private JPanel Card_panel;
    private JLabel Label;

    Card_layout(){

        Label = new JLabel(simple_box);
        add(Label, BorderLayout.NORTH);
        Card_panel = new JPanel();
        Card_manager = new CardLayout();
        Card_panel.setLayout(Card_manager);
        add(Card_panel, BorderLayout.CENTER);
        add(Buttons_panel(), BorderLayout.SOUTH);

        Card_panel.add(PanelBox(), simple_box);
        Card_panel.add(GluePanelBox(), glue_box);
        Card_panel.add(StrutPanelBox(), strut_box);

        setTitle("boxlayout, cardlayout tests");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private JPanel Buttons_panel(){

        JPanel Panel = new JPanel();
        Listener_button Listener = new Listener_button();
        JButton Simple_button = new JButton(simple_box);
        Simple_button.addActionListener(Listener);
        Panel.add(Simple_button);
        JButton Glue_button = new JButton(glue_box);
        Glue_button.addActionListener(Listener);
        Panel.add(Glue_button);
        JButton Strut_button = new JButton(strut_box);
        Strut_button.addActionListener(Listener);
        Panel.add(Strut_button);
        return Panel;
    }

    private JPanel GluePanelBox(){

        JPanel Panel = new JPanel();
        Panel.setLayout(new BoxLayout(Panel, BoxLayout.PAGE_AXIS));
        Panel.add(new JButton("button 1"));
        Panel.add(Box.createGlue());
        Panel.add(new JButton("button 2"));
        Panel.add(Box.createGlue());
        Panel.add(new JButton("button 3"));
        Panel.add(Box.createGlue());
        Panel.add(new JButton("button 4"));
        Panel.add(Box.createGlue());
        Panel.add(new JButton("button 5"));
        return Panel;
    }

    private JPanel PanelBox(){

        JPanel Panel = new JPanel();
        Panel.setLayout(new BoxLayout(Panel, BoxLayout.LINE_AXIS));
        Panel.add(new JButton("button 1"));
        Panel.add(new JButton("button 2"));
        Panel.add(new JButton("button 3"));
        Panel.add(new JButton("button 4"));
        Panel.add(new JButton("button 5"));
        return Panel;
    }

    private JPanel StrutPanelBox(){

        JPanel Panel = new JPanel();
        Panel.setLayout(new BoxLayout(Panel, BoxLayout.LINE_AXIS));
        Panel.add(new JButton("button 1"));
        Panel.add(new JButton("button 2"));
        Panel.add(new JButton("button 3"));
        Panel.add(Box.createHorizontalStrut(10));
        Panel.add(new JButton("button 4"));
        Panel.add(new JButton("button 5"));
        return Panel;
    }

    class Listener_button implements ActionListener{

        public void actionPerformed(ActionEvent Event){

            JButton Button = (JButton)Event.getSource();
            Label.setText(Button.getText());
            Card_manager.show(Card_panel, Button.getText());
        }
    }

    public static void main(String args[]){

        Card_layout Window = new Card_layout();
        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
