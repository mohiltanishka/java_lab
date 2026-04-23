import javax.swing.*;
import java.awt.event.*;

public class RegisterForm {
    public static void main(String[] args) {

        JFrame f = new JFrame("Registration Form");

        // Labels
        JLabel l1 = new JLabel("Name:");
        JLabel l2 = new JLabel("Email:");
        JLabel l3 = new JLabel("Password:");
        JLabel l4 = new JLabel("Gender:");
        JLabel l5 = new JLabel("DOB:");
        JLabel l6 = new JLabel("Phone:");
        JLabel l7 = new JLabel("Address:");
        JLabel l8 = new JLabel("Course:");
        JLabel l9 = new JLabel("Hobbies:");
        JLabel l10 = new JLabel("Country:");

        // TextFields
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JPasswordField t3 = new JPasswordField();
        JTextField t5 = new JTextField();
        JTextField t6 = new JTextField();
        JTextField t7 = new JTextField();

        // Radio Buttons (Gender)
        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1); bg.add(r2);

        // ComboBox (Course)
        String courses[] = {"B.Tech","BCA","MCA","MBA"};
        JComboBox c1 = new JComboBox(courses);

        // CheckBoxes (Hobbies)
        JCheckBox h1 = new JCheckBox("Reading");
        JCheckBox h2 = new JCheckBox("Music");
        JCheckBox h3 = new JCheckBox("Sports");

        // Country ComboBox
        String country[] = {"India","USA","UK","Canada"};
        JComboBox c2 = new JComboBox(country);

        // Button
        JButton b = new JButton("Submit");

        // Set Bounds
        l1.setBounds(50,30,100,30);   t1.setBounds(150,30,150,30);
        l2.setBounds(50,70,100,30);   t2.setBounds(150,70,150,30);
        l3.setBounds(50,110,100,30);  t3.setBounds(150,110,150,30);
        l4.setBounds(50,150,100,30);  r1.setBounds(150,150,70,30); r2.setBounds(220,150,80,30);
        l5.setBounds(50,190,100,30);  t5.setBounds(150,190,150,30);
        l6.setBounds(50,230,100,30);  t6.setBounds(150,230,150,30);
        l7.setBounds(50,270,100,30);  t7.setBounds(150,270,150,30);
        l8.setBounds(50,310,100,30);  c1.setBounds(150,310,150,30);
        l9.setBounds(50,350,100,30);  h1.setBounds(150,350,80,30); h2.setBounds(230,350,80,30); h3.setBounds(310,350,80,30);
        l10.setBounds(50,390,100,30); c2.setBounds(150,390,150,30);

        b.setBounds(150,440,100,30);

        // Add components
        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(l3); f.add(t3);
        f.add(l4); f.add(r1); f.add(r2);
        f.add(l5); f.add(t5);
        f.add(l6); f.add(t6);
        f.add(l7); f.add(t7);
        f.add(l8); f.add(c1);
        f.add(l9); f.add(h1); f.add(h2); f.add(h3);
        f.add(l10); f.add(c2);
        f.add(b);

        // Button Action
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "Registration Successful");
            }
        });

        f.setSize(450,550);
        f.setLayout(null);
        f.setVisible(true);
    }
}