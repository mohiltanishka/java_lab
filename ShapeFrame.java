import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ShapeFrame extends JFrame implements ActionListener {
    String shape = "";
    public ShapeFrame() {
        setTitle("Shape Drawer");
        String names[] = {"Circle","Oval","Rectangle","Square","Line",
                          "Arc","RoundRect","3DRect","FillOval","FillRect"};
        for(int i=0;i<10;i++) {
            JButton b = new JButton(names[i]);
            b.setBounds(20 + (i%5)*100, 20 + (i/5)*50, 90, 30);
            b.addActionListener(this);
            add(b);
        }
        setSize(550,400);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        shape = e.getActionCommand();
        repaint(); // redraw
    }
    public void paint(Graphics g) {
        super.paint(g);
        if(shape.equals("Circle"))
            g.drawOval(200,150,100,100);
        else if(shape.equals("Oval"))
            g.drawOval(200,150,150,100);
        else if(shape.equals("Rectangle"))
            g.drawRect(200,150,150,100);
        else if(shape.equals("Square"))
            g.drawRect(200,150,100,100);
        else if(shape.equals("Line"))
            g.drawLine(200,150,350,250);
        else if(shape.equals("Arc"))
            g.drawArc(200,150,150,100,0,180);
        else if(shape.equals("RoundRect"))
            g.drawRoundRect(200,150,150,100,30,30);
        else if(shape.equals("3DRect"))
            g.draw3DRect(200,150,150,100,true);
        else if(shape.equals("FillOval"))
            g.fillOval(200,150,150,100);
        else if(shape.equals("FillRect"))
            g.fillRect(200,150,150,100);
    }
    public static void main(String[] args) {
        new ShapeFrame();
    }
}