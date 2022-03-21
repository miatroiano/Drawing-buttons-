import java.awt.Color;


public class LeftButton extends Button {
	
	Color randomColor = new Color((int)(Math.random() * 0x1000000));
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
		
		return randomColor;
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