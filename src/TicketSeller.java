import javax.swing.JFrame;

//Kristi Mathis

public class TicketSeller {

	public static void main(String[] args) {
		
		Tickets b = new Tickets(45);

		JFrame frame = new TicketSellerFrame(b);
		frame.setSize(325,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
}
