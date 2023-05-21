package entregasSwing;

import javax.swing.ImageIcon;

public class Phase {
	
	private String name;
	private ImageIcon image;
	
	public Phase (String name) {
		this.name = name;
		image = new ImageIcon(getClass().getResource(String.format("/%s.png", name)));
	}

	public String getName() {
		return name;
	}

	public ImageIcon getImage() {
		return image;
	}
}
