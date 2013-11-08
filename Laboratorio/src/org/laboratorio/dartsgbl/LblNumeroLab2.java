package org.laboratorio.dartsgbl;

import java.awt.Color;

import javax.swing.JLabel;

public class LblNumeroLab2 extends JLabel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4695211666254273657L;
	private Color grigio = new Color(230, 230, 230);
	private Color rosso = new Color(255, 0, 0);
	private Color blue = new Color(0, 0, 255);

	private boolean lblPreso;
	private boolean lblMorto;
	
	public boolean isPreso() {
		return lblPreso;
	}

	public void setPreso(boolean preso) {
		if (preso){
			this.lblPreso = preso;
			this.setBackground(rosso);
		} else {
			this.lblPreso = preso;
			this.setBackground(grigio);
		}
	}

	public boolean isLblMorto() {
		return lblMorto;
	}

	public void setLblMorto(boolean lblMorto) {
		this.lblMorto = lblMorto;
		this.setBackground(blue);
	}

	public LblNumeroLab2() {
		this.setBackground(grigio);
		this.setOpaque(true);
}
}
