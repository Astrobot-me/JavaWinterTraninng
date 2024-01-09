import java.awt.Color;
import java.awt.Font;//font and Color are SUbpackages of

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

// import p.circle;

public class swingdemo {
    
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


    swingdemo(){

        String[] arr = {"Red","Green","Blue"}; 
        // Color c = new Color();

        f = new JFrame();
        p = new JPanel();
        
        
        l1= new JLabel("Login");
        l1.setFont(new Font("Times New Roman",Font.BOLD,30));
        // l1.setBounds(200, 40, 80, 10);
        
        l2= new JLabel("Enter Email: ");
        l2.setFont(new Font("Times New Roman",Font.BOLD,18));
        // l2.setBounds(200, 80, 80, 10);
        
        l3= new JLabel("Enter Password:");
        l3.setFont(new Font("Times New Roman",Font.BOLD,18));
        
        l4= new JLabel("Select from Menu");
        l4.setFont(new Font("Helvetica",Font.BOLD,18));
        l5= new JLabel("Select Any one: ");
        l5.setFont(new Font("Helvetica",Font.BOLD,18));
        l6= new JLabel("Select from Check Box: ");
        l5.setFont(new Font("Helvetica",Font.BOLD,18));
        
        t1 = new JTextField(30);
        p1 = new JPasswordField(30);
        
        b1 = new JButton("Sign in");
        b1.setFont(new Font("Courier New",Font.BOLD,22));
        b2 = new JButton("Reset");
        b2.setFont(new Font("Courier New",Font.BOLD,22));
        
        
        
        c1 = new JComboBox<>(arr);
        
        r1 = new JRadioButton("Mango");
        r2 = new JRadioButton("Apple");
        
        cb1 = new JCheckBox("Agra");
        cb2 = new JCheckBox("Nanital");
        
        f.add(p);
        p.add(l1);
        p.add(l2);
        p.add(t1);
        p.add(l3);
        p.add(p1);
        
        p.add(l4);
        p.add(c1);
        
        bg = new ButtonGroup();
        p.add(l5);
        bg.add(r1);
        bg.add(r2);
        p.add(r1);
        p.add(r2);

        p.add(l6);
        bg.add(cb1);
        bg.add(cb2);
        p.add(cb1);
        p.add(cb2);

        p.add(b1);
        p.add(b2);

        f.setSize(400,400);
        // f.setBounds(0, 0, 400, 400);
        // f.pack();
        p.setBackground(Color.CYAN);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes the terminal on exit 
    }
    public static void main(String[] args) {

        swingdemo s = new swingdemo();
    }
}
