import javax.swing.*;
import java.awt.*;
import javax.swing.text.*;
import java.text.*;
import javax.swing.border.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;

enum Enum_type {

    MINI, UTIL, FAMILY, SPORT;

    public static Enum_type get_type(String str){

        return Enum.valueOf(Enum_type.class, str.toUpperCase());
    }        
}


enum Inssurance {THIRD, RISKY};

class Car{

    String model;
    String color;
    boolean is_metalized;
    String id;
    Enum_type Type;
    int year;
    Inssurance Ins;

    public Car(String model, String color, boolean is_metalized, String id, Enum_type Type, int year, Inssurance Ins){

        this.model = model;
        this.color = color;
        this.is_metalized = is_metalized;
        this.id = id;
        this.Type = Type;
        this.year = year;
        this.Ins = Ins;
    }

    public String toString(){

        Formatter Format = new Formatter();
        Format.format(" - %10s - %8s - %5d - %6s - %7s - metalized: %5b - %8s",
            model, color, year, Type, id, is_metalized, Ins);
        return Format.toString();
    }
}

class Application{

        public java.util.List<Car> List;

        public Application(){

            List = new ArrayList<Car>();
        }

        public void add_car(Car Car_ob){

            List.add(Car_ob);
        }

        public java.util.List<Car> get_list(){

            return List;
        }
}

class Graphic_interface extends JFrame{

        private Application App;
        private JButton Add;
        private JButton View;
        private DefaultListModel List_model;

        View_listener V_listener;

        public Graphic_interface(Application App){

            this.App = App;
            V_listener = new View_listener();
            JPanel Panel = new JPanel();
            Panel.setLayout(new BoxLayout(Panel, BoxLayout.PAGE_AXIS));
            Border Border_ob = BorderFactory.createEmptyBorder(10, 10, 10, 10);
            TitledBorder Title = BorderFactory.createTitledBorder(Border_ob, "car list", TitledBorder.CENTER, TitledBorder.TOP);
            Panel.setBorder(Title);
            List_model = new DefaultListModel();
            JList List = new JList(List_model);
            Panel.add(new JScrollPane(List));

            this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
            add(Panel);
            add(Buttons_panel());

            setJMenuBar(Create_menu());
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("car management");
            setSize(300, 250);
            setVisible(true); 
        }

        private JPanel Buttons_panel(){

            JPanel Panel = new JPanel();
            Panel.setLayout(new BoxLayout(Panel, BoxLayout.LINE_AXIS));
            Panel.setBorder(new EmptyBorder(0, 10, 10, 10));
            Add = new JButton("add");
            Add.addActionListener(new New_listener());
            View = new JButton("view");
            View.addActionListener(new View_listener());
            Panel.add(Box.createHorizontalGlue());
            Panel.add(Add);
            Panel.add(Box.createRigidArea(new Dimension(10, 0)));
            Panel.add(View);
            return Panel;
        }

        private JMenuBar Create_menu(){
        
            JMenuBar Bar_menu = new JMenuBar();
            JMenu Op_menu = new JMenu("operations");
            JMenuItem List = new JMenuItem("car list");
            List.addActionListener(V_listener);
            Op_menu.add(List);
            Op_menu.add(new JSeparator());
            JMenuItem Exit = new JMenuItem("exit");
            Exit.addActionListener(new ActionListener(){
                
                public void actionPerformed(ActionEvent e){

                    System.exit(0);
                }
            });
    
            Op_menu.add(Exit);
            Bar_menu.add(Op_menu);
            return Bar_menu;
        }

        class View_listener implements ActionListener{

            public void actionPerformed(ActionEvent Event){

            List_model.clear();
            Iterator It = App.get_list().listIterator();

                while(It.hasNext()){

                    List_model.addElement(It.next());
                }
            }
        }

class New_listener implements ActionListener{

        public void actionPerformed(ActionEvent Event){

            boolean error = false;
            Car_data Panel = new Car_data();

            if(JOptionPane.showConfirmDialog(Graphic_interface.this, Panel, "enter data", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE) == JOptionPane.OK_OPTION){

                String model = Panel.Model_field.getText();
                String color = Panel.Color_field.getText();
                boolean is_metalized = Panel.Is_metalized.isSelected();
                String id = Panel.Id_field.getText();
                Enum_type Type = Enum_type.get_type(Panel.Car_type.getSelectedItem().toString());
                int year = 0;

                try{

                    year = Integer.parseInt(Panel.Year_field.getText());
                }catch(NumberFormatException e){

                    error = true;
                    JOptionPane.showMessageDialog(null,
                    "<html><u>Year with 4 digits XXXX",
                    "error",
                    JOptionPane.ERROR_MESSAGE);
                }

                error = error || (model.length() == 0) || (color.length() == 0) || (id.length() == 0);

                if(error){

                    JOptionPane.showMessageDialog(null,
                    "<html>error type" + 
                    "<p color = 'red'>empty field" + 
                    "<em> must fill all",
                    "error",
                    JOptionPane.ERROR_MESSAGE);

                    Inssurance Ins;

                    if(Panel.Risky.isSelected()){

                        Ins = Inssurance.RISKY;
                    }else{

                        Ins = Inssurance.THIRD;
                    }

                    if(!error){

                        Car Car_ob = new Car(model, color, is_metalized, id, Type, year, Ins);
                        App.add_car(Car_ob);
                    }
                }else{

                    JOptionPane.showMessageDialog(null,
                    "aborted",
                    "message",
                    JOptionPane.WARNING_MESSAGE);
                }

            }
        }
    }
}

class Car_data extends JPanel{

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

public class Run_application{

    public static void main(String args[]){

            Application App_ob = new Application();
            Graphic_interface Window = new Graphic_interface(App_ob);
    }
}
