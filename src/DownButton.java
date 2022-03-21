import java.awt.Color;

public class DownButton extends Button {
	private boolean alt; 

	public DownButton(LocationHolder locationHolder) {
		super(locationHolder);
		setFillColorPressed(Color.red);
		setFillColorReleased(Color.green);	
		
		
		
		
	}

	public int computeNextXLocation() {
		return currentLocation.getLocationX() - 5;
	}

	public int computeNextYLocation() {
		return currentLocation.getLocationY() + 5;
	}

	public Color getLineColor() {
		if(alt == true) {
			alt = false;
			return Color.red;
			
		}
		else {
			alt = true;
			return Color.green;
		}
		
		
	}
	public int getlineThickness() {
		return 20;
	}

	@Override
	public int getLineThickness() {
		// TODO Auto-generated method stub
		return 20;
	}
}