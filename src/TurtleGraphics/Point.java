package TurtleGraphics;

import java.awt.Color;
import java.io.Serializable;


public class Point  implements Serializable {
	
	public Color color;
	public Integer x;
	public Integer y;  
	public Point(Integer x, Integer y, Color color)
	{
		super();
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
    public int getX()
    {
    	return x;
    }
    
    public int getY()
    {
    	return y;
    }
    
    
    public Color getColor()
    {
    	return color;
    }
 
    public String toString()
    {
    	return this.x.toString() + this.y.toString();
    }
}



