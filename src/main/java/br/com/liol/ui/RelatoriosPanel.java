package br.com.liol.ui;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;

public class RelatoriosPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public RelatoriosPanel() {
		setBackground(new Color(0, 0, 0));
		setBounds(10, 10, 680, 483);
		setLayout(null);
		
		JLabel lblRelatorios = new JLabel("Relatórios");
		lblRelatorios.setHorizontalAlignment(SwingConstants.CENTER);
		lblRelatorios.setForeground(Color.WHITE);
		lblRelatorios.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRelatorios.setBounds(259, 43, 161, 20);
		add(lblRelatorios);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(0, 0, 0));
		panelMenu.setBounds(10, 82, 330, 391);
		add(panelMenu);
		panelMenu.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(18, 39, 103, 21);
		panelMenu.add(rdbtnNewRadioButton);
	}
}
