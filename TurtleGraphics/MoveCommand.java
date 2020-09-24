package TurtleGraphics;

import mvc.Command;
import mvc.Model;
import mvc.Utilities;

public class MoveCommand extends Command{
	
	public MoveCommand(Model model) {
		super(model); 
	}
    
	
	public void execute()
	{
		Turtle turtle = (Turtle)model;
		String response = Utilities.ask("How many steps?");
		try {
			Integer steps = Integer.valueOf(response);
			turtle.move(steps);
		} catch(Exception e) {
			Utilities.error("Steps must be a positive integer");
		}

	}
}
