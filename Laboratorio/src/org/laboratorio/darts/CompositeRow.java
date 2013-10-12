package org.laboratorio.darts;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class CompositeRow extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// public int IDriga;
	// public JButton bottone;
	public boolean chiuso = false;
	private boolean morto = false;
	public ExtJLabel lblNumeroA;
	public ExtJLabel lblNumeroB;
	public ExtJLabel lblNumeroC;

	// private int IDpannello;

	// imposto i BORDI dei vari elementi
	private Border borderLblNumero = new EtchedBorder(EtchedBorder.RAISED,
			null, null);
	private Border borderBtnNumero = new EtchedBorder(EtchedBorder.RAISED,
			null, null);

	// private Border borderCompositeRow = new
	// EtchedBorder(EtchedBorder.LOWERED,
	// null, null);

	// metodo di creazione della CompositeRow
	public CompositeRow(final int idpannello, final int idriga) {
		this.setLayout(null);
		// this.setBorder(borderCompositeRow);

		// creo le JLabel dei Numeri
		lblNumeroA = new ExtJLabel();
		lblNumeroA.setBorder(borderLblNumero);
		lblNumeroA.setBounds(40, 2, 25, 15);
		lblNumeroA.setColoured(lblNumeroA.getColor());
		this.add(lblNumeroA);

		lblNumeroB = new ExtJLabel();
		lblNumeroB.setBorder(borderLblNumero);
		lblNumeroB.setBounds(80, 2, 25, 15);
		lblNumeroB.setColoured(lblNumeroB.getColor());
		this.add(lblNumeroB);

		lblNumeroC = new ExtJLabel();
		lblNumeroC.setBorder(borderLblNumero);
		lblNumeroC.setBounds(120, 2, 25, 15);
		lblNumeroC.setColoured(lblNumeroC.getColor());
		this.add(lblNumeroC);

		// creo il Bottone del Numero
		final JButton btnNumero = new JButton(idriga + 1 + "");
		btnNumero.setBounds(5, 2, 25, 15);
		this.add(btnNumero);
		btnNumero.setMargin(new Insets(2, 2, 2, 2));
		btnNumero.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNumero.setBorder(borderBtnNumero);
		btnNumero.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Color rosso = new Color(255, 51, 0);

				if (chiuso) {
					DartMain.incrementa(idpannello, idriga);
				}
				if (!lblNumeroA.isColored()) {
					lblNumeroA.setColoured(rosso);
				} else {
					if (!lblNumeroB.isColored()) {
						lblNumeroB.setColoured(rosso);
					} else {
						if (!lblNumeroC.isColored()) {
							lblNumeroC.setColoured(rosso);
							chiuso = true;
							morto = DartMain.numeroMorto(idriga);
							if (morto) {
								DartMain.cambiaColore(idpannello, idriga);
							}
						}
					}
				}
			}
		});

		// creo il Bottone ANNULLA Numero
		final JButton btnAnnullaNumero = new JButton(idriga + 1 + "");
		btnAnnullaNumero.setBounds(150, 2, 25, 15);
		this.add(btnAnnullaNumero);
		btnAnnullaNumero.setMargin(new Insets(2, 2, 2, 2));
		btnAnnullaNumero.setFont(new Font("Dialog", Font.BOLD, 12));
		btnAnnullaNumero.setBorder(borderBtnNumero);
		btnAnnullaNumero.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent f) {
				
				morto = DartMain.numeroNonMorto(idriga);
				if (morto) {
					lblNumeroC.setUnColoured();
					DartMain.riCambiaColore(idpannello, idriga);
				}

				if (lblNumeroC.isColored()) {
					lblNumeroC.setUnColoured();
					chiuso = false;

				} else {
					if (lblNumeroB.isColored()) {
						lblNumeroB.setUnColoured();
						chiuso = false;
					} else {
						if (lblNumeroA.isColored()) {
							lblNumeroA.setUnColoured();
							chiuso = false;
						}
					}
				}
			}
		});
	}

}