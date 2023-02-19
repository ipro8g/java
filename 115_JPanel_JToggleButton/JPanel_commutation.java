import javax.swing.*;
import java.awt.event.*;

public class JPanel_commutation extends JPanel{

    private final double exchange_rate = 166.386;
    private double exchange_cash = exchange_rate;
    private JTextField quant_field;
    private JTextField result_field;
    
    public JPanel_commutation(){

        add(new JLabel("quantity"));
        quant_field = new JTextField("0,0", 6);
        add(quant_field);
        add(new JLabel("result"));
        result_field = new JTextField("0,0", 6);
        result_field.setEditable(false);
        add(result_field);
        JToggleButton currency = new JToggleButton("euro to spain", false);
        add(currency);
        currency.addActionListener(new Listener_button());
        JButton change = new JButton("change");
        add(change);
        change.addActionListener(new Listener_change());
    }

    class Listener_change implements ActionListener{

        public void actionPerformed(ActionEvent event){
            
            double money = Double.parseDouble(quant_field.getText());
            money = money * exchange_cash;
            String str = String.format("%6.2f", money);
            result_field.setText(str);
            }
    }

    class Listener_button implements ActionListener{
        
        public void actionPerformed(ActionEvent event){

            JToggleButton button = (JToggleButton)event.getSource();

            if(button.isSelected()){
                
                button.setText("spain to euro");
                exchange_cash = 1 / exchange_rate;
            }else{
                button.setText("euro to spain");
                exchange_cash = exchange_rate;
            }

        }
    }

    public static void main(String[] args){

        JFrame window = new JFrame("compute currency exchange");
        JPanel_commutation Obj = new JPanel_commutation();
        window.add(Obj);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400,100);
        window.setVisible(true);
    }
}
