import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

class JTextFieldLimit extends PlainDocument {
    private int limit;

    JTextFieldLimit(int limit) {
        super();
        this.limit = limit;
    }


    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if (str == null)
            return;

        if ((getLength() + str.length()) <= limit) {
            super.insertString(offset, str, attr);
        }
    }
}

public class LimitedJTextFieldDemo extends JFrame {
    JTextField textfield1;
    JLabel label1;

    public LimitedJTextFieldDemo() {
        setLayout(new FlowLayout());
        label1 = new JLabel("max 10 chars");
        textfield1 = new JTextField(15);
        add(label1);
        add(textfield1);
        textfield1.setDocument(new JTextFieldLimit(10));

        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        LimitedJTextFieldDemo demo = new LimitedJTextFieldDemo();
    }
}

