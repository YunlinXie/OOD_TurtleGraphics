package TurtleGraphics;

import mvc.Command;
import mvc.Model;
import mvc.Utilities;

public class TurnCommand extends Command {

	public TurnCommand(Model model) {
		super(model);
	}

	@Override
	public void execute() {
		Turtle turtle = (Turtle) model;
		String response = Utilities.ask("Which direction: NORTH, SOUTH, WEST, or EAST?");

				if(response.equalsIgnoreCase("north")) {
					turtle.turn(Heading.NORTH);
				}
				else if(response.equalsIgnoreCase("south")) {
					turtle.turn(Heading.SOUTH);
				}
				else if(response.equalsIgnoreCase("west")) {
					turtle.turn(Heading.WEST);
				}
				else if(response.equalsIgnoreCase("east")) {
					turtle.turn(Heading.EAST);
				}
				else {
					Utilities.error("Heading must be  NORTH, SOUTH, WEST, or EAST");
				}

		

	}

}
