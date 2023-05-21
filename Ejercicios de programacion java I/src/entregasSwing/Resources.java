package entregasSwing;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Resources {
	public static ImageIcon addIcon;
	public static ImageIcon resetIcon;
	public static Font font;
	
	static {
		try {
			Image img = ImageIO.read(Resources.class.getResourceAsStream("/add.png")).getScaledInstance(32, 32, Image.SCALE_SMOOTH);
			addIcon = new ImageIcon(img);
			img = ImageIO.read(Resources.class.getResourceAsStream("/reset.png")).getScaledInstance(32, 32, Image.SCALE_SMOOTH);
			resetIcon = new ImageIcon(img);
		
			font = Font.createFont(Font.PLAIN, Resources.class.getResourceAsStream("/Digital Play Italic St.ttf")).deriveFont(30f);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}
