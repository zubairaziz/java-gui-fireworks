
/* Author: Zubair Ab Aziz
 * Assignment: Project3
 * Lab Section: MW, 1230-1345
 * TA Name: Sofia
 * Collaboration: I did not collaborate with anyone on this assignment
 */

import java.awt.*;
import javax.swing.*;

// Canvas class where everything will be drawn on
public class Canvas extends JFrame {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

		Fireworks canvas = new Fireworks();
		JFrame frame = new JFrame("Fireworks");
		JPanel panel = new JPanel();

		canvas.requestFocus();
		canvas.setBackground(Color.WHITE);

		panel.setLayout(new BorderLayout());
		panel.add(canvas);

		frame.add(panel);
		frame.setSize(1600, 900);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}