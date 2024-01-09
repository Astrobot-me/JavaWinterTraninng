// package pack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class loginCard extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTable table;
    private JPasswordField passwordField;
    private JTextField textField_1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    loginCard frame = new loginCard();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public loginCard() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 584, 358);
        contentPane = new JPanel();
        contentPane.setBackground(Color.PINK);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Login Card");
        lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
        lblNewLabel.setBounds(223, 20, 111, 29);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Email");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel_1.setBounds(12, 78, 58, 21);
        contentPane.add(lblNewLabel_1);

        textField = new JTextField();
        textField.setBounds(74, 77, 164, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("Password");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel_2.setBounds(12, 125, 86, 21);
        contentPane.add(lblNewLabel_2);

        JButton btnNewButton = new JButton("ADD");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (textField.getText().equals("") || passwordField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter the Value");

                } else {
                    DefaultTableModel tm = (DefaultTableModel) table.getModel();
                    String arr[] = { textField.getText(), passwordField.getText() };
                    tm.addRow(arr);
                    JOptionPane.showMessageDialog(null, "Values Added to the Table");
                    textField.setText("");
                    passwordField.setText("");
                }

            }
        });
        btnNewButton.setForeground(SystemColor.desktop);
        btnNewButton.setBackground(SystemColor.activeCaption);
        btnNewButton.setBounds(23, 170, 89, 42);
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Update");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (textField.getText().equals("") || passwordField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter the Value");

                } else {
                    String arr[] = { textField.getText(), passwordField.getText() };
                    DefaultTableModel tm = (DefaultTableModel) table.getModel();

                    JOptionPane.showMessageDialog(null, "Values Updated");
                    tm.insertRow(Integer.parseInt(textField_1.getText()), arr);
                }
            }
        });
        btnNewButton_1.setForeground(SystemColor.desktop);
        btnNewButton_1.setBackground(SystemColor.inactiveCaption);
        btnNewButton_1.setBounds(12, 280, 89, 23);
        contentPane.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Delete");
        btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int x = -1;
                if (table.getSelectedRow() == x) {

                    JOptionPane.showMessageDialog(null, "Select the Row to Delete");
                } else {
                    DefaultTableModel tm = (DefaultTableModel) table.getModel();
                    tm.removeRow(table.getSelectedRow());
                    JOptionPane.showMessageDialog(null, "Values Removed");

                }

            }
        });
        btnNewButton_2.setForeground(SystemColor.desktop);
        btnNewButton_2.setBackground(SystemColor.inactiveCaption);
        btnNewButton_2.setBounds(125, 170, 89, 42);
        contentPane.add(btnNewButton_2);

        table = new JTable();
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                DefaultTableModel tm = (DefaultTableModel) table.getModel();
                // Kahaani
                String name = tm.getValueAt(table.getSelectedRow(), 0).toString();
                String pass = tm.getValueAt(table.getSelectedRow(), 1).toString();
                textField.setText(name);
                passwordField.setText(pass);

            }
        });
        table.setModel(new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        "New column", "New column"
                }));
        table.setBorder(new LineBorder(new Color(0, 0, 0)));
        table.setBounds(270, 67, 279, 236);
        contentPane.add(table);

        passwordField = new JPasswordField();
        passwordField.setBounds(102, 127, 136, 20);
        contentPane.add(passwordField);

        JLabel lblNewLabel_3 = new JLabel("Update at:");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel_3.setBackground(SystemColor.desktop);
        lblNewLabel_3.setForeground(SystemColor.desktop);
        lblNewLabel_3.setBounds(12, 236, 73, 21);
        contentPane.add(lblNewLabel_3);

        textField_1 = new JTextField();
        textField_1.setBounds(102, 238, 136, 20);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        JButton btnNewButton_3 = new JButton("Updated");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int x = -1;
                if (table.getSelectedRow() == x) {
                    JOptionPane.showMessageDialog(null, "Select the Table Row");

                } else {
                    DefaultTableModel tm = (DefaultTableModel) table.getModel();
                    // int x = -1;
                    String s1 = textField.getText();
                    String s2 = passwordField.getText();

                    tm.setValueAt(s1, table.getSelectedRow(), 0);
                    tm.setValueAt(s2, table.getSelectedRow(), 1);
                    JOptionPane.showMessageDialog(null, "Data Updated Successfully");
                }
            }
        });
        btnNewButton_3.setBounds(125, 280, 89, 23);
        contentPane.add(btnNewButton_3);
    }
}
