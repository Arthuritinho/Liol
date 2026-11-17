package br.com.liol.ui;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class PontoPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PontoPanel() {
		setBackground(new Color(0, 0, 0));
		setBounds(10, 10, 680, 483);
		setLayout(null);
		
		JLabel lblPonto = new JLabel("Ponto");
		lblPonto.setHorizontalAlignment(SwingConstants.CENTER);
		lblPonto.setForeground(Color.WHITE);
		lblPonto.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPonto.setBounds(259, 43, 161, 20);
		add(lblPonto);
	}

}
