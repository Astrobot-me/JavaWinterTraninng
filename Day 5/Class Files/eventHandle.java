import java.awt.Color;
import java.awt.Font;//font and Color are SUbpackages of awt

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.*;
// import p.circle;

class eventHandle implements ActionListener {
    int x = 0;
    JFrame f;
    JPanel p;
    JLabel l1,l2,l3,l4,l5,l6;
    JButton b1,b2;
    JTextField t1,t2;
    JComboBox c1;
    JRadioButton r1,r2;
    JCheckBox cb1,cb2;
    ButtonGroup bg;
    JPasswordField p1;

    JLabel counter ;


    eventHandle(){

        f = new JFrame();
        p = new JPanel();

        l1 = new JLabel("Button Clicker");
        l1.setFont(new Font("Helvetica",Font.BOLD,30));

        b1 = new JButton("Click Me!");
        b1.addActionListener(this);

        b2 = new JButton("Reset");
        b2.addActionListener(this);

        l3 = new JLabel("0");
        l3.setFont(new Font("Helvetica",Font.BOLD,30));

        l2 = new JLabel("times");
        l2.setFont(new Font("Helvetica",Font.BOLD,30));

        f.add(p);
        p.add(l1);
        p.add(l3);
        p.add(l2);
        p.add(b1);
        p.add(b2);

        f.setSize(400,400);
        // f.setBounds(0, 0, 400, 400);
        // f.pack();
        p.setBackground(Color.CYAN);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes the terminal on exit 
    }
     

    public void actionPerformed(ActionEvent Event){
        
        if(Event.getSource() == b1){
            // String y ="";
            // int x=0;
            x = x + 1;
            String z = String.valueOf(x);
            l3.setText(z);
        }

        if(Event.getSource() == b2){
            l3.setText("0");
            x =0 ;
        }
    }


    public static void main(String[] args) {

        eventHandle s = new eventHandle();
    }
}
