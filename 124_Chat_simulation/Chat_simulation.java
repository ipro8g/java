import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.border.*;

public class Chat_simulation{

    final int width = 40;
    String id;
    boolean identified;
    JTextArea Text_area;
    JTextField Text_field;
    JFrame Window;

    public Chat_simulation(Document Docu, String id){

        identified = false;
        this.id = id;
        Window = new JFrame("simulation chat: " + id);
        Window.setJMenuBar(create_menu());
        Text_area = new JTextArea(Docu);
        Text_area.setColumns(width);
        Text_area.setRows(15);
        Text_area.setBorder(BorderFactory.createTitledBorder("chat"));
        Text_listener listener = new Text_listener(this);
        JPanel Panel = new JPanel();
        Text_field = new JTextField(width);
        Text_field.setBorder(BorderFactory.createTitledBorder("message"));
        Text_field.addActionListener(listener);
        JButton Send = new JButton("send");
        Send.addActionListener(listener);
        Panel.add(Text_field);
        Panel.add(Send);
        Container Content_panel = Window.getContentPane();
        Content_panel.setLayout(new BoxLayout(Content_panel, BoxLayout.PAGE_AXIS));
        Content_panel.add(new JScrollPane(Text_area));
        Content_panel.add(Box.createGlue());
        Content_panel.add(Panel);
        Content_panel.add(Box.createGlue());
        Window.pack();
        Window.setVisible(true);
    }

    public Chat_simulation(String id){

        this(null, id);
    }

    private JMenuBar create_menu(){

        JMenuBar Menu_bar = new JMenuBar();
        JMenu Ops = new JMenu("operations");
        Ops.setMnemonic(KeyEvent.VK_O);
        JMenuItem Del = new JMenuItem("delete chat", KeyEvent.VK_B);
        JMenuItem Send = new JMenuItem("send message", KeyEvent.VK_E);
        JMenuItem Exit = new JMenuItem("exit", KeyEvent.VK_S);
        Ops.add(Del);
        Ops.add(Send);
        Ops.add(new JSeparator());
        Ops.add(Exit);

        Del.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){

                Text_area.setText("");
            }
        });
        
        Send.addActionListener(new Text_listener(this));
        
        Exit.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){

                System.exit(0);
            }
        });

        JMenu Sett = new JMenu("settings");
        Sett.setMnemonic(KeyEvent.VK_C);
        JMenu Id = new JMenu("id");
        ButtonGroup Id_group = new ButtonGroup();
        JRadioButtonMenuItem Anom = new JRadioButtonMenuItem("anonymous", true);
        JRadioButtonMenuItem Identified = new JRadioButtonMenuItem("identified");
        Anom.addActionListener(new Id_listener());
        Identified.addActionListener(new Id_listener());
        Id_group.add(Anom);
        Id_group.add(Identified);
        Id.add(Anom);
        Id.add(Identified);
        JMenuItem About = new JMenuItem("about", KeyEvent.VK_A);
        About.addActionListener(new About_listener());
        Sett.add(Id);
        Sett.add(new JSeparator());
        Sett.add(About);
        Menu_bar.add(Ops);
        Menu_bar.add(Sett);
        return Menu_bar;        
    }

    public Document return_document(){

        return Text_area.getDocument();
    }

    class About_listener implements ActionListener{

        public void actionPerformed(ActionEvent e){

            JOptionPane.showMessageDialog(null,

                "look at book\n" +
                "Java 2: initialization. MC-Graw-Hill",
                "about this program",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }

    class Id_listener implements ActionListener{

        public void actionPerformed(ActionEvent e){

            JRadioButtonMenuItem Button = (JRadioButtonMenuItem)e.getSource();

            if("anonymous".equals(Button.getText())){

                identified = false;
            }else{

                identified = true;
            }
        }
    }

    public static void main(String args[]){

        Chat_simulation App = new Chat_simulation("test");
    }
}


class Text_listener implements ActionListener{

        Chat_simulation App;
        public Text_listener(Chat_simulation App){

            this.App = App;
        }

        public void actionPerformed(ActionEvent Event){

            JTextArea Text_area = App.Text_area;

        if(App.identified){

            Text_area.append(App.id + " > ");
        }

        Text_area.append(App.Text_field.getText() + "\n");
        App.Text_field.setText("");

        }
    }

class Server{

        public static void main(String args[]){

            Chat_simulation Client1 = new Chat_simulation("client 1");
            Document Docu = Client1.return_document();
            Chat_simulation Client2 = new Chat_simulation(Docu, "client 2");
            Chat_simulation Client3 = new Chat_simulation(Docu, "client 3");
        }
    }
