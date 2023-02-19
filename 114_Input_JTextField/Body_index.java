import javax.swing.*;
import java.awt.event.*;

public class Body_index extends JFrame{
    
    private JTextField height_field;
    private JTextField weight_field;
    private JTextField index_field;

    public Body_index(){
        
        JLabel height_label = new JLabel("height(meters)");
        JLabel weight_label = new JLabel("weight(kg)");
        JLabel index_label = new JLabel("body weight index");
        JButton compute = new JButton("compute index");
        height_field = new JTextField(6);
        weight_field = new JTextField(6);
        index_field = new JTextField(6);
        index_field.setEditable(false);
        JPanel panel = new JPanel();
        
        panel.add(height_label);
        panel.add(height_field);
        panel.add(weight_label);
        panel.add(weight_field);
        panel.add(compute);        
        panel.add(index_label);
        panel.add(index_field);
        add(panel);

        compute.addActionListener(

            new ActionListener(){

                public void actionPerformed(ActionEvent event){

                    double weight = Double.parseDouble(weight_field.getText());
                    double height = Double.parseDouble(height_field.getText());
                    double index = weight / (height * height);
                    String str = String.format("%6.2f", index);
                    index_field.setText(str);
                }
            }
        );
    }

    public static void main(String[] args){

        Body_index window = new Body_index();
        window.setTitle("body weight index");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400,100);
        window.setVisible(true);
    }
}
