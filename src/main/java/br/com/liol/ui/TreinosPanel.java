package br.com.liol.ui;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;
import javax.swing.JTextField;

public class TreinosPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public TreinosPanel() {
		setPreferredSize(new Dimension(680, 483));
		setForeground(new Color(255, 255, 255));
		setBackground(new Color(0, 0, 0));
		setLayout(null);
		
		JLabel lblTreinos = new JLabel("Treinos");
		lblTreinos.setHorizontalAlignment(SwingConstants.CENTER);
		lblTreinos.setForeground(Color.WHITE);
		lblTreinos.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTreinos.setBounds(259, 43, 161, 20);
		add(lblTreinos);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(124, 77, 255), 2));
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(43, 88, 594, 344);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblObjetivo = new JLabel("Objetivo");
		lblObjetivo.setHorizontalAlignment(SwingConstants.CENTER);
		lblObjetivo.setForeground(Color.WHITE);
		lblObjetivo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblObjetivo.setBounds(111, 10, 78, 17);
		panel.add(lblObjetivo);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		textField_1.setBackground(Color.BLACK);
		textField_1.setBounds(203, 10, 96, 18);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		textField_2.setBackground(Color.BLACK);
		textField_2.setBounds(405, 10, 96, 18);
		panel.add(textField_2);
		
		JLabel lblObjetivo_1 = new JLabel("Treino");
		lblObjetivo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblObjetivo_1.setForeground(Color.WHITE);
		lblObjetivo_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblObjetivo_1.setBounds(313, 10, 78, 17);
		panel.add(lblObjetivo_1);
	}
}
