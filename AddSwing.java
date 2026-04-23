import javax.swing.*;
import java.awt.event.*;
public class AddSwing {
    public static void main(String[] args) {
        JFrame f = new JFrame("Addition");
        JLabel l1 = new JLabel("First Number:");
        JLabel l2 = new JLabel("Second Number:");
        JLabel l3 = new JLabel("Result:");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();
        JButton b = new JButton("Add");
        l1.setBounds(50,30,120,30);
        t1.setBounds(180,30,120,30);
        l2.setBounds(50,80,120,30);
        t2.setBounds(180,80,120,30);
        l3.setBounds(50,130,120,30);
        t3.setBounds(180,130,120,30);
        b.setBounds(120,180,100,30);
        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(l3); f.add(t3);
        f.add(b);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a + b;
                t3.setText(String.valueOf(c));
            }
        });
        f.setSize(350,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}