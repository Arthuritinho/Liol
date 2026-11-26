package br.com.liol.ui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class RecuperarSenhaPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private TelaLogin telaLogin;
	private JTextField textFieldEmail;
	private JTextField textFieldCodigo;
	private JPasswordField passwordFieldNovaSenha;

	public RecuperarSenhaPanel(TelaLogin telaLogin) {
		this();
		this.telaLogin = telaLogin;
	}


	public RecuperarSenhaPanel() {
		setBackground(new Color(0, 0, 0));
		setLayout(null);
		setBounds(0, 0, 960, 540);


		JButton btnVoltar = new JButton("←");
		btnVoltar.setBorder(new LineBorder(new Color(124, 77, 255), 2));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (telaLogin != null) {
					telaLogin.voltarParaLogin();
				}
			}
		});
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnVoltar.setForeground(new Color(124, 77, 255));
		btnVoltar.setBackground(new Color(255, 255, 255));
		btnVoltar.setFocusPainted(false);
		btnVoltar.setBounds(30, 25, 55, 38);
		add(btnVoltar);

		JLabel lblTitulo = new JLabel("RECUPERAÇÃO DE SENHA");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTitulo.setBounds(280, 55, 400, 40);
		add(lblTitulo);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEmail.setBounds(233, 148, 106, 35);
		add(lblEmail);

		textFieldEmail = new JTextField();
		textFieldEmail.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldEmail.setForeground(Color.WHITE);
		textFieldEmail.setCaretColor(Color.WHITE);
		textFieldEmail.setBackground(Color.BLACK);
		textFieldEmail.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		textFieldEmail.setBounds(375, 151, 210, 35);
		add(textFieldEmail);

		JLabel lblCodigo = new JLabel("Código verificação");
		lblCodigo.setVisible(false);
		lblCodigo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCodigo.setForeground(Color.WHITE);
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCodigo.setBounds(185, 151, 170, 35);
		add(lblCodigo);

		textFieldCodigo = new JTextField();
		textFieldCodigo.setVisible(false);
		textFieldCodigo.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCodigo.setForeground(Color.WHITE);
		textFieldCodigo.setCaretColor(Color.WHITE);
		textFieldCodigo.setBackground(Color.BLACK);
		textFieldCodigo.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		textFieldCodigo.setBounds(375, 151, 210, 35);
		add(textFieldCodigo);

		JLabel lblNovaSenha = new JLabel("Nova senha");
		lblNovaSenha.setVisible(false);
		lblNovaSenha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNovaSenha.setForeground(Color.WHITE);
		lblNovaSenha.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNovaSenha.setBounds(210, 210, 145, 35);
		add(lblNovaSenha);

		passwordFieldNovaSenha = new JPasswordField();
		passwordFieldNovaSenha.setVisible(false);
		passwordFieldNovaSenha.setHorizontalAlignment(SwingConstants.CENTER);
		passwordFieldNovaSenha.setForeground(Color.WHITE);
		passwordFieldNovaSenha.setCaretColor(Color.WHITE);
		passwordFieldNovaSenha.setBackground(Color.BLACK);
		passwordFieldNovaSenha.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		passwordFieldNovaSenha.setBounds(375, 210, 210, 35);
		add(passwordFieldNovaSenha);

		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setVisible(false);
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				// TODO (Regra de Negócio): Validar o código para o e-mail informado,
				// atualizar a senha no banco e chamar telaLogin.voltarParaLogin() ao concluir.
			}
		});
		btnConfirmar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConfirmar.setForeground(new Color(124, 77, 255));
		btnConfirmar.setBackground(new Color(255, 255, 255));
		btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnConfirmar.setFocusPainted(false);
		btnConfirmar.setBounds(410, 280, 140, 40);
		add(btnConfirmar);

		JButton btnEnviarCodigo = new JButton("Enviar Código");
		btnEnviarCodigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email = textFieldEmail.getText();

				// TODO (Regra de Negócio): Verificar se o e-mail está cadastrado e enviar o código.
				// Executar a transição de tela abaixo apenas se o envio for bem-sucedido:

				lblEmail.setVisible(false);
				textFieldEmail.setVisible(false);
				btnEnviarCodigo.setVisible(false);

				lblCodigo.setVisible(true);
				textFieldCodigo.setVisible(true);
				lblNovaSenha.setVisible(true);
				passwordFieldNovaSenha.setVisible(true);
				btnConfirmar.setVisible(true);
			}
		});
		btnEnviarCodigo.setForeground(new Color(124, 77, 255));
		btnEnviarCodigo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEnviarCodigo.setFocusPainted(false);
		btnEnviarCodigo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEnviarCodigo.setBackground(Color.WHITE);
		btnEnviarCodigo.setBounds(410, 206, 140, 40);
		add(btnEnviarCodigo);
	}
}
