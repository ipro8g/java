import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.border.*;

public class Shared_model extends JFrame{

    public Shared_model(){

        JTextArea Text_area1, Text_area2;
        Document Docu;
        Text_area1 = new JTextArea(10,100);
        Docu = Text_area1.getDocument();
        Text_area2 = new JTextArea(Docu);
        Text_area2.setColumns(100);
        Text_area2.setRows(10);
        TitledBorder Title1;
        Title1 = BorderFactory.createTitledBorder("text area");
        Text_area1.setBorder(Title1);
        TitledBorder Title2;
        Title2 = BorderFactory.createTitledBorder("text area 2");
        Text_area2.setBorder(Title2);
        JPanel Panel = new JPanel();
        Panel.setLayout(new BoxLayout(Panel, BoxLayout.PAGE_AXIS));
        Panel.add(new JScrollPane(Text_area1));
        Panel.add(Box.createVerticalStrut(20));
        Panel.add(new JScrollPane(Text_area2));
        add(Panel);
        }

        public static void main(String[] args){

            Shared_model App = new Shared_model();
            App.setTitle("test shared model");
            App.setSize(500,300);
            App.setVisible(true);
            App.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}
