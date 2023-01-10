import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DrivingView extends JPanel
{    
	private DrivingModel model;
	private JTextField theInputAge = new JTextField(20);
	private JTextField theOutcome = new JTextField(20);
	private JButton btnAddAge = new JButton("Decide");

	public DrivingView(DrivingModel model) 
	{
		this.model = model;
		
		this.theInputAge.setEditable(true);
		this.theOutcome.setEditable(false);
		
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setTitle("Driving Licence");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        
        panel1.setLayout(new FlowLayout());
        panel2.setLayout(new FlowLayout());
        panel3.setLayout(new FlowLayout());
        
        JLabel label1 = new JLabel("Age");
        JLabel label2 = new JLabel("Outcome");
        
        panel1.add(label1);
        panel1.add(theInputAge);
        
        panel2.add(btnAddAge);
        
        panel3.add(label2);
        panel3.add(theOutcome);
        
		JPanel mainPanel= new JPanel();
		mainPanel.setLayout(new GridLayout(0,1));
		mainPanel.add(panel1);
		mainPanel.add(panel2);
		mainPanel.add(panel3);
		
		frame.setContentPane(mainPanel);
		frame.setVisible(true);
		frame.pack();
	}
	
    public String getInput()
    {
    	return this.theInputAge.getText();
    }
    
    public void setOutcome(String output)
    {
    	this.theOutcome.setText(output);
    }
    
    public void showError(String message)
    {
        JOptionPane.showMessageDialog(this, message);
    }
    
    public void addDecideListener(ActionListener action)
    {
    	this.btnAddAge.addActionListener(action);
    }
 
    public void clearAge()
    {
    	this.theInputAge.setText("");
    }
}
