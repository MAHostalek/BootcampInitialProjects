package eclipestour;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ConquerPrinter {



	    public static void Printaaa(String x) {
	        final JFrame parent = new JFrame();
	        JButton button = new JButton();

	        button.setText(x);
	        parent.add(button);
	        parent.pack();
	        parent.setVisible(true);


	}
}
