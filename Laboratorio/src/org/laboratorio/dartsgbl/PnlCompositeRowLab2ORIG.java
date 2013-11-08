package org.laboratorio.dartsgbl;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.Color;

public class PnlCompositeRowLab2ORIG extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5976457241163890455L;
	private boolean pnlChiuso;
	private boolean pnlMorto;
	

	/**
	 * Create the panel.
	 */
	public PnlCompositeRowLab2ORIG(final int idpannello, final int idriga) {
		Insets internalPadding = new Insets(2, 2, 2, 2);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{45, 30, 30, 30, 20, 0};
		gridBagLayout.rowHeights = new int[]{3, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		String btnLabel = (idriga + 1 + "");
		if (idriga==20) {
			btnLabel = "Bull";
		}
		JButton btnPreso = new JButton(btnLabel);
		btnPreso.setMargin(new Insets(0, 0, 0, 0));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = internalPadding;
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 0;
		add(btnPreso, gbc_btnNewButton);

		JLabel lblNewLabel1 = new JLabel("");
		lblNewLabel1.setBackground(Color.RED);
		lblNewLabel1.setOpaque(true);
		GridBagConstraints gbc_lblNewLabel1 = new GridBagConstraints();
		gbc_lblNewLabel1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel1.insets = internalPadding;
		gbc_lblNewLabel1.gridx = 1;
		gbc_lblNewLabel1.gridy = 0;
		add(lblNewLabel1, gbc_lblNewLabel1);

		JLabel lblNewLabel2 = new JLabel("");
		lblNewLabel2.setBackground(Color.RED);
		lblNewLabel2.setOpaque(true);
		GridBagConstraints gbc_lblNewLabel2 = new GridBagConstraints();
		gbc_lblNewLabel2.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel2.insets = internalPadding;
		gbc_lblNewLabel2.gridx = 2;
		gbc_lblNewLabel2.gridy = 0;
		add(lblNewLabel2, gbc_lblNewLabel2);

		JLabel lblNewLabel3 = new JLabel("");
		lblNewLabel3.setBackground(Color.RED);
		lblNewLabel3.setOpaque(true);
		GridBagConstraints gbc_lblNewLabel3 = new GridBagConstraints();
		gbc_lblNewLabel3.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel3.insets = internalPadding;
		gbc_lblNewLabel3.gridx = 3;
		gbc_lblNewLabel3.gridy = 0;
		add(lblNewLabel3, gbc_lblNewLabel3);

		JButton btnTogli = new JButton("");
		btnTogli.setMaximumSize(new Dimension(10,10));
		btnTogli.setMinimumSize(new Dimension(10,10));
		btnTogli.setPreferredSize(new Dimension(10,10));
		GridBagConstraints gbc_btnTogli = new GridBagConstraints();
		gbc_btnTogli.fill = GridBagConstraints.NONE;
		gbc_btnTogli.insets = internalPadding;
		gbc_btnTogli.gridx = 5;
		gbc_btnTogli.gridy = 0;
		add(btnTogli, gbc_btnTogli);
	}
}