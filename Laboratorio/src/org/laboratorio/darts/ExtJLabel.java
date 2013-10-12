package org.laboratorio.darts;

import java.awt.Color;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class ExtJLabel extends JLabel {

	private Color color;
	// private Color rosso = new Color(255, 0, 0);
	// private Color blue = new Color (0,0,255);
	private Color grigio = new Color(230, 230, 230);
	private boolean hasColor = false;

	public boolean isColored() {
		return hasColor;
	}

	public Color getColor() {
		return color;
	}

	public void setColoured(Color colore) {
		this.color = colore;
		this.setOpaque(true);
		this.setBackground(colore);
		if (colore != grigio) {
			hasColor = true;
		}
	}

	public void setUnColoured() {
		this.color = grigio;
		this.setOpaque(true);
		this.setBackground(grigio);
		hasColor = false;

	}

	public ExtJLabel() {
		this.color = grigio;
	}

}