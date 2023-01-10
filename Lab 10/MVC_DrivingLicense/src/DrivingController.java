import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrivingController 
{
     private  DrivingModel model;
     private DrivingView view;
     
     public DrivingController(DrivingModel model, DrivingView view)
     {
    	 this.model = model;
    	 this.view = view;
    	 
    	 //add listeners
    	 view.addDecideListener(new decisionListener());
     }
	  
     class decisionListener implements ActionListener
     {
    	 public void actionPerformed(ActionEvent e)
    	 {
    		 String input="";
    		 try
    		 {
    			 input = view.getInput();
    			 String decided;
    			 if(Integer.parseInt(input)>17)
    			 {
    				 model.setOutcome("Congratulations!");
    			 }
    			 else
    				 model.setOutcome("You must wait");
    			 
    			 view.setOutcome(model.getOutcome());
    			 view.clearAge();
    			 
    		 }	 catch(NumberFormatException ee) 
    			{
    				view.showError("error");
    			}
    		 }
    	 }
   }

