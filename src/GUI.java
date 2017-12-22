
/* Author: Zubair Ab Aziz
 * Assignment: Project3
 * Lab Section: MW, 1230-1345
 * TA Name: Sofia
 * Collaboration: I did not collaborate with anyone on this assignment
 */

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

// GUI class for the interface(labels, buttons, sliders)
public class GUI extends JPanel implements ItemListener {
	private static final long serialVersionUID = 1L;

	// Angle of launch
	JLabel angleLabel = new JLabel("Launch Angle:");
	JSlider angle = new JSlider(30, 150, 90);
	// Size of the fire work
	JLabel sizeLabel = new JLabel("Size of Firework:");
	JSlider size = new JSlider(50, 200, 100);
	// Button for color change
	JRadioButton red = new JRadioButton("Red");
	JRadioButton green = new JRadioButton("Green");
	JRadioButton blue = new JRadioButton("Blue");
	JRadioButton cyan = new JRadioButton("Cyan");
	JRadioButton magenta = new JRadioButton("Magenta");
	JRadioButton yellow = new JRadioButton("Yellow");
	JLabel color = new JLabel("Color:");
	// Shape of explosion
	JRadioButton circle = new JRadioButton("Circle");
	JRadioButton triangle = new JRadioButton("Triangle");
	JRadioButton square = new JRadioButton("Square");
	JRadioButton diamond = new JRadioButton("Diamond");
	JRadioButton rectangle = new JRadioButton("Rectangle");
	JLabel shape = new JLabel("Shape:");

	public GUI() {

		// Labels & buttons for colors
		add(angleLabel);
		add(angle);
		add(sizeLabel);
		add(size);
		add(color);
		add(red);
		red.addItemListener(this);
		add(green);
		green.addItemListener(this);
		add(blue);
		blue.addItemListener(this);
		add(cyan);
		cyan.addItemListener(this);
		add(magenta);
		magenta.addItemListener(this);
		add(yellow);
		yellow.addItemListener(this);

		ButtonGroup groupColor = new ButtonGroup();
		groupColor.add(red);
		groupColor.add(green);
		groupColor.add(blue);
		groupColor.add(cyan);
		groupColor.add(magenta);
		groupColor.add(yellow);

		add(shape);
		add(circle);
		circle.addItemListener(this);
		add(diamond);
		diamond.addItemListener(this);
		add(square);
		square.addItemListener(this);
		add(triangle);
		triangle.addItemListener(this);
		add(rectangle);
		rectangle.addItemListener(this);

		ButtonGroup groupShape = new ButtonGroup();
		groupShape.add(circle);
		groupShape.add(diamond);
		groupShape.add(square);
		groupShape.add(triangle);
		groupShape.add(rectangle);

		angle.setMajorTickSpacing(30);
		angle.setMinorTickSpacing(15);
		angle.setPaintTicks(true);
		angle.setPaintLabels(true);

		size.setMajorTickSpacing(50);
		size.setMinorTickSpacing(25);
		size.setPaintTicks(true);
		size.setPaintLabels(true);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		e.getSource();
		if (e.getSource() == red) {
			color.setText("Red");
		} else if (e.getSource() == green) {
			color.setText("Green");
		} else if (e.getSource() == blue) {
			color.setText("Blue");
		} else if (e.getSource() == cyan) {
			color.setText("Cyan");
		} else if (e.getSource() == magenta) {
			color.setText("Magenta");
		} else if (e.getSource() == yellow) {
			color.setText("Yellow");
		}
		if (e.getSource() == circle) {
			shape.setText("Circle");
		} else if (e.getSource() == diamond) {
			shape.setText("Diamond");
		} else if (e.getSource() == triangle) {
			shape.setText("Triangle");
		} else if (e.getSource() == square) {
			shape.setText("Square");
		} else if (e.getSource() == rectangle) {
			shape.setText("Rectangle");
		}
	}
}