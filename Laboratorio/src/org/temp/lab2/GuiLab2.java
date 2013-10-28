package org.temp.lab2;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class GuiLab2 extends JFrame {

	private static final long serialVersionUID = 5375213009082631974L;
	private JPanel contentPane;
	private static PnlPlayerLab2[] pnlPlayerArray;
	private static JPanel contentPanePlayer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiLab2 frame = new GuiLab2();
					frame.setLocationRelativeTo(null);
					frame.pack();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//	public static void buildIt(int giocatori) {
//		contentPanePlayer.removeAll();
//		contentPanePlayer.repaint();
//		panelArray = new PlayerPanel[giocatori];
//		mortoArray = new boolean[21];
//		int width = 190;
//		int height = 550;
//		PlayerPanel pnlPlayer;
//		for (int i = 0; i < giocatori; i++) {
//			pnlPlayer = new PlayerPanel(i);
//			pnlPlayer.setBounds((width + 5) * i, 5, width, height);
//			pnlPlayer.setLayout(null);
//			panelArray[i] = pnlPlayer;
//			contentPanePlayer.add(pnlPlayer);
//		}
//	}
	
	/**
	 * Create the frame.
	 */
	public GuiLab2() {
		setTitle("GuiLab2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(800, 600));
		int numeroGiocatori = PnlIntestazioneLab2.getSelectedVal();

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);

		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{400, 400, 0};
		gbl_contentPane.rowHeights = new int[]{50, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);

		PnlIntestazioneLab2 pnlIntestazioneLab2 = new PnlIntestazioneLab2();
		GridBagConstraints gbc_pnlIntestazioneLab2 = new GridBagConstraints();
		gbc_pnlIntestazioneLab2.gridwidth = 2;
		gbc_pnlIntestazioneLab2.insets = new Insets(0, 0, 5, 5);
		gbc_pnlIntestazioneLab2.fill = GridBagConstraints.BOTH;
		gbc_pnlIntestazioneLab2.gridx = 0;
		gbc_pnlIntestazioneLab2.gridy = 0;
		gbc_pnlIntestazioneLab2.weightx = 0;
		gbc_pnlIntestazioneLab2.weighty = 0;
		contentPane.add(pnlIntestazioneLab2, gbc_pnlIntestazioneLab2);

		for (int i = 0; i < numeroGiocatori; i++){
			
		}
//		PnlPlayerLab2 panelLab2 = new PnlPlayerLab2();
//		GridBagConstraints gbc_panelLab2 = new GridBagConstraints();
//		//gbc_panelLab2.gridwidth = 2;
//		gbc_panelLab2.insets = new Insets(0, 0, 0, 5);
//		//gbc_panelLab2.fill = GridBagConstraints.BOTH;
//		gbc_panelLab2.gridx = 0;
//		gbc_panelLab2.gridy = 1;
//		gbc_panelLab2.weightx =0;
//		gbc_panelLab2.weighty = 1;
//		contentPane.add(panelLab2, gbc_panelLab2);
//		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{pnlIntestazioneLab2, panelLab2}));
//		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{pnlIntestazioneLab2, contentPane, panelLab2}));
	}
}
