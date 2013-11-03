package org.laboratorio.dartsgbl;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Color;

public class PnlCompositeRow extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5976457241163890455L;

	/**
	 * Create the panel.
	 */
	public PnlCompositeRow(final int idpannello, final int idriga) {
		//setMinimumSize(new Dimension(230, 30));
		Insets internalPadding = new Insets(2, 2, 2, 2);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{45, 30, 30, 30, 30, 0};
		gridBagLayout.rowHeights = new int[]{3, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0,1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,1.0};
		setLayout(gridBagLayout);
		
		String btnLabel = (idriga + 1 + "");
		if (idriga==20) {
			btnLabel = "Bull";
		}
		JButton btnNewButton = new JButton(btnLabel);
		btnNewButton.setMargin(new Insets(0, 0, 0, 0));
//		setMinimumSize(new Dimension(45,25));
//		setMinimumSize(new Dimension(45,25));
//		setPreferredSize(new Dimension(45,25));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = internalPadding;
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 0;
		add(btnNewButton, gbc_btnNewButton);
		
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
		
		JLabel lblNewLabel_3 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_3.insets = internalPadding;
		gbc_lblNewLabel_3.gridx = 4;
		gbc_lblNewLabel_3.gridy = 0;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
	}
}