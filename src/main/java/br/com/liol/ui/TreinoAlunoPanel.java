//VERSÃO INICIAL - MUITO AINDA NEM FAZ NADA
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
import javax.swing.JButton;

public class TreinoAlunoPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldNome;
	private JTextField textFieldObjetivo;
	private JTextField textFieldTreino;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public TreinoAlunoPanel() {
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
		panel.setBounds(43, 88, 594, 315);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setBounds(10, 13, 42, 17);
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNome.setForeground(new Color(255, 255, 255));
		panel.add(lblNome);
		
		textFieldNome = new JTextField();
		textFieldNome.setForeground(new Color(255, 255, 255));
		textFieldNome.setColumns(10);
		textFieldNome.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		textFieldNome.setBackground(Color.BLACK);
		textFieldNome.setBounds(66, 13, 96, 18);
		panel.add(textFieldNome);
		
		JLabel lblObjetivo = new JLabel("Objetivo");
		lblObjetivo.setHorizontalAlignment(SwingConstants.CENTER);
		lblObjetivo.setForeground(Color.WHITE);
		lblObjetivo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblObjetivo.setBounds(176, 13, 78, 17);
		panel.add(lblObjetivo);
		
		textFieldObjetivo = new JTextField();
		textFieldObjetivo.setForeground(new Color(255, 255, 255));
		textFieldObjetivo.setColumns(10);
		textFieldObjetivo.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		textFieldObjetivo.setBackground(Color.BLACK);
		textFieldObjetivo.setBounds(268, 13, 96, 18);
		panel.add(textFieldObjetivo);
		
		textFieldTreino = new JTextField();
		textFieldTreino.setForeground(new Color(255, 255, 255));
		textFieldTreino.setColumns(10);
		textFieldTreino.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		textFieldTreino.setBackground(Color.BLACK);
		textFieldTreino.setBounds(470, 13, 96, 18);
		panel.add(textFieldTreino);
		
		JLabel lblObjetivo_1 = new JLabel("Treino");
		lblObjetivo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblObjetivo_1.setForeground(Color.WHITE);
		lblObjetivo_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblObjetivo_1.setBounds(378, 13, 78, 17);
		panel.add(lblObjetivo_1);
		
		JButton btnA = new JButton("A");
		btnA.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnA.setForeground(new Color(0, 0, 0));
		btnA.setBackground(new Color(124, 77, 255));
		btnA.setBounds(20, 41, 42, 32);
		panel.add(btnA);
		
		JButton btnB = new JButton("B");
		btnB.setForeground(Color.BLACK);
		btnB.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnB.setBackground(new Color(124, 77, 255));
		btnB.setBounds(76, 41, 42, 32);
		panel.add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.setForeground(Color.BLACK);
		btnC.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnC.setBackground(new Color(124, 77, 255));
		btnC.setBounds(133, 41, 42, 32);
		panel.add(btnC);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(new Color(124, 77, 255), 2));
		scrollPane.setBackground(new Color(0, 0, 0));
		scrollPane.setBounds(19, 84, 556, 221);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Exerc\u00EDcio", "N\u00B0 S\u00E9ries", "Repeti\u00E7\u00F5es"
			}
		));
		table.getColumnModel().getColumn(0).setMinWidth(25);
		table.getColumnModel().getColumn(1).setPreferredWidth(80);
		table.getColumnModel().getColumn(2).setPreferredWidth(92);
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setForeground(new Color(124, 77, 255));
		table.setBackground(new Color(0, 0, 0));
		scrollPane.setViewportView(table);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEditar.setForeground(new Color(124, 77, 255));
		btnEditar.setBounds(156, 437, 106, 20);
		add(btnEditar);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setForeground(new Color(124, 77, 255));
		btnImprimir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnImprimir.setBounds(418, 437, 106, 20);
		add(btnImprimir);
	}
}
