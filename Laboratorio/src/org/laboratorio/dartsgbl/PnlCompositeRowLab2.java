package org.laboratorio.dartsgbl;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PnlCompositeRowLab2 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5976457241163890455L;
	public LblNumeroLab2 lblNumeroA;
	public LblNumeroLab2 lblNumeroB;
	public LblNumeroLab2 lblNumeroC;
	private static boolean rowChiusa;
	private static boolean rowMorta;

	public boolean isRowChiusa(int idpannello, int idriga) {
		return rowChiusa;
	}

	public void setRowChiusa(boolean rowChiusa) {
		PnlCompositeRowLab2.rowChiusa = rowChiusa;
	}

	public boolean isRowMorta(int idriga) {
		return rowMorta;
	}

	public void setRowMorta(int idpannello, int idriga) {
		// lblNumeroA.setLblMorto(true);
	}

	/**
	 * Create the panel.
	 */
	public PnlCompositeRowLab2(final int idpannello, final int idriga) {
		Insets internalPadding = new Insets(2, 2, 2, 2);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 45, 30, 30, 30, 20 };
		gridBagLayout.rowHeights = new int[] { 3, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 0.0,
				Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		lblNumeroA = new LblNumeroLab2();
		GridBagConstraints gbc_lblNewLabel1 = new GridBagConstraints();
		gbc_lblNewLabel1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel1.insets = new Insets(2, 2, 2, 5);
		gbc_lblNewLabel1.gridx = 1;
		gbc_lblNewLabel1.gridy = 0;
		add(lblNumeroA, gbc_lblNewLabel1);

		lblNumeroB = new LblNumeroLab2();
		lblNumeroB.setOpaque(true);
		GridBagConstraints gbc_lblNewLabel2 = new GridBagConstraints();
		gbc_lblNewLabel2.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel2.insets = new Insets(2, 2, 2, 5);
		gbc_lblNewLabel2.gridx = 2;
		gbc_lblNewLabel2.gridy = 0;
		add(lblNumeroB, gbc_lblNewLabel2);

		lblNumeroC = new LblNumeroLab2();
		lblNumeroC.setOpaque(true);
		GridBagConstraints gbc_lblNewLabel3 = new GridBagConstraints();
		gbc_lblNewLabel3.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel3.insets = new Insets(2, 2, 2, 5);
		gbc_lblNewLabel3.gridx = 3;
		gbc_lblNewLabel3.gridy = 0;
		add(lblNumeroC, gbc_lblNewLabel3);

		String btnLabel = (idriga + 1 + "");
		if (idriga == 20) {
			btnLabel = "Bull";
		}
		JButton btnPreso = new JButton(btnLabel);
		btnPreso.setMargin(new Insets(0, 0, 0, 0));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(2, 2, 2, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 0;
		btnPreso.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (!lblNumeroA.isPreso()) {
					lblNumeroA.setPreso(true);
					rowChiusa = false;
					rowMorta=PnlBodyLab2.isNumeroMorto(idriga);
				} else {
					if (!lblNumeroB.isPreso()) {
						lblNumeroB.setPreso(true);
						rowChiusa = false;
						rowMorta=PnlBodyLab2.isNumeroMorto(idriga);
					} else {
						if (!lblNumeroC.isPreso()) {
							lblNumeroC.setPreso(true);
							rowChiusa = true;
							rowMorta=PnlBodyLab2.isNumeroMorto(idriga);
						}
					}
				}

//				System.out.println("idpannello: " + idpannello);
//				System.out.println("idrow; " + idriga);
//				System.out.println("rowchiusa: " + rowChiusa);
//				System.out.println("rowmorta: " + rowMorta);
//				System.out.println("lblNumeroA presa:" + lblNumeroA.isPreso());
//				System.out.println("lblNumeroB presa:" + lblNumeroB.isPreso());
//				System.out.println("lblNumeroC presa:" + lblNumeroC.isPreso());

			}
		});
		add(btnPreso, gbc_btnNewButton);

		JButton btnTogli = new JButton("");
		btnTogli.setMaximumSize(new Dimension(10, 10));
		btnTogli.setMinimumSize(new Dimension(10, 10));
		btnTogli.setPreferredSize(new Dimension(10, 10));
		GridBagConstraints gbc_btnTogli = new GridBagConstraints();
		gbc_btnTogli.fill = GridBagConstraints.NONE;
		gbc_btnTogli.insets = internalPadding;
		gbc_btnTogli.gridx = 5;
		gbc_btnTogli.gridy = 0;
		add(btnTogli, gbc_btnTogli);
	}
}