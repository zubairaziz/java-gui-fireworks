
/* Author: Zubair Ab Aziz
 * Assignment: Project3
 * Lab Section: MW, 1230-1345
 * TA Name: Sofia
 * Collaboration: I did not collaborate with anyone on this assignment
 */

import java.awt.*;
import java.awt.event.*;

// Fireworks class where all the calculations and changes in color and shape are done
public class Fireworks extends GUI implements MouseListener, MouseMotionListener, KeyListener {
	private static final long serialVersionUID = 1L;

	// constructors
	public Fireworks() {
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addKeyListener(this);
	}

	// Mouse event methods
	public void mouseClicked(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
		Graphics g = this.getGraphics();
		Graphics2D g2d = (Graphics2D) g; // Graphics2D so I can draw strokes
		Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] { 9 }, 0);
		g2d.setStroke(dashed);

		// Variables
		int t = 500000;
		int v = 60;
		int theta = -1 * angle.getValue();

		// Calculations for launch
		double radians = Math.toRadians(theta);
		double sin = Math.sin(radians);
		double cos = Math.cos(radians);
		int xInitial = e.getX();
		int yInitial = e.getY();
		int xFinal = 0;
		int yFinal = 0;
		int sizeValue = size.getValue();

		// Loop for launch and color
		for (int time = 0; time <= t; time++) {
			int x = (int) ((int) xInitial + (v * cos * time / 75000));
			int y = (int) ((int) yInitial + ((v * sin * time / 75000) + (9.8 * time / 75000 * (time / 75000) / 2)));
			// Changes in color
			if (color.getText().equals("Red")) {
				g.setColor(Color.red);
				g.fillOval(x, y, 2, 2);
			} else if (color.getText().equals("Green")) {
				g.setColor(Color.green);
				g.fillOval(x, y, 2, 2);
			} else if (color.getText().equals("Blue")) {
				g.setColor(Color.blue);
				g.fillOval(x, y, 2, 2);
			} else if (color.getText().equals("Cyan")) {
				g.setColor(Color.cyan);
				g.fillOval(x, y, 2, 2);
			} else if (color.getText().equals("Magenta")) {
				g.setColor(Color.magenta);
				g.fillOval(x, y, 2, 2);
			} else if (color.getText().equals("Yellow")) {
				g.setColor(Color.yellow);
				g.fillOval(x, y, 2, 2);
			}
			xFinal = x;
			yFinal = y;

			// Changes in shape
		}
		if (shape.getText().equals("Circle")) {
			g.drawOval(xFinal - (sizeValue / 4), yFinal - (sizeValue / 4), sizeValue / 2, sizeValue / 2);
		} else if (shape.getText().equals("Diamond")) {
			int[] x = { xFinal + sizeValue / 2, xFinal, xFinal - sizeValue / 2, xFinal };
			int[] y = { yFinal, yFinal + sizeValue / 2, yFinal, yFinal - sizeValue / 2 };
			g.drawPolygon(x, y, 4);
		} else if (shape.getText().equals("Triangle")) {
			int[] x = { xFinal, (int) (xFinal + (sizeValue / 2)), (int) (xFinal - (sizeValue / 2)) };
			int[] y = { yFinal - sizeValue / 2, (int) (yFinal + (sizeValue / 2)), (int) (yFinal + (sizeValue / 2)) };
			g.drawPolygon(x, y, 3);
		} else if (shape.getText().equals("Square")) {
			g.drawRect(xFinal - (sizeValue / 2), yFinal - (sizeValue / 2), sizeValue, sizeValue);
		} else if (shape.getText().equals("Rectangle")) {
			g.drawRect(xFinal - (sizeValue / 2), yFinal - (sizeValue / 2), sizeValue, sizeValue / 2);
		}
	}

	public void keyTyped(KeyEvent e) {
	}

	public void keyPressed(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
	}

	public void mouseDragged(MouseEvent e) {
	}

	public void mouseMoved(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}
}