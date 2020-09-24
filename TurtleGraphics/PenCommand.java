package TurtleGraphics;

import java.awt.Color;

import mvc.Command;
import mvc.Model;
import mvc.Utilities;

public class PenCommand extends Command {

	public PenCommand(Model model)  {super(model);}
	
	public void execute()
	{
		Turtle turtle = (Turtle)model;
		if(turtle.getPenUp()) {
			turtle.setPenUp(false);
			turtle.setColor(Color.BLACK);
		}else {
			turtle.setPenUp(true);
			turtle.setColor(Color.WHITE);
		}
		turtle.changed();
	}
}




