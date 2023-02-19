import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Enhanced_commutator extends JPanel{

    private final double exchange_rate = 166.386;
    private double exchange_cash = exchange_rate;
    private JTextField quant_field;
    private JTextField result_field;

    public Enhanced_commutator(){

        add(new JLabel("quantity to convert"));
        quant_field = new JTextField("0.0", 6);
        add(quant_field);

        add(new JLabel("result"));
        result_field = new JTextField("0.0", 6);
        result_field.setEditable(false);
        add(result_field);

        JToggleButton currency = new JToggleButton("euro to spain", false);
        currency.setMnemonic(KeyEvent.VK_E);
        add(currency);

        currency.addChangeListener(new Listener_button());
        JButton change = new JButton("change");
        change.setMnemonic(KeyEvent.VK_C);
        add(change);

        change.addActionListener(new Listener_change());
        ImageIcon icon = new ImageIcon("cross.gif");
        JButton delete = new JButton("delete", icon);
        delete.setMnemonic(KeyEvent.VK_B);
        add(delete);

        delete.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ev){
                    delete_data();
                }
            }
        );
    }

    private void delete_data(){

        quant_field.setText("0.0");
        result_field.setText("0,0");
    }

    class Listener_change implements ActionListener{
        
        public void actionPerformed(ActionEvent event){
            
            double money = 0.0;

            try{

                money = Double.parseDouble(quant_field.getText());
            }catch(NumberFormatException exception){

                JOptionPane.showMessageDialog(Enhanced_commutator.this, "only digits and decimal numbers","numeric format error",JOptionPane.ERROR_MESSAGE);
                delete_data();
            }

            money = money * exchange_cash;
            String str = String.format("%6.2f", money);
            result_field.setText(str);
        }
    }

    class Listener_button implements ChangeListener{

        public void stateChanged(ChangeEvent event){

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

        JFrame window = new JFrame("ALT + B to delete, ALT + E to switch");
        Enhanced_commutator commutator = new Enhanced_commutator();
        window.add(commutator);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400,130);
        window.setVisible(true);
    }
}
