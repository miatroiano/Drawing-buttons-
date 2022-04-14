import java.awt.Color;
import java.util.Random;
import java.util.random.*;


public class LeftButton extends Button {
	
	Random color = new Random();
	
	public LeftButton(LocationHolder locationHolder) {
		super(locationHolder);
		setFillColorPressed(Color.cyan);
		setFillColorReleased(Color.pink);
	}

	public int computeNextXLocation() {
		return currentLocation.getLocationX() - 5;
	}

	public int computeNextYLocation() {
		return currentLocation.getLocationY();
	}

	public Color getLineColor() {
		float r = color.nextFloat();
		float g = color.nextFloat();
		float b = color.nextFloat();
		
		return new Color(r, g, b);
	}
	public int getlineThickness() {
		return 2;
	}

	@Override
	public int getLineThickness() {
		// TODO Auto-generated method stub
		return 2;
	}
}