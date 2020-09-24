package TurtleGraphics;

import java.awt.*;
import javax.swing.*;
import mvc.*;


public class TurtlePanel extends AppPanel {
	
	public TurtlePanel(AppFactory factory){
		super(factory);
		
		this.setLayout(new GridLayout(1,2));
		
		JPanel buttons = new JPanel();
		buttons.setLayout(new GridLayout(5,1));
		
		JPanel turnPanel = new JPanel();
		JButton turnButton = new JButton("Turn");
		turnButton.addActionListener(this);
		turnPanel.add(turnButton);
		buttons.add(turnPanel);
		
		JPanel movePanel = new JPanel();
		JButton moveButton = new JButton("Move");
		moveButton.addActionListener(this);
		movePanel.add(moveButton);
		buttons.add(movePanel);
		
		JPanel clearPanel = new JPanel();
		JButton clearButton = new JButton("Clear");
		clearButton.addActionListener(this);
		clearPanel.add(clearButton);
		buttons.add(clearPanel);
		
		JPanel penPanel = new JPanel();
		JButton penButton = new JButton("Pen");
		penButton.addActionListener(this);
		penPanel.add(penButton);
		buttons.add(penPanel);
		
		JPanel colorPanel = new JPanel();
		JButton colorButton = new JButton("Color");
		colorButton.addActionListener(this);
		colorPanel.add(colorButton);
		buttons.add(colorPanel);
	

		
		this.add(buttons);
		TurtleView view = new TurtleView((Turtle)model);
		this.add(view);
	}



	



	public static void main(String[] args) {
		AppPanel panel = new TurtlePanel(new TurtleFactory());
		panel.display();
	}
	
	
	

}


