public class MVC
{

    public static void main(String[] args)
    {
    	DrivingModel model = new DrivingModel();
    	DrivingView view = new DrivingView(model);
    	DrivingController controller = new DrivingController(model, view);
    	
    	
    	view.setVisible(true);
    }

}
