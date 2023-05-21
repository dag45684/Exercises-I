package entregasSwing;

import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainCounter extends JFrame{
	
	MainCounter(String[] args) {
    	super("MyApp");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container content = getContentPane();
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        Counter [] h = new Counter[3];
        Counter g = new Counter(h);
        for (int i=0; i<3; i++)
        	content.add(h[i] = new Counter(g));
        content.add(g);
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(final String[] args) {
        SwingUtilities.invokeLater(() -> new MainCounter(args).setVisible(true));
    }
}