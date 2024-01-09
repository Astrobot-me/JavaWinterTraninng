import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class calcdemo implements ActionListener {

    JFrame f;
    JPanel p;
    JButton b1,b2,b3,b4;
    JButton clear;
    JLabel field_1,field_2;
    JTextField f1,f2,result;

    calcdemo(){
        b1 = new JButton("Add");
        b1.addActionListener(this);
        
        b2 = new JButton("Subtract");
        b2.addActionListener(this);
        
        b3 = new JButton("Multiply");
        b3.addActionListener(this);
        
        b4 = new JButton("Divide");
        b4.addActionListener(this);
        
        clear = new JButton("Clear"); 
        clear.addActionListener(this);

        field_1 = new JLabel("Value 1(A):");
        field_2 = new JLabel("Value 2(B): ");
        // result = new JLabel();

        f1 = new JTextField(30);
        f2 = new JTextField(30);
        result = new JTextField(30);

        f = new JFrame();
        p = new JPanel();

        f.add(p);

        p.add(field_1);
        p.add(f1);
        
        p.add(field_2);
        p.add(f2);

        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(clear);

        p.add(result);

        f.setSize(842,593);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent Event){
        if(Event.getSource() == b1){
            int x = Integer.parseInt(f1.getText());
            int y = Integer.parseInt(f2.getText());
            int z = x + y ;
            result.setText(String.valueOf(z));
        }
        if(Event.getSource() == b2){
            int x = Integer.parseInt(f1.getText());
            int y = Integer.parseInt(f2.getText());
            int z = x - y ;
            result.setText(String.valueOf(z));
        }
        if(Event.getSource() == b3){
            int x = Integer.parseInt(f1.getText());
            int y = Integer.parseInt(f2.getText());
            int z = x * y ;
            result.setText(String.valueOf(z));
        }
        if(Event.getSource() == b4){
            int x = Integer.parseInt(f1.getText());
            int y = Integer.parseInt(f2.getText());
            int z = x / y ;
            result.setText(String.valueOf(z));
        }
        if(Event.getSource() == clear){
            
            result.setText("");
            f1.setText("");
            f2.setText("");
        }
        

    }

    public static void main(String[] args) {
        calcdemo c = new calcdemo();
    }

}
