import javax.swing.*;
public class CalculatorSwing {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");

        JTextField t = new JTextField();
        t.setBounds(30,30,240,30);

        // Buttons
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("+");

        JButton b5 = new JButton("4");
        JButton b6 = new JButton("5");
        JButton b7 = new JButton("6");
        JButton b8 = new JButton("-");

        JButton b9 = new JButton("7");
        JButton b10 = new JButton("8");
        JButton b11 = new JButton("9");
        JButton b12 = new JButton("*");

        JButton b13 = new JButton("0");
        JButton b14 = new JButton("C");
        JButton b15 = new JButton("=");
        JButton b16 = new JButton("/");

        // Set positions
        b1.setBounds(30,80,50,40);
        b2.setBounds(90,80,50,40);
        b3.setBounds(150,80,50,40);
        b4.setBounds(210,80,50,40);

        b5.setBounds(30,130,50,40);
        b6.setBounds(90,130,50,40);
        b7.setBounds(150,130,50,40);
        b8.setBounds(210,130,50,40);

        b9.setBounds(30,180,50,40);
        b10.setBounds(90,180,50,40);
        b11.setBounds(150,180,50,40);
        b12.setBounds(210,180,50,40);

        b13.setBounds(30,230,50,40);
        b14.setBounds(90,230,50,40);
        b15.setBounds(150,230,50,40);
        b16.setBounds(210,230,50,40);

        // Add components
        f.add(t);
        f.add(b1); f.add(b2); f.add(b3); f.add(b4);
        f.add(b5); f.add(b6); f.add(b7); f.add(b8);
        f.add(b9); f.add(b10); f.add(b11); f.add(b12);
        f.add(b13); f.add(b14); f.add(b15); f.add(b16);

        // Variables
        final int[] num1 = new int[1];
        final int[] num2 = new int[1];
        final char[] op = new char[1];

        // Number buttons
        b1.addActionListener(e -> t.setText(t.getText() + "1"));
        b2.addActionListener(e -> t.setText(t.getText() + "2"));
        b3.addActionListener(e -> t.setText(t.getText() + "3"));
        b5.addActionListener(e -> t.setText(t.getText() + "4"));
        b6.addActionListener(e -> t.setText(t.getText() + "5"));
        b7.addActionListener(e -> t.setText(t.getText() + "6"));
        b9.addActionListener(e -> t.setText(t.getText() + "7"));
        b10.addActionListener(e -> t.setText(t.getText() + "8"));
        b11.addActionListener(e -> t.setText(t.getText() + "9"));
        b13.addActionListener(e -> t.setText(t.getText() + "0"));

        // Operators
        b4.addActionListener(e -> { num1[0] = Integer.parseInt(t.getText()); op[0] = '+'; t.setText(""); });
        b8.addActionListener(e -> { num1[0] = Integer.parseInt(t.getText()); op[0] = '-'; t.setText(""); });
        b12.addActionListener(e -> { num1[0] = Integer.parseInt(t.getText()); op[0] = '*'; t.setText(""); });
        b16.addActionListener(e -> { num1[0] = Integer.parseInt(t.getText()); op[0] = '/'; t.setText(""); });

        // Equal
        b15.addActionListener(e -> {
            num2[0] = Integer.parseInt(t.getText());
            int result = 0;

            switch(op[0]) {
                case '+': result = num1[0] + num2[0]; break;
                case '-': result = num1[0] - num2[0]; break;
                case '*': result = num1[0] * num2[0]; break;
                case '/': result = num1[0] / num2[0]; break;
            }

            t.setText(String.valueOf(result));
        });

        // Clear
        b14.addActionListener(e -> t.setText(""));

        // Frame settings
        f.setSize(320,350);
        f.setLayout(null);
        f.setVisible(true);
    }
}