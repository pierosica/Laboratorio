package org.laboratorio.dartsgbl;

import java.awt.Color;

import javax.swing.JLabel;

public class LblNumeroLab2 extends JLabel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4695211666254273657L;
	private Color color;
	private Color grigio = new Color(230, 230, 230);
	private Color rosso = new Color(255, 0, 0);
	private Color blue = new Color(0, 0, 255);
	private boolean lblPreso = false;
	private boolean lblMorto = false;

	public boolean isPreso() {
		return lblPreso;
	}

	public void setPreso(boolean preso) {
		if (preso) {
			this.lblPreso = preso;
			this.color = rosso;
			this.setBackground(color);
		} else {
			this.lblPreso = preso;
			this.color = grigio;
			this.setBackground(color);
			this.setOpaque(true);
		}
	}

	public boolean isMorto() {
		return lblMorto;
	}

	public void setMorto(boolean morto) {
		this.lblMorto  = morto;
		this.color = blue;
		this.setBackground(color);
		this.setOpaque(true);
		
	}

	public LblNumeroLab2() {
		this.setBackground(grigio);
		this.setOpaque(true);
	}
}