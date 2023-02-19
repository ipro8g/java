import javax.swing.*;
import java.awt.*;
import javax.swing.text.*;
import java.text.*;
import javax.swing.border.*;
import java.awt.event.*;
import javax.swing.event.*;

enum Enum_type {MINI, UTIL, FAMILY, SPORT};
enum Inssurance {THIRD, RISKY};

class Car{

    String model;
    String color;
    boolean metalized;
    String id;
    Car_type Type;
    int year;
    Inssurance ins;
}

public class Car_data extends JPanel{

    JTextField Model_field;
    JTextField Color_field;
    JCheckBox Is_metalized;
    JTextField Id_field;
    JComboBox Car_type;
    JFormattedTextField Year_field;
    JRadioButton Risky;
    JRadioButton Third;

    public Car_data(){

        setLayout(new GridLayout(7,2));
        JLabel Model = new JLabel("Model: ", JLabel.RIGHT);
        Model_field = new JTextField();
        add(Model);
        add(Model_field);

        JLabel Color = new JLabel("Color: ", JLabel.RIGHT);
        Color_field = new JTextField();
        add(Color);
        add(Color_field);

        JLabel Id = new JLabel("Id: ", JLabel.RIGHT);
        Id_field = new JTextField();
        add(Id);
        add(Id_field);

        ButtonGroup Buttons_group = new ButtonGroup();
        Risky = new JRadioButton("risky", true);
        Risky.setMnemonic(KeyEvent.VK_R);
        Third = new JRadioButton("third");
        Third.setMnemonic(KeyEvent.VK_T);
        Buttons_group.add(Risky);
        Buttons_group.add(Third);
        add(Risky);
        add(Third);

        JLabel Year = new JLabel("manufacture year: ", JLabel.RIGHT);
        MaskFormatter Format = null;

        try{

            Format = new MaskFormatter("####");
        }catch(ParseException e){

            //do nothing
        }

        Year_field = new JFormattedTextField(Format);
        add(Year);
        add(Year_field);

        JLabel Type = new JLabel("car type: ", JLabel.RIGHT);
        Car_type = new JComboBox(Enum_type.values());
        add(Type);
        add(Car_type);

        JLabel Paint = new JLabel("paint type: ", JLabel.RIGHT);
        Is_metalized = new JCheckBox("metalized", false);
        add(Paint);
        add(Is_metalized);

        TitledBorder Title;
        Title = BorderFactory.createTitledBorder("car data");
        setBorder(Title);
    }

    public static void main(String[] args){

        JFrame Window = new JFrame("data panel");
        Window.add(new Car_data());
        Window.pack();
        Window.setVisible(true);
        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
