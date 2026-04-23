import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PaintBrush extends JFrame {

    int x1, y1, x2, y2;
    Color color = Color.BLACK;
    int width = 2;

    public PaintBrush() {
        setTitle("Paint Brush");

        // Buttons for colors
        JButton red = new JButton("Red");
        JButton blue = new JButton("Blue");
        JButton green = new JButton("Green");

        // ComboBox for width
        Integer sizes[] = {2,4,6,8,10};
        JComboBox cb = new JComboBox(sizes);

        red.setBounds(20,40,70,30);
        blue.setBounds(100,40,70,30);
        green.setBounds(180,40,80,30);
        cb.setBounds(280,40,70,30);

        add(red); add(blue); add(green); add(cb);

        // Color actions
        red.addActionListener(e -> color = Color.RED);
        blue.addActionListener(e -> color = Color.BLUE);
        green.addActionListener(e -> color = Color.GREEN);

        // Width selection
        cb.addActionListener(e -> width = (int)cb.getSelectedItem());

        // Mouse events
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                x2 = e.getX();
                y2 = e.getY();

                Graphics g = getGraphics();
                g.setColor(color);
                ((Graphics2D)g).setStroke(new BasicStroke(width));

                g.drawLine(x1, y1, x2, y2);

                x1 = x2;
                y1 = y2;
            }
        });

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                x1 = e.getX();
                y1 = e.getY();
            }
        });

        setSize(500,400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PaintBrush();
    }
}