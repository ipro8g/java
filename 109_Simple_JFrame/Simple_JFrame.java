import javax.swing.*;

public class Simple_JFrame extends JFrame{
    
    public Simple_JFrame(){
    
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("resizable window");
        add(label);
        setTitle("JFrame test");
        setResizable(true);
        pack();
        setVisible(true);
    }

    public static void main(String[] args){
    
        Simple_JFrame window = new Simple_JFrame();
    }
}
