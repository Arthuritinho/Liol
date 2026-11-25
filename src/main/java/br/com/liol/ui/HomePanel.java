package br.com.liol.ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class HomePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public HomePanel() {
		setBackground(new Color(0, 0, 0));
		setLayout(null);
		setBounds(10, 10, 680, 483);
		
		JLabel lblLogo = new JLabel();
		lblLogo.setIcon(new ImageIcon(getClass().getResource("/assets/liol_logo.jpg"));
		lblLogo.setBounds(249, 150, 200, 200);
		add(lblLogo);
		
		JLabel lblLiol = new JLabel("LIOL");
		lblLiol.setHorizontalAlignment(SwingConstants.CENTER);
		lblLiol.setForeground(new Color(124, 77, 255));
		lblLiol.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblLiol.setBounds(279, 67, 122, 58);
		add(lblLiol);
		
		JLabel lblSubtitle = new JLabel("Seu gestor de academia");
		lblSubtitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubtitle.setForeground(Color.WHITE);
		lblSubtitle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSubtitle.setBounds(257, 135, 165, 17);
		add(lblSubtitle);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setForeground(new Color(124, 77, 255));
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSair.setBounds(294, 396, 91, 21);
		add(btnSair);

		btnSair.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        MenuBase menu =
		            (MenuBase) SwingUtilities.getWindowAncestor(HomePanel.this);

		        menu.logout();
		    }
		});

	}

}
