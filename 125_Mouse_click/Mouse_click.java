import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Mouse_click extends JButton{

    static final int num = 5;
    int xcenter;
    int ycenter;

    public Mouse_click(){

        this.setBackground(Color.cyan);
        this.setPreferredSize(new Dimension(250,250));

        this.addMouseListener(new MouseInputAdapter(){

            public void mousePressed(MouseEvent e){

                int x = e.getX();
                int y = e.getY();
                String msg = "fail to hit center";

                if(((Math.abs(x-xcenter)) < (xcenter / num)) && ((Math.abs(y-ycenter)) < (ycenter / num))){

            msg = "jackpot!";
    }

            JOptionPane.showMessageDialog(Mouse_click.this, msg, "mouse click done", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public void paintComponent(Graphics g){

        super.paintComponent(g); // background color
        int height = getSize().height;
        int width = getSize().width;
        xcenter = width / 2;
        ycenter = height / 2;

        for(int i = num; i > 0; i--){

            if(i % 2 == 2){

                g.setColor(Color.green);
            }else{

                g.setColor(Color.blue);
            }

            if(i == 1){
    
                g.setColor(Color.red);
            }
    
            int xradio = i * xcenter / num;
            int yradio = i * ycenter / num;

            g.fillOval(xcenter-xradio, ycenter-yradio, 2 * xradio, 2 * yradio);
        }

        g.setColor(Color.black);
        g.drawLine(0,0,width,height);
        g.drawLine(0,height,width,0);
    }

    public static void main(String args[]){

        JFrame Window = new JFrame("mouse click");
        Mouse_click Target = new Mouse_click();
        Window.add(Target);
        JLabel Label = new JLabel("click in the target", JLabel.CENTER);
        Window.add(Label, BorderLayout.NORTH);
        Window.pack();
        Window.setVisible(true);
        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
