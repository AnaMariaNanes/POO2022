// File:   mousedemo/MousePanel.java
// Description: Panel holding two MousePanels.
// Author: Fred Swartz
// Date:   2005-02-03, 2000-11-29...2002-11-21

package mouseDemo;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

////////////////////////////////////////////////// class DualMousePanel
class DualMousePanel extends JPanel {
    //====================================================== constructor
    public DualMousePanel() {
        //--- Create two MousePanels
        MousePanel mp1 = new MousePanel();
        MousePanel mp2 = new MousePanel();
        
        //--- Add borders (note: borders are inside panel)
        Border etched = BorderFactory.createEtchedBorder();
        mp1.setBorder(BorderFactory.createTitledBorder(etched, "Panel 1"));
        mp2.setBorder(BorderFactory.createTitledBorder(etched, "Panel 2"));
        
        //--- Layout the panels
        this.setLayout(new GridLayout(1, 2));
        this.add(mp1);
        this.add(mp2);
    }//end constructor
}
