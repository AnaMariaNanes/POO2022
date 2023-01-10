import java.awt.*;
import javax.swing.*;

class MyPanel extends JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 120);
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JLabel l = new JLabel("Label1 ");
        JTextField tf = new JTextField("TextField1");
        panel1.add(l);
        panel1.add(tf);
        panel1.setLayout(new FlowLayout());
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        JPanel p = new JPanel();
        p.add(panel1);
        p.add(panel2);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        frame.setContentPane(p);
        frame.setVisible(true);
    }
}