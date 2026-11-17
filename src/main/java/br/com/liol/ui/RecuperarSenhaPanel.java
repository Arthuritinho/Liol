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

	/**
	 * Construtor usado pela TelaLogin para navegar e permitir voltar.
	 */
	public RecuperarSenhaPanel(TelaLogin telaLogin) {
		this();
		this.telaLogin = telaLogin;
	}

	/**
	 * Construtor padrão (mantém a aba Design do WindowBuilder funcionando).
	 */
	public RecuperarSenhaPanel() {
		setBackground(new Color(0, 0, 0));
		setLayout(null);
		setBounds(0, 0, 960, 540);

		// Botão de voltar (seta no canto superior esquerdo)
		JButton btnVoltar = new JButton("<-");
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

		// Título
		JLabel lblTitulo = new JLabel("RECUPERAÇÃO DE SENHA");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTitulo.setBounds(280, 55, 400, 40);
		add(lblTitulo);

		// Rótulo e Campo: E-mail
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEmail.setBounds(215, 165, 145, 35);
		add(lblEmail);

		textFieldEmail = new JTextField();
		textFieldEmail.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldEmail.setForeground(Color.WHITE);
		textFieldEmail.setCaretColor(Color.WHITE);
		textFieldEmail.setBackground(Color.BLACK);
		textFieldEmail.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		textFieldEmail.setBounds(375, 165, 210, 35);
		add(textFieldEmail);

		// Rótulo e Campo: Código verificação
		JLabel lblCodigo = new JLabel("Código verificação");
		lblCodigo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCodigo.setForeground(Color.WHITE);
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCodigo.setBounds(190, 225, 170, 35);
		add(lblCodigo);

		textFieldCodigo = new JTextField();
		textFieldCodigo.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCodigo.setForeground(Color.WHITE);
		textFieldCodigo.setCaretColor(Color.WHITE);
		textFieldCodigo.setBackground(Color.BLACK);
		textFieldCodigo.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		textFieldCodigo.setBounds(375, 225, 210, 35);
		add(textFieldCodigo);

		// Rótulo e Campo: Nova senha
		JLabel lblNovaSenha = new JLabel("Nova senha");
		lblNovaSenha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNovaSenha.setForeground(Color.WHITE);
		lblNovaSenha.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNovaSenha.setBounds(215, 285, 145, 35);
		add(lblNovaSenha);

		passwordFieldNovaSenha = new JPasswordField();
		passwordFieldNovaSenha.setHorizontalAlignment(SwingConstants.CENTER);
		passwordFieldNovaSenha.setForeground(Color.WHITE);
		passwordFieldNovaSenha.setCaretColor(Color.WHITE);
		passwordFieldNovaSenha.setBackground(Color.BLACK);
		passwordFieldNovaSenha.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		passwordFieldNovaSenha.setBounds(375, 285, 210, 35);
		add(passwordFieldNovaSenha);

		// Botão Entrar / Confirmar
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
			}
		});
		btnEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEntrar.setForeground(new Color(124, 77, 255));
		btnEntrar.setBackground(new Color(255, 255, 255));
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEntrar.setFocusPainted(false);
		btnEntrar.setBounds(410, 360, 140, 40);
		add(btnEntrar);
	}
}