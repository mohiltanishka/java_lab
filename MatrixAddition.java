import javax.swing.*;
import java.awt.event.*;
public class MatrixAddition {
    public static void main(String[] args) {
        JFrame f = new JFrame("Matrix Addition");
        JTextField a11 = new JTextField();
        JTextField a12 = new JTextField();
        JTextField a21 = new JTextField();
        JTextField a22 = new JTextField();
        JTextField b11 = new JTextField();
        JTextField b12 = new JTextField();
        JTextField b21 = new JTextField();
        JTextField b22 = new JTextField();
        JTextField c11 = new JTextField();
        JTextField c12 = new JTextField();
        JTextField c21 = new JTextField();
        JTextField c22 = new JTextField();
        JLabel plus = new JLabel("+");
        JLabel equal = new JLabel("=");
        JButton btn = new JButton("Add");
        a11.setBounds(50,50,40,30);
        a12.setBounds(100,50,40,30);
        a21.setBounds(50,90,40,30);
        a22.setBounds(100,90,40,30);
        plus.setBounds(150,70,20,30);
        b11.setBounds(180,50,40,30);
        b12.setBounds(230,50,40,30);
        b21.setBounds(180,90,40,30);
        b22.setBounds(230,90,40,30);
        equal.setBounds(280,70,20,30);
        c11.setBounds(310,50,40,30);
        c12.setBounds(360,50,40,30);
        c21.setBounds(310,90,40,30);
        c22.setBounds(360,90,40,30);
        btn.setBounds(200,150,80,30);
        f.add(a11); f.add(a12); f.add(a21); f.add(a22);
        f.add(b11); f.add(b12); f.add(b21); f.add(b22);
        f.add(c11); f.add(c12); f.add(c21); f.add(c22);
        f.add(plus); f.add(equal);
        f.add(btn);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int A11 = Integer.parseInt(a11.getText());
                int A12 = Integer.parseInt(a12.getText());
                int A21 = Integer.parseInt(a21.getText());
                int A22 = Integer.parseInt(a22.getText());
                int B11 = Integer.parseInt(b11.getText());
                int B12 = Integer.parseInt(b12.getText());
                int B21 = Integer.parseInt(b21.getText());
                int B22 = Integer.parseInt(b22.getText());
                c11.setText(String.valueOf(A11 + B11));
                c12.setText(String.valueOf(A12 + B12));
                c21.setText(String.valueOf(A21 + B21));
                c22.setText(String.valueOf(A22 + B22));
            }
        });
        f.setSize(450,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}