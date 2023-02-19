import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Border_layout extends JFrame{

    JPanel Regions_buttons_panel;
    JPanel Related_buttons_panel;
    JTextField Text_field;

    public Border_layout(){

        add(Create_orientation_panel(), BorderLayout.NORTH);
        Regions_buttons_panel = Create_regions_panel();
        add(Regions_buttons_panel, BorderLayout.EAST);
        Related_buttons_panel = Create_related_position_panel();
        add(Related_buttons_panel, BorderLayout.WEST);
        Text_field = new JTextField();
        add(Text_field, BorderLayout.SOUTH);
    }

    private JPanel Create_regions_panel(){

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        Listener_button listener = new Listener_button();
        panel.add(Create_button("Button one CENTER", listener), BorderLayout.CENTER);
        panel.add(Create_button("Button two NORTH", listener), BorderLayout.NORTH);
        panel.add(Create_button("Button three SOUTH", listener), BorderLayout.SOUTH);
        panel.add(Create_button("Button four EAST", listener), BorderLayout.EAST);
        panel.add(Create_button("Button five WEST", listener), BorderLayout.WEST);
        return panel;
    }

    private JPanel Create_related_position_panel(){

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        Listener_button Listener = new Listener_button();
        panel.add(Create_button("Button one CENTER", Listener), BorderLayout.CENTER);
        panel.add(Create_button("Button two PAGE_START", Listener), BorderLayout.PAGE_START);
        panel.add(Create_button("Button three PAGE_END", Listener), BorderLayout.PAGE_END);
        panel.add(Create_button("Button four LINE_END", Listener), BorderLayout.LINE_END);
        panel.add(Create_button("Button five LINE_START", Listener), BorderLayout.LINE_START);
        return panel;
    }

    private JPanel Create_orientation_panel(){

        JPanel Panel = new JPanel();
        Orientation_listener Listener = new Orientation_listener();
        ButtonGroup Orientation_group = new ButtonGroup();
        Panel.add(new JLabel("Orientation: "));
        Panel.add(Create_radio_button(Orientation_group, "LEFT_TO_RIGHT", Listener));
        Panel.add(Create_radio_button(Orientation_group, "RIGHT_TO_LEFT", Listener));
        return Panel;
    }

    private JRadioButton Create_radio_button(ButtonGroup Group, String Label, ActionListener Listener){

        JRadioButton Button = new JRadioButton(Label);
        Button.addActionListener(Listener);
        Group.add(Button);
        return Button;
    }

    private JButton Create_button(String Label, ActionListener Listener){

        JButton Button = new JButton(Label);
        Button.addActionListener(Listener);
        return Button;
    }

    class Listener_button implements ActionListener{

        public void actionPerformed(ActionEvent Event){

            JButton Button = (JButton)Event.getSource();
            Text_field.setText("you have pressed: " + Button.getText());
        }
    }

    class Orientation_listener implements ActionListener{

        public void actionPerformed(ActionEvent Event){

            JRadioButton Button = (JRadioButton)Event.getSource();
            if("LEFT_TO_RIGHT".equals(Button.getActionCommand())){

                Regions_buttons_panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
Related_buttons_panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
            }else{

                Regions_buttons_panel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
Related_buttons_panel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
            }

            Regions_buttons_panel.doLayout();
            Related_buttons_panel.doLayout();
        }
    }

    public static void main(String args[]){

        Border_layout Window = new Border_layout();
        Window.setTitle("BorderLayout admin");
        Window.setSize(900,250);
        Window.setVisible(true);
        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
