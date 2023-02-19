import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Layouts extends JFrame{

    JPanel buttons_panel;
    public Layouts(){
    
        buttons_panel = create_buttons_panel();
        add(buttons_panel, BorderLayout.CENTER);
        JPanel direction_panel = create_direction_panel();
        add(direction_panel, BorderLayout.PAGE_START);
        JPanel align_panel = create_align_panel();
        add(align_panel, BorderLayout.PAGE_END);
        setTitle("FlowLayout: alignment and direction");
        setSize(500,200);
        setVisible(true);
    }

    private JPanel create_buttons_panel(){

        JPanel buttons_panel = new JPanel();
        JButton buttons[] = new JButton[8];

        for(int i = 0; i < buttons.length; i++){

            buttons[i] = new JButton("Button " + i);
            buttons_panel.add(buttons[i]);
        }

        return buttons_panel;
    }

    private JPanel create_direction_panel(){

        JPanel panel = new JPanel();
        Listener_direction listener = new Listener_direction();
        ButtonGroup direction_group = new ButtonGroup();
        panel.add(new JLabel("direction: "));
        panel.add(create_radio_button(direction_group, "LEFT_TO_RIGHT", listener));
        panel.add(create_radio_button(direction_group, "RIGHT_TO_LEFT", listener));
        return panel;
    }

    private JPanel create_align_panel(){

        JPanel panel = new JPanel();
        Listener_align listener = new Listener_align();
        ButtonGroup align_group = new ButtonGroup();
        panel.add(new JLabel("alignment: "));
        panel.add(create_radio_button(align_group, "LEFT", listener));
        panel.add(create_radio_button(align_group, "CENTER", listener));
        panel.add(create_radio_button(align_group, "RIGHT", listener));
        panel.add(create_radio_button(align_group, "LEADING", listener));
        panel.add(create_radio_button(align_group, "TRAILING", listener));
        return panel;
    }

    private JRadioButton create_radio_button(ButtonGroup group, String label, ActionListener listener){
            JRadioButton button = new JRadioButton(label);
            button.addActionListener(listener);
            group.add(button);
            return button;
        }

        class Listener_direction implements ActionListener{

            public void actionPerformed(ActionEvent event){

                JRadioButton button = (JRadioButton)event.getSource();

                if("LEFT_TO_RIGHT".equals(button.getActionCommand())){

                    buttons_panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
                }else{
                    buttons_panel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                }

                buttons_panel.doLayout();
                }
        }

        class Listener_align implements ActionListener{

            public void actionPerformed(ActionEvent event){

                JRadioButton button = (JRadioButton)event.getSource();
                FlowLayout layout = (FlowLayout)buttons_panel.getLayout();

                if("LEFT".equals(button.getActionCommand())){

                    layout.setAlignment(FlowLayout.LEFT);
                }else if("CENTER".equals(button.getActionCommand())){

                    layout.setAlignment(FlowLayout.CENTER);
                }else if("RIGHT".equals(button.getActionCommand())){

                    layout.setAlignment(FlowLayout.RIGHT);            
                }else if("LEADING".equals(button.getActionCommand())){

                    layout.setAlignment(FlowLayout.LEADING);
                }else{

                    layout.setAlignment(FlowLayout.TRAILING);
                }
    
                buttons_panel.doLayout();
            }
        }

        public static void main(String[] args){

            Layouts window = new Layouts();
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        
}
