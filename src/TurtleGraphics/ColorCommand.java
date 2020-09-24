package TurtleGraphics;

import java.awt.Color;
import javax.swing.JColorChooser;
import mvc.Command;
import mvc.Model;

public class ColorCommand extends Command {
	
	public ColorCommand(Model model) { super(model); }
	  
	  
	public void execute() {

	    Turtle turtle = (Turtle) model;
    	Color newcolor = JColorChooser.showDialog(null, "Choose a color", turtle.getColor());

        if (newcolor == null) {
            return;
        }
    	turtle.setColor(newcolor);
        turtle.changed();
	}

}
