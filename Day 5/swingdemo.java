import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// import p.circle;

public class swingdemo {
    
    JFrame f;
    JPanel p;
    JLabel l1,l2,l3;
    JButton b1,b2;
    JTextField t1,t2;


    swingdemo(){
        f = new JFrame();
        p = new JPanel();
        l1= new JLabel("Login");
        l2= new JLabel("Enter Email: ");
        l3= new JLabel("Enter Password:");

        t1 = new JTextField(30);
        t2 = new JTextField(30);

        b1 = new JButton("Sign in");
        b2 = new JButton("Reset");

        f.add(p);
        p.add(l1);
        p.add(l2);
        p.add(t1);
        p.add(l3);
        p.add(t2);

        p.add(b1);
        p.add(b2);

        // f.setSize(400,400);
        f.pack();
        p.setBackground(Color.pink);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes the terminal on exit 
    }
    public static void main(String[] args) {

        swingdemo s = new swingdemo();
    }
}
