import java.awt.Color;
import java.awt.Graphics;
//Kristi Mathis

import javax.swing.JComponent;

public class TicketDrawing extends JComponent {
	
	private int x = 10;
	private int y = 10;
	private int totalLength = 150;
	private int height = 30;
	private int fillForFirstSection = 0;
	
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.black);
		g.drawRect(x, y, totalLength, height);
		g.setColor(Color.blue);
		g.fillRect(x, y, fillForFirstSection, height);
		
	}

	public void adjustFill(double fillAmount) {
		// TODO Auto-generated method stub
		double fill = totalLength * fillAmount;
		fillForFirstSection = (int)fill;
		repaint();
		
	}

}
