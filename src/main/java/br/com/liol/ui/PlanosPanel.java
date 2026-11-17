package br.com.liol.ui;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class PlanosPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PlanosPanel() {
		setBackground(new Color(0, 0, 0));
		setBounds(10, 10, 680, 483);
		setLayout(null);
		
		JLabel lblPlanos = new JLabel("Planos");
		lblPlanos.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlanos.setForeground(Color.WHITE);
		lblPlanos.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPlanos.setBounds(259, 43, 161, 20);
		add(lblPlanos);
	}

}
