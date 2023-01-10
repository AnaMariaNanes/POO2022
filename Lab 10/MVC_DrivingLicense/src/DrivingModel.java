
public class DrivingModel 
{

	private String outcome;
	
	public DrivingModel() 
	{
		reset();
	}
    
	public void reset()
	{
		this.outcome = "Not yet decide";
	}
	
	public String getOutcome()
	{
		return this.outcome;
	}
	public void setOutcome(String outcome)
	{
		this.outcome = outcome;
	}
	

}
