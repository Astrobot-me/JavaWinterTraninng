import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Temp implements ActionListener {

    JFrame f;
    JPanel p;

    JLabel celcius,farenheit,result_celcius,result_farenheit,kelvin;

    JTextField celcius_data,farenheit_data;

    JButton convert_celcius,reset,convert_farenheit;

    Temp(){
        f = new JFrame();
        p = new JPanel();

        celcius = new JLabel("Enter Degree Celcius: ");
        farenheit = new JLabel("Enter Degree Farenheit: ");

        result_celcius = new JLabel();
        result_farenheit = new JLabel();
        kelvin = new JLabel();
        
        result_celcius.setFont(new Font("Helvetica",Font.BOLD,30));
        result_farenheit.setFont(new Font("Helvetica",Font.BOLD,30));
        kelvin.setFont(new Font("Helvetica",Font.BOLD,30));

        celcius_data = new JTextField(20);
        farenheit_data = new JTextField(20);

        convert_celcius = new JButton("Convert Celcius");
        convert_farenheit = new JButton("Convert Farenheit");
        reset = new JButton("Reset");
        
        f.add(p);
        p.add(celcius);
        p.add(celcius_data);

        p.add(farenheit);
        p.add(farenheit_data);
        
        p.add(convert_celcius);
        convert_celcius.addActionListener(this);

        p.add(convert_farenheit);
        convert_farenheit.addActionListener(this);

        p.add(reset);
        reset.addActionListener(this);

        p.add(result_celcius);
        p.add(result_farenheit);
        p.add(kelvin);

        f.setSize(419,493);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }


    public void actionPerformed(ActionEvent Event){
        try{
            if(Event.getSource() == convert_celcius){
                float a = Float.parseFloat(celcius_data.getText());
                float r = (a*9/5) + 32; //to farenheit
                result_celcius.setText(String.valueOf(r)+" Degree Farenheit");
                result_farenheit.setText("");
                kelvin.setText(String.valueOf(a+273)+" Kelvin");   
            }
        }catch(Exception ae){
            result_celcius.setText("No Data Given");
        }

        try{
            if(Event.getSource() == convert_farenheit){
                float a = Float.parseFloat(farenheit_data.getText());
                float r = (a-32)*5/9; //to celcius
                result_farenheit.setText(String.valueOf(r)+" Degree Celcius"); 
                result_celcius.setText("");  
                kelvin.setText(String.valueOf(r+273)+" Kelvin");   
            }
        }catch(Exception ae){ 
            result_celcius.setText("No Data Given");
        }

        try{
            if(Event.getSource() == reset){
                result_celcius.setText("Form Cleared");
                result_farenheit.setText("");
                kelvin.setText("");
                celcius_data.setText("");
                farenheit_data.setText("");

            }
        }catch(Exception ae){
            result_celcius.setText("Error Occured");
            result_farenheit.setText("");
            kelvin.setText("");
        }


    }

    

    public static void main(String[] args) {
        Temp t = new Temp();
    }
}
