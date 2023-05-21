package entregasSwing;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class Moon extends JLabel{
	
	private static final Phase[] phases = {
			new Phase ("New Moon"),
			new Phase ("Waxing Crescent"),
			new Phase ("First Quarter"),
			new Phase ("Waxing Gibbous"),
			new Phase ("Full Moon"),
			new Phase ("Waning Gibbous"),
			new Phase ("Third Quarter"),
			new Phase ("Waning Crescent")
	};
	
	private int atPhase;
	
	public Moon() {
		super(phases[0].getName(), phases[0].getImage(), JLabel.CENTER);
		setVerticalAlignment(CENTER);
		setHorizontalTextPosition(CENTER);
		setVerticalTextPosition(BOTTOM);
		setForeground(Color.WHITE);
		setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
	}
	
	public void next() {
		if (atPhase+1 == phases.length) atPhase = 0; 
		else atPhase++;
		setText(phases[atPhase].getName());
		setIcon(phases[atPhase].getImage());
	}

	public void previous() {
		if (atPhase-1 == 0) atPhase = phases.length-1;
		else atPhase--;
		setText(phases[atPhase].getName());
		setIcon(phases[atPhase].getImage());
	}

	public static Phase[] getPhases() {
		return phases;
	}
		
}
