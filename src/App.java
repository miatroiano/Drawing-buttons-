import wheels.users.Frame;

public class App extends Frame {

	private UpButton upButton;
	private DownButton downButton;
	private LeftButton leftButton;
	private RightButton rightButton;
	
	public App() {
		LocationHolder locationHolder = new LocationHolder(355, 250);
		upButton = new UpButton(locationHolder);
		upButton.setLocation(345, 400);
		
		downButton = new DownButton(locationHolder);
		downButton.setLocation(345, 450);
		
		leftButton = new LeftButton(locationHolder);
		leftButton.setLocation(317, 425);
		
		rightButton = new RightButton(locationHolder);
		rightButton.setLocation(372, 425);
	}
	
	public static void main(String[] args) {
		new App();

	}
	
}