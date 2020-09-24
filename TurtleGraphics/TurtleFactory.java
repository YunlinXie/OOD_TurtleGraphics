package TurtleGraphics;

import mvc.*;

public class TurtleFactory implements AppFactory{
	
	public Model makeModel() { return new Turtle(); }

	public String[] getEditCommands() { return new String[] {"Turn", "Move", "Clear", "Pen", "Color"}; }

	public Command makeEditCommand(Model model, String type) {
		if (type == "Turn")
			return new TurnCommand(model);
		if (type == "Move")
			return new MoveCommand(model);
		if (type == "Clear")
			return new ClearCommand(model);
		if (type == "Pen")
			return new PenCommand(model);
		if (type == "Color")
			return new ColorCommand(model);
		return null;
	}

	public String getTitle() { return "Turtle Graphics"; }

	public String[] getHelp() {
		return new String[] {"Click Command Buttons to begin playing!"};
	}

	public String about() {
		return "TurtleGraphics Simulator version 1.0. Copyright 2020";
	}

}


