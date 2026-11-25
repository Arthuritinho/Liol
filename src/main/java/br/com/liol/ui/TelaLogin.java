package br.com.liol.ui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class TelaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldEmail;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaLogin() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 540);
		setLocationRelativeTo(null);
		
		ImageIcon logo = new ImageIcon("liol_logo.jpg");
		setIconImage(logo.getImage());
		
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLIOL = new JLabel("LIOL");
		lblLIOL.setHorizontalAlignment(SwingConstants.CENTER);
		lblLIOL.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblLIOL.setForeground(new Color(124, 77, 255));
		lblLIOL.setBounds(419, 11, 105, 102);
		contentPane.add(lblLIOL);
		
		JLabel lblLegenda = new JLabel("Seu gestor de academia");
		lblLegenda.setHorizontalAlignment(SwingConstants.CENTER);
		lblLegenda.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLegenda.setForeground(new Color(255, 255, 255));
		lblLegenda.setBounds(347, 91, 252, 35);
		contentPane.add(lblLegenda);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setCaretColor(new Color(255, 255, 255));
		textFieldEmail.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		textFieldEmail.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldEmail.setForeground(new Color(255, 255, 255));
		textFieldEmail.setBackground(new Color(0, 0, 0));
		textFieldEmail.setBounds(375, 205, 193, 35);
		contentPane.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		JLabel lblRecuperaçãoSenha = new JLabel("<html><u>Esqueceu a senha?</u></html>");
		lblRecuperaçãoSenha.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				abrirRecuperarSenha();
			}
		});
		lblRecuperaçãoSenha.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblRecuperaçãoSenha.setHorizontalAlignment(SwingConstants.CENTER);
		lblRecuperaçãoSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRecuperaçãoSenha.setForeground(new Color(124, 77, 255));
		lblRecuperaçãoSenha.setBounds(408, 298, 127, 25);
		contentPane.add(lblRecuperaçãoSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String senha = new String(passwordField.getPassword());

		        if(senha.equals("gerente")) {

		            MenuGerentePanel tela = new MenuGerentePanel();
		            tela.setVisible(true);

		            dispose(); // fecha a tela de login

		        } else if(senha.equals("recepcionista")) {

		            MenuRecepcionistaPanel tela = new MenuRecepcionistaPanel();
		            tela.setVisible(true);

		            dispose();

		        } else if(senha.equals("instrutor")) {

		            MenuInstrutorPanel tela = new MenuInstrutorPanel();
		            tela.setVisible(true);

		            dispose();

		        } else {

		            JOptionPane.showMessageDialog(
		                TelaLogin.this,
		                "Usuário ou senha inválidos!"
		            );

		        }

			}
		});
		btnEntrar.setForeground(new Color(124, 77, 255));
		btnEntrar.setBackground(new Color(255, 255, 255));
		btnEntrar.setBounds(402, 331, 140, 40);
		contentPane.add(btnEntrar);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEmail.setBounds(277, 202, 88, 35);
		contentPane.add(lblEmail);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSenha.setBounds(277, 262, 88, 35);
		contentPane.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setCaretColor(new Color(255, 255, 255));
		passwordField.setForeground(new Color(255, 255, 255));
		passwordField.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		passwordField.setBackground(new Color(0, 0, 0));
		passwordField.setBounds(375, 266, 193, 33);
		contentPane.add(passwordField);
	}

	public void abrirRecuperarSenha() {
		RecuperarSenhaPanel painelRec = new RecuperarSenhaPanel(this);
		setContentPane(painelRec);
		revalidate();
		repaint();
	}

	public void voltarParaLogin() {
		setContentPane(contentPane);
		revalidate();
		repaint();
	}
}
