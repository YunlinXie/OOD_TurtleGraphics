package TurtleGraphics;

import mvc.*;
import java.awt.*;
import java.util.Iterator;


public class TurtleView extends View {

	public TurtleView(Model model) {
		super(model);
		setSize(Turtle.WORLD_SIZE, Turtle.WORLD_SIZE);
	}
	
	public void paintComponent(Graphics gc) {
		Turtle turtle = (Turtle)model;
		Color oldColor = gc.getColor();
		//gc.fillOval(12, 12, 15, 15);
		Iterator<TurtleGraphics.Point> it = turtle.iterator();
		while(it.hasNext()) {
			TurtleGraphics.Point point = it.next();
			gc.setColor(point.color);
			gc.fillOval(point.x,  point.y, 5, 5);
		}
		gc.setColor(Color.BLACK);
		if (turtle.getPenUp()) {
			gc.drawOval(turtle.getLocation().x,turtle.getLocation().y , 7, 7);
		} else {
			gc.fillOval(turtle.getLocation().x,turtle.getLocation().y , 7, 7);
		}
		gc.setColor(oldColor);
	}
	

}