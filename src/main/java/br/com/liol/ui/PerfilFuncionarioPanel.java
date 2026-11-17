package br.com.liol.ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class PerfilFuncionarioPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldNome;
	private JTextField textFieldCPF;
	private JTextField textFieldDataNasc;
	private JLabel lblNome;
	private JLabel lblCPF;
	private JLabel lblDataNasc;
	private JLabel lblTelefone;
	private JLabel lblSalario;
	private JTextField textFieldTelefone;
	private JTextField textFieldSalario;
	private JLabel lblStatus;
	private JLabel lblCargo;
	private JTextField textFieldAdmissao;
	private JLabel lblAdmissao;
	private JLabel lblEndereco;
	private JTextField textFieldEndereco;
	private JTextField textFieldEmail;
	private JLabel lblEmail;
	private JTextField txtCra;
	private JTextField txtCref;
	private final ButtonGroup btnGroupCargo = new ButtonGroup();
	private final ButtonGroup btnGroupStatus = new ButtonGroup();
	private JLabel lblCREF;
	private JLabel lblCRA;

	/**
	 * Create the panel.
	 */
	public PerfilFuncionarioPanel() {
		setForeground(new Color(128, 128, 192));
		setBackground(new Color(0, 0, 0));
		setLayout(null);
		
		JLabel lblTitulo = new JLabel("Perfil funcionário");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setBounds(265, 43, 150, 20);
		add(lblTitulo);
		
		textFieldNome = new JTextField();
		textFieldNome.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		textFieldNome.setBackground(Color.BLACK);
		textFieldNome.setBounds(178, 102, 96, 18);
		add(textFieldNome);
		textFieldNome.setColumns(10);
		
		textFieldCPF = new JTextField();
		textFieldCPF.setBackground(Color.BLACK);
		textFieldCPF.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		textFieldCPF.setBounds(178, 130, 96, 18);
		add(textFieldCPF);
		textFieldCPF.setColumns(10);
		
		textFieldDataNasc = new JTextField();
		textFieldDataNasc.setBackground(Color.BLACK);
		textFieldDataNasc.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		textFieldDataNasc.setBounds(178, 158, 96, 18);
		add(textFieldDataNasc);
		textFieldDataNasc.setColumns(10);
		
		lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setForeground(new Color(255, 255, 255));
		lblNome.setBounds(58, 102, 44, 17);
		add(lblNome);
		
		lblCPF = new JLabel("CPF");
		lblCPF.setForeground(Color.WHITE);
		lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCPF.setBounds(58, 129, 44, 17);
		add(lblCPF);
		
		lblDataNasc = new JLabel("Data nascimento");
		lblDataNasc.setForeground(Color.WHITE);
		lblDataNasc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDataNasc.setBounds(58, 157, 128, 17);
		add(lblDataNasc);
		
		lblTelefone = new JLabel("Telefone");
		lblTelefone.setForeground(Color.WHITE);
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelefone.setBounds(58, 185, 80, 17);
		add(lblTelefone);
		
		lblSalario = new JLabel("Salário");
		lblSalario.setForeground(Color.WHITE);
		lblSalario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSalario.setBounds(58, 269, 44, 17);
		add(lblSalario);
		
		textFieldTelefone = new JTextField();
		textFieldTelefone.setColumns(10);
		textFieldTelefone.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		textFieldTelefone.setBackground(Color.BLACK);
		textFieldTelefone.setBounds(178, 184, 96, 18);
		add(textFieldTelefone);
		
		textFieldSalario = new JTextField();
		textFieldSalario.setColumns(10);
		textFieldSalario.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		textFieldSalario.setBackground(Color.BLACK);
		textFieldSalario.setBounds(178, 270, 96, 18);
		add(textFieldSalario);
		
		JRadioButton rdbtnGerente = new JRadioButton("Gerente");
		btnGroupCargo.add(rdbtnGerente);
		rdbtnGerente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnGerente.setBackground(Color.BLACK);
		rdbtnGerente.setForeground(Color.WHITE);
		rdbtnGerente.setBounds(430, 290, 91, 20);
		add(rdbtnGerente);
		
		JRadioButton rdbtnInstrutor = new JRadioButton("Instrutor");
		btnGroupCargo.add(rdbtnInstrutor);
		rdbtnInstrutor.setForeground(Color.WHITE);
		rdbtnInstrutor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnInstrutor.setBackground(Color.BLACK);
		rdbtnInstrutor.setBounds(430, 268, 91, 20);
		add(rdbtnInstrutor);
		
		JRadioButton rdbtnRecepcionista = new JRadioButton("Recepcionista");
		btnGroupCargo.add(rdbtnRecepcionista);
		rdbtnRecepcionista.setForeground(Color.WHITE);
		rdbtnRecepcionista.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnRecepcionista.setBackground(Color.BLACK);
		rdbtnRecepcionista.setBounds(430, 246, 156, 20);
		add(rdbtnRecepcionista);
		
		JRadioButton rdbtnExpirada = new JRadioButton("Férias");
		btnGroupStatus.add(rdbtnExpirada);
		rdbtnExpirada.setForeground(Color.WHITE);
		rdbtnExpirada.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnExpirada.setBackground(Color.BLACK);
		rdbtnExpirada.setBounds(430, 148, 156, 20);
		add(rdbtnExpirada);
		
		JRadioButton rdbtnLicenca = new JRadioButton("Licença");
		btnGroupStatus.add(rdbtnLicenca);
		rdbtnLicenca.setForeground(Color.WHITE);
		rdbtnLicenca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnLicenca.setBackground(Color.BLACK);
		rdbtnLicenca.setBounds(430, 170, 156, 20);
		add(rdbtnLicenca);
		
		JRadioButton rdbtnAtivo = new JRadioButton("Ativo");
		btnGroupStatus.add(rdbtnAtivo);
		rdbtnAtivo.setForeground(Color.WHITE);
		rdbtnAtivo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnAtivo.setBackground(Color.BLACK);
		rdbtnAtivo.setBounds(430, 126, 156, 20);
		add(rdbtnAtivo);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setForeground(new Color(124, 77, 255));
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEditar.setBounds(132, 422, 91, 21);
		add(btnEditar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setForeground(new Color(124, 77, 255));
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSalvar.setBounds(289, 422, 91, 21);
		add(btnSalvar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setForeground(new Color(124, 77, 255));
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnExcluir.setBounds(446, 422, 91, 21);
		add(btnExcluir);
		
		lblStatus = new JLabel("STATUS");
		lblStatus.setForeground(new Color(255, 255, 255));
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblStatus.setBounds(430, 99, 112, 18);
		add(lblStatus);
		
		lblCargo = new JLabel("CARGO");
		lblCargo.setForeground(Color.WHITE);
		lblCargo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCargo.setBounds(430, 217, 96, 18);
		add(lblCargo);
		
		textFieldAdmissao = new JTextField();
		textFieldAdmissao.setColumns(10);
		textFieldAdmissao.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		textFieldAdmissao.setBackground(Color.BLACK);
		textFieldAdmissao.setBounds(178, 241, 96, 18);
		add(textFieldAdmissao);
		
		lblAdmissao = new JLabel("Admissão");
		lblAdmissao.setForeground(Color.WHITE);
		lblAdmissao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAdmissao.setBounds(58, 242, 80, 17);
		add(lblAdmissao);
		
		lblEndereco = new JLabel("Endereço");
		lblEndereco.setForeground(Color.WHITE);
		lblEndereco.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEndereco.setBounds(58, 212, 128, 17);
		add(lblEndereco);
		
		textFieldEndereco = new JTextField();
		textFieldEndereco.setColumns(10);
		textFieldEndereco.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		textFieldEndereco.setBackground(Color.BLACK);
		textFieldEndereco.setBounds(178, 213, 96, 18);
		add(textFieldEndereco);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		textFieldEmail.setBackground(Color.BLACK);
		textFieldEmail.setBounds(178, 297, 96, 18);
		add(textFieldEmail);
		
		lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(58, 296, 44, 17);
		add(lblEmail);
		
		txtCra = new JTextField();
		txtCra.setVisible(false);
		txtCra.setEnabled(false);
		txtCra.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCra.setForeground(new Color(128, 128, 128));
		txtCra.setHorizontalAlignment(SwingConstants.CENTER);
		txtCra.setColumns(10);
		txtCra.setBounds(543, 293, 64, 18);
		add(txtCra);
		
		txtCref = new JTextField();
		txtCref.setVisible(false);
		txtCref.setEnabled(false);
		txtCref.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCref.setForeground(new Color(128, 128, 128));
		txtCref.setHorizontalAlignment(SwingConstants.CENTER);
		txtCref.setColumns(10);
		txtCref.setBounds(543, 270, 64, 18);
		add(txtCref);
		
		lblCREF = new JLabel("CREF");
		lblCREF.setVisible(false);
		lblCREF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCREF.setForeground(new Color(255, 255, 255));
		lblCREF.setBounds(613, 273, 44, 12);
		add(lblCREF);
		
		lblCRA = new JLabel("CRA");
		lblCRA.setVisible(false);
		lblCRA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCRA.setForeground(Color.WHITE);
		lblCRA.setBounds(613, 296, 44, 12);
		add(lblCRA);
		
		rdbtnGerente.addActionListener(e -> {
		    txtCra.setVisible(true);
		    txtCra.setEnabled(true);
		    txtCref.setVisible(false);
		    txtCref.setEnabled(false);
		    lblCRA.setVisible(true);
		    lblCREF.setVisible(false);

		});
		
		rdbtnInstrutor.addActionListener(e -> {
		    txtCref.setVisible(true);
		    txtCref.setEnabled(true);
		    txtCra.setVisible(false);
		    txtCra.setEnabled(false);
		    lblCREF.setVisible(true);
		    lblCRA.setVisible(false);

		});

		rdbtnRecepcionista.addActionListener(e -> {
		    txtCra.setVisible(false);
		    txtCra.setEnabled(false);
		    txtCref.setVisible(false);
		    txtCref.setEnabled(false);
		    lblCREF.setVisible(false);
		    lblCRA.setVisible(false);

		});
		
		
		
	}
}
