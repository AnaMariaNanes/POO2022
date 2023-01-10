// File:   mousedemo/MouseTest.java
// Description: Main program/applet to demo mouse listeners.
// Author: Fred Swartz
// Date:   2005-02-03, 2000-11-29...2002-11-21
// Possible enhancements: Show other mouse events.


package mouseDemo;
import javax.swing.*;

//////////////////////////////////////////////////////// class MouseTest  
public class MouseTest extends JApplet{ 
    //===================================================== constructor
    public MouseTest() {
        add(new DualMousePanel()); 
    }
    
    //====================================================== method main
    public static void main(String[] args) {
        JFrame window = new JFrame("Mouse Demo");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new DualMousePanel());
        window.pack();
        window.setVisible(true);
    }
}
