package br.com.liol.ui;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;

public class MenuFuncionariosPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public MenuFuncionariosPanel() {
		setBackground(new Color(0, 0, 0));
		setBounds(10, 10, 680, 483);
		setLayout(null);
		
		JLabel lblMenuFuncionarios = new JLabel("Menu Funcionários");
		lblMenuFuncionarios.setBounds(259, 43, 161, 20);
		lblMenuFuncionarios.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblMenuFuncionarios);
		lblMenuFuncionarios.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMenuFuncionarios.setForeground(new Color(255, 255, 255));
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(284, 415, 111, 21);
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(btnCadastrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(51, 91, 577, 295);
		add(scrollPane);
		
		JList list = new JList();
		list.setForeground(new Color(124, 77, 255));
		list.setBackground(new Color(0, 0, 0));
		list.setVisibleRowCount(3);
		list.setFont(new Font("Tahoma", Font.PLAIN, 16));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Pichu - ID", "Pikachu - ID", "Raichu - ID", "Eevee - ID", "Vaporeon - ID", "Umbreon - ID", "Jolteon - ID", "Leafeon - ID", "Flareon - ID", "Glaceon - ID", "Espeon - ID", "Sylveon - ID", "Charmander - ID", "Charmeleon - ID", "Charizard - ID"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list);

	}
}
