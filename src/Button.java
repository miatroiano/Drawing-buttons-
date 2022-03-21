import java.awt.Color;
import java.awt.event.MouseEvent;

import wheels.users.Ellipse;
import wheels.users.Line;

public abstract class Button extends Ellipse {
	protected LocationHolder currentLocation;
	private Color fillColorPressed;
	private Color fillColorReleased;
	

	
	public Button(LocationHolder locationHolder) {
		currentLocation = locationHolder;
		setSize(20, 20);
		setFillColorPressed(Color.blue);
		setFillColorReleased(Color.red);
	}
    
    public void setFillColorPressed(Color color) {
    	this.fillColorPressed = color;
    }
    
    public void setFillColorReleased(Color color) {
    	this.fillColorReleased = color;
    	setColor(color);
    }
    
	
    public void mousePressed(MouseEvent e)
    {
        this.setFillColor(fillColorPressed);
    }
    

    public void mouseReleased(MouseEvent e)
    {
    	int lastXLocation = currentLocation.getLocationX();
    	int lastYLocation = currentLocation.getLocationY();
    	Line line = new Line();
    	line.setP1(lastXLocation, lastYLocation);
    	
    	int nextXLocation = computeNextXLocation();
    	int nextYLocation = computeNextYLocation();
    	line.setP2(nextXLocation, nextYLocation);

        line.setColor(getLineColor());
        line.setThickness(getLineThickness());
        
        
        currentLocation.setLocationX(nextXLocation);
        currentLocation.setLocationY(nextYLocation);
        this.setFillColor(fillColorReleased);
    }
    
    public abstract int computeNextXLocation();
    public abstract int computeNextYLocation();
    public abstract Color getLineColor();
    public abstract int getLineThickness();
}