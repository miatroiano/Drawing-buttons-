import java.awt.Color;

public class UpButton extends Button {

	public UpButton(LocationHolder locationHolder) {
		super(locationHolder);
		setFillColorPressed(Color.green);
		setFillColorReleased(Color.blue);
	}

	public int computeNextXLocation() {
		return currentLocation.getLocationX();
	}

	public int computeNextYLocation() {
		return currentLocation.getLocationY() - 5;
	}

	public Color getLineColor() {
		return Color.black;
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
