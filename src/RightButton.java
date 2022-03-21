import java.awt.Color;


public class RightButton extends Button {

	public RightButton(LocationHolder locationHolder) {
		super(locationHolder);
		setFillColorPressed(Color.black);
		setFillColorReleased(Color.orange);
	}

	public int computeNextXLocation() {
		return currentLocation.getLocationX() + 5;
	}

	public int computeNextYLocation() {
		return currentLocation.getLocationY();
	}

	public Color getLineColor() {
		return Color.red;
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