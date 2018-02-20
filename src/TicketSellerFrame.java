import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//Kristi Mathis
public class TicketSellerFrame extends JFrame {

	Tickets seller;
	private JLabel instructions = new JLabel("Enter the number of tickets to buy (1-6)");
	private JTextField ticketsBought = new JTextField(5);
	private JButton buy = new JButton("Buy Tickets");
	private JLabel results = new JLabel("");

	TicketDrawing drawing = new TicketDrawing();

	private JLabel ticketsSoldOut = new JLabel();

	public TicketSellerFrame(Tickets b) {

		seller = b;

		JPanel panel = new JPanel();
		panel.add(instructions);
		panel.add(ticketsBought);
		panel.add(buy);
		panel.add(results);
		panel.add(drawing);
		panel.add(ticketsSoldOut);
		drawing.setPreferredSize(new Dimension(200, 60));

		BuyButtonListener bbl = new BuyButtonListener();
		buy.addActionListener(bbl);
		add(panel);

	}

	class BuyButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int soldOut = 0;
			try {
				Integer tickets = Integer.parseInt(ticketsBought.getText());
				if (tickets < seller.getMIN_TICKETS() || tickets > seller.getMAX_TICKETS()) {
					results.setText(
							"Enter between 1 and 6 tickets. " + seller.getTicketsAvailable() + " tickets available.");
					ticketsBought.setText("");
				} else if (tickets > seller.getTicketsAvailable()) {
					results.setText("There are only " + seller.getTicketsAvailable() + " tickets available.");
					ticketsBought.setText("");
				} else {
					seller.setTicketsAvailable(tickets);
					seller.setTicketsSold(tickets);
					results.setText(
							"Bought " + tickets + " tickets. " + seller.getTicketsAvailable() + " tickets available.");

					drawing.adjustFill(seller.determinePercentage());
				}
				if (soldOut == seller.getTicketsAvailable()) {
					results.setText(seller.getTicketsAvailable() + " tickets available.");
					drawing.adjustFill(seller.determinePercentage());
					ticketsSoldOut.setText("Event is sold out.");

				}
			} catch (NumberFormatException n) {
				results.setText("Error. Please enter only a number between 1 and 6.");
				ticketsBought.setText("");
			}

		}
	}
}
