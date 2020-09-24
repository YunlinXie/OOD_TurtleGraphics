//package turtle;
//
//import mvc.*;
//import java.awt.Color;
//import java.util.*;
//
//public class Turtle extends Model {
//	private Point location;
//	private Boolean penUp;
//	private List<Point> path;
//	private Heading heading;
//	private Color color;
//	public static Integer WORLD_SIZE = 250;
//	public Turtle(Point location, Heading heading) {
//		super();
//		this.location = location;
//		this.heading = heading;
//		this.penUp = true;
//		this.path = new ArrayList<Point>();
//	}
//	public Turtle() {
//		this(new Point(WORLD_SIZE/2, WORLD_SIZE/2, Color.RED), Heading.NORTH);
//	}
//	public Boolean getPenUp() {
//		return penUp;
//	}
//	public void setPenUp(Boolean penUp) {
//		this.penUp = penUp;
//		changed();
//	}
//	public Point getLocation() {
//		return location;
//	}
//	public Heading getHeading() {
//		return heading;
//	}
//	
//	public Color getColor() {
//		return color;
//	}
//	
//	
//	public void setColor(Color color) {
//		this.color = color;
//	}
//	public void move(Integer steps) {
//		switch(heading) {
//		case WEST: {
//			int xc = location.x - steps;
//			if (xc < 0) xc = WORLD_SIZE + xc;	
//			if (!penUp) {
//				for(int i = 0; i < steps; i++) {
//					int x = location.x - i;
//					if (x < 0) x = WORLD_SIZE + i;
//					path.add(new Point(x, location.y, color));
//				}
//			}
//			location = new Point(xc, location.y, color);
//			changed();
//			break;
//		} case EAST: {
//			int xc = (location.x + steps) % WORLD_SIZE;
//			if (!penUp) {
//				for(int i = 0; i < steps; i++) {
//					int x = (location.x + i) % WORLD_SIZE;
//					path.add(new Point(x, location.y, color));
//				}
//			}
//			location = new Point(xc, location.y, color);
//			changed();
//			break;
//		} case NORTH: {
//			int yc = location.y - steps;
//			if (yc < 0) yc = WORLD_SIZE + yc;
//			if (!penUp) {
//				for(int i = 0; i < steps; i++) {
//					int y = location.y - i;
//					if (y < 0) y = WORLD_SIZE + i;
//					path.add(new Point(location.x, y, color));
//				}
//			}
//			location = new Point(location.x, yc, color);
//			changed();
//			break;
//		} case SOUTH: {
//			int yc = (location.x + steps) % WORLD_SIZE;
//			if (!penUp) {
//				for(int i = 0; i < steps; i++) {
//					int y = (location.y + i) % WORLD_SIZE;
//					path.add(new Point(location.x, y, color));
//				}
//			}
//			location = new Point(location.x, yc, color);
//			changed();
//			break;
//		} default: {
//			
//		}
//	}
//	}
//	
//	public void turn(Heading heading) {
//		this.heading = heading;
//	}
//	public Iterator<Point> iterator() {
//		return path.iterator();
//	}
//	
//	public void clear() {
//		path.clear();
//		changed();
//	}
//	
//}



package TurtleGraphics;

import mvc.*;
import java.awt.Color;
import java.util.*;

public class Turtle extends Model {
	private Point location;
	private Boolean penUp;
	private List<Point> path;
	private Heading heading;
	private Color color;
	public static Integer WORLD_SIZE = 250;
	public Turtle(Point location, Heading heading) {
		super();
		this.location = location;
		this.heading = heading;
		this.penUp = true;
		this.path = new ArrayList<Point>();
	}
	public Turtle() {
		this(new Point(WORLD_SIZE/2, WORLD_SIZE/2, Color.RED), Heading.NORTH);
	}
	public Boolean getPenUp() {
		return penUp;
	}
	public void setPenUp(Boolean penUp) {
		this.penUp = penUp;
		changed();
	}
	public Point getLocation() {
		return location;
	}
	public Heading getHeading() {
		return heading;
	}
	
	public Color getColor() {
		return color;
	}
	
	
	public void setColor(Color color) {
		this.color = color;
	}
	public void move(Integer steps) {
		switch(heading) {
		case WEST: {
			int xc = location.x - steps;
			if (xc < 0) xc = WORLD_SIZE + xc;	
			if (!penUp) {
				for(int i = 0; i < steps; i++) {
					int x = location.x - i;
					if (x < 0) x = WORLD_SIZE + i;
					path.add(new Point(x, location.y, color));
				}
			}
			location = new Point(xc, location.y, color);
			changed();
			break;
		} case EAST: {
			int xc = (location.x + steps) % WORLD_SIZE;
			if (!penUp) {
				for(int i = 0; i < steps; i++) {
					int x = (location.x + i) % WORLD_SIZE;
					path.add(new Point(x, location.y, color));
				}
			}
			location = new Point(xc, location.y, color);
			changed();
			break;
		} case NORTH: {
			int yc = location.y - steps;
			if (yc < 0) yc = WORLD_SIZE + yc;
			if (!penUp) {
				for(int i = 0; i < steps; i++) {
					int y = location.y - i;
					if (y < 0) y = WORLD_SIZE + i;
					path.add(new Point(location.x, y, color));
				}
			}
			location = new Point(location.x, yc, color);
			changed();
			break;
		} case SOUTH: {
			int yc = (location.x + steps) % WORLD_SIZE;
			if (!penUp) {
				for(int i = 0; i < steps; i++) {
					int y = (location.y + i) % WORLD_SIZE;
					path.add(new Point(location.x, y, color));
				}
			}
			location = new Point(location.x, yc, color);
			changed();
			break;
		} default: {
			
		}
	}
	}
	
	public void turn(Heading heading) {
		this.heading = heading;
	}
	public Iterator<Point> iterator() {
		return path.iterator();
	}
	
	public void clear() {
		path.clear();
		changed();
	}
	
}
