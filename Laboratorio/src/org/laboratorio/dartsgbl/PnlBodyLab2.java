package org.laboratorio.dartsgbl;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PnlBodyLab2 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6866172652472739639L;
	private static PnlPlayerLab2[] pnlPlayerArray;
	private static JTextField[] txtNomeArray;
	private static JTextField[] txtPuntiArray;

	/**
	 * Create the panel.
	 */
	public PnlBodyLab2(int numeroGiocatori) {
		pnlPlayerArray = new PnlPlayerLab2[numeroGiocatori];
		txtNomeArray = new JTextField[numeroGiocatori];
		txtPuntiArray = new JTextField[numeroGiocatori];
		PnlPlayerLab2 pnlPlayer;
		JTextField txtPlayerName;
		JTextField txtPlayerPunti;
		setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 200, 200, 200, 200, 0 };
		gridBagLayout.rowHeights = new int[] { 30, 45, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0,
				Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		for (int i = 0; i < numeroGiocatori; i++) {
			txtPlayerName = new JTextField(i);
			txtPlayerName.setText("Nome Giocatore: " + i);
			txtNomeArray[i] = txtPlayerName;
			GridBagConstraints gbc_txtPlayerName = new GridBagConstraints();
			gbc_txtPlayerName.insets = new Insets(0, 5, 0, 5);
			gbc_txtPlayerName.fill = GridBagConstraints.BOTH;
			gbc_txtPlayerName.gridx = i;
			gbc_txtPlayerName.gridy = 0;
			add(txtPlayerName, gbc_txtPlayerName);

			txtPlayerPunti = new JTextField(i);
			txtPlayerPunti.setText("Punteggio: " + i);
			txtPuntiArray[i] = txtPlayerPunti;
			GridBagConstraints gbc_txtNewLabel = new GridBagConstraints();
			gbc_txtNewLabel.insets = new Insets(0, 5, 0, 5);
			gbc_txtNewLabel.fill = GridBagConstraints.BOTH;
			gbc_txtNewLabel.gridx = i;
			gbc_txtNewLabel.gridy = 1;
			add(txtPlayerPunti, gbc_txtNewLabel);
			
			pnlPlayer = new PnlPlayerLab2(i);
			pnlPlayerArray[i] = pnlPlayer;
			GridBagConstraints gbc_pnlPlayerLab2 = new GridBagConstraints();
			gbc_pnlPlayerLab2.insets = new Insets(5, 5, 5, 5);
			gbc_pnlPlayerLab2.fill = GridBagConstraints.BOTH;
			gbc_pnlPlayerLab2.gridx = i;
			gbc_pnlPlayerLab2.gridy = 2;
			add(pnlPlayer, gbc_pnlPlayerLab2);
		}

		setBackground(new Color(0, 0, 255));
		setOpaque(true);
		revalidate();
		repaint();
	}
}
