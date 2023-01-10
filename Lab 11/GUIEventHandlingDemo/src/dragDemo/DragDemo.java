package dragDemo; /**
 * DragDemo.java - Mouse drag example dual application/applet
 *
 * @author Fred Swartz
 * @version 2004-04-15
 */
// "appletviewer DragDemo.java" works because of the following line.
// <applet code="DragDemo.class" height="200" width="200"></applet>

import javax.swing.*;
//////////////////////////////////////////////////////////////// class DragDemo

/** This is an application because it has a main method.
 It's also an applet because it extends JApplet.
 */
public class DragDemo extends JApplet {
    //============================================================= method main
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setTitle("Drag Demo");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new DragBallPanel());
        window.pack();
        window.setVisible(true);
    }//end main

    //====================================================== applet constructor
    public DragDemo() {
        this.setContentPane(new DragBallPanel());
    }
}//endclass DragDemo
