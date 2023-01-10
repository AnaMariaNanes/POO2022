// File:   mousedemo/MousePanel.java
// Description: Panel that listens to mouse events and displays info
//              about some of them.
// Author: Fred Swartz
// Date:   2005-02-03, 2000-11-29...2002-11-21

package mouseDemo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/////////////////////////////////////////////////////// class MousePanel
class MousePanel extends JPanel implements MouseListener, MouseMotionListener {
    
   //================================================ instance variables
    private int m_lastClickedX = 0;  // x coord of mouse click 
    private int m_lastClickedY = 0;  // y coord of mouse click
    private int m_lastMovedX   = 0;  // x coord of mouse move 
    private int m_lastMovedY   = 0;  // y coord of mouse move
    
   
    //====================================================== constructor
    public MousePanel() {
        this.setBackground(Color.white);
        this.setPreferredSize(new Dimension(200, 200));
        //--- Add the mouse listeners.
        this.addMouseListener(this);       // listen to mouse events
        this.addMouseMotionListener(this); // listen to moves and drags
    }
    
    
    //============================================ method paintComponent
    public void paintComponent(Graphics g) {
        super.paintComponent(g);  // paint background and borders
        g.drawString("Last click: x=" + m_lastClickedX 
                      + ", y=" + m_lastClickedY , 10, 30);
        g.drawString("x=" + m_lastMovedX   + ", y=" + m_lastMovedY 
                      , m_lastMovedX, m_lastMovedY);
    }
    

    //============================================ listener mouseClicked
    public void mouseClicked(MouseEvent e) {
        m_lastClickedX = e.getX(); // Save the x coordinate of the click
        m_lastClickedY = e.getY(); // Save the y coordinate of the click
        this.repaint();            // Paint the panel with the new values.
    }
    
  
    //============================================== listener mouseMoved
    public void mouseMoved(MouseEvent e) {
        m_lastMovedX = e.getX();
        m_lastMovedY = e.getY();
        this.repaint();
    }
  
  
    //========================================================== ignored
    //==== the other motion events must be here, but do nothing.
    public void mouseDragged (MouseEvent e) {}  // ignore
    //==== these "slow" mouse events are ignored.
    public void mouseEntered (MouseEvent e) {}  // ignore
    public void mouseExited  (MouseEvent e) {}  // ignore
    public void mousePressed (MouseEvent e) {}  // ignore
    public void mouseReleased(MouseEvent e) {}  // ignore
}
