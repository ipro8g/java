import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.Scanner;

public class Text_stats extends JFrame{

    private JTextArea Text_area;
    private JCheckBox Lines_box;
    private JCheckBox Words_box;
    private JCheckBox Chars_box;
    private JEditorPane Edit_panel;

    public Text_stats(){

        JButton Compute = new JButton("compute");
        Compute.addActionListener(new Compute_listener());
        JButton Clean = new JButton("<html>clean this <br>text area");
        Clean.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent Event){
            
                Text_area.setText("");
                Edit_panel.setText("");
            }
        });

        JPanel Panel = new JPanel();
        Panel.add(Elect_panel());
        Panel.add(Compute);
        Panel.add(Clean);
        add(Panel, BorderLayout.NORTH);
        add(Text_panel(), BorderLayout.CENTER);
        add(Edit_panel(), BorderLayout.SOUTH);
    }
    
    private JScrollPane Text_panel(){
   
        Text_area = new JTextArea(10,50);
        JScrollPane Scroll_panel = new JScrollPane(Text_area);
        Scroll_panel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        Scroll_panel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        TitledBorder Title;
        Title = BorderFactory.createTitledBorder("text to compute");
        Scroll_panel.setBorder(Title);
        return Scroll_panel;
    }

    private JPanel Elect_panel(){

        JPanel Panel = new JPanel();
        Chars_box = new JCheckBox("chars", true);
        Words_box = new JCheckBox("words");
        Lines_box = new JCheckBox("lines");
        Panel.add(Chars_box);
        Panel.add(Words_box);
        Panel.add(Lines_box);
        TitledBorder Title;
        Title = BorderFactory.createTitledBorder("data required");
        Panel.setBorder(Title);
        return Panel;
    }

    private JEditorPane Edit_panel(){

        Edit_panel = new JEditorPane();
        Edit_panel.setEditable(false);
        Edit_panel.setContentType("text/html");
        Edit_panel.setPreferredSize(new Dimension(200,125));
        Edit_panel.setMinimumSize(new Dimension(10,10));
        TitledBorder Title;
        Title = BorderFactory.createTitledBorder("results (html text)");
        Edit_panel.setBorder(Title);
        return Edit_panel;
    }

    private int compute_chars(String str){

        return str.length();
    }

    private int compute_words(String str){

        Scanner Scan = new Scanner(str);
        int words = 0;

        while(Scan.hasNext()){

            Scan.next();
            words++;
        }

        return words;
    }

    private int compute_lines(String str){

        Scanner Scan = new Scanner(str);
        int lines = 0;

        while(Scan.hasNextLine()){

            Scan.nextLine();
            lines++;
        }

        return lines;
    }

    class Compute_listener implements ActionListener{

        public void actionPerformed(ActionEvent Event){

            String text = Text_area.getText();
            StringBuffer Result = new StringBuffer("<html>");

            if(Chars_box.isSelected()){

                Result.append("<strong>Chars: </strong>");
                Result.append("<em>" + compute_chars(text) + "</em><br>");
            }

            if(Words_box.isSelected()){

                Result.append("<strong>Words: </strong>");
                Result.append("<em>" + compute_words(text) + "</em><br>");
            }

            if(Lines_box.isSelected()){

                Result.append("<strong>Lines: </strong>");
                Result.append("<em>" + compute_lines(text) + "</em><br>");
            }

            Edit_panel.setText(Result.toString() + "</html>");
        }
    }

    public static void main(String args[]){

        Text_stats App = new Text_stats();
        App.setTitle("text stats");
        App.pack();
        App.setVisible(true);
        App.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
