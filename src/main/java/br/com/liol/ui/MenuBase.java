package br.com.liol.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Canvas;
import java.awt.Panel;

public class MenuBase extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panelConteudo;
	protected JButton btnHome;
	protected JButton btnAlunos;
	protected JButton btnFuncionarios;
	protected JButton btnTreinos;
	protected JButton btnPlanos;
	protected JButton btnRelatorios;
	protected JButton btnPonto;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuBase frame = new MenuBase();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void logout() {

	    TelaLogin telaLogin = new TelaLogin();
	    telaLogin.setVisible(true);

	    this.dispose();
	}
	
	/**
	 * Create the frame.
	 */
	
	public MenuBase() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 540);
		
		ImageIcon logo = new ImageIcon(getClass().getResource("/assets/liol_logo.jpg"));
		setIconImage(logo.getImage());
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		panelConteudo = new JPanel();
		panelConteudo.setBackground(new Color(0, 0, 0));
		panelConteudo.setBounds(10, 10, 680, 483);
		contentPane.add(panelConteudo);
		panelConteudo.setLayout(null);
		
		HomePanel home = new HomePanel();

		panelConteudo.removeAll();
		home.setBounds(0, 0, 680, 483);
		panelConteudo.add(home);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(124, 77, 255));
		panelMenu.setBounds(725, 0, 185, 503);
		contentPane.add(panelMenu);
		panelMenu.setLayout(null);
		
		/*O código dentro de "(ActionEvent e) {código}" torna os botões funcionais em cada um dos botões, levando ao seu respectivo painel (JPanel)*/
		//Botão da Home
		btnHome = new JButton("Home");
		btnHome.setBounds(28, 41, 128, 25);
		panelMenu.add(btnHome);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panelConteudo.removeAll();
				
				HomePanel home = new HomePanel();
				home.setBounds(0, 0, 680, 483);
				
				panelConteudo.add(home);
				panelConteudo.revalidate();
		        panelConteudo.repaint();
			}
		});
		btnHome.setForeground(new Color(124, 77, 255));
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		//Botão do Menu de Alunos, que lista os alunos
		btnAlunos = new JButton("Alunos");
		btnAlunos.setBounds(28, 107, 128, 25);
		panelMenu.add(btnAlunos);
		btnAlunos.setForeground(new Color(124, 77, 255));
		btnAlunos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		//Botão do Menu de Funcionários, que lista os funcionários
		btnFuncionarios = new JButton("Funcionários");
		btnFuncionarios.setBounds(28, 173, 128, 25);
		panelMenu.add(btnFuncionarios);
		btnFuncionarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelConteudo.removeAll();
		        
		        MenuFuncionariosPanel perfil = new MenuFuncionariosPanel();
		        perfil.setBounds(0, 0, 680, 483);

		        panelConteudo.add(perfil);
		        panelConteudo.revalidate();
		        panelConteudo.repaint();
			}
		});
		btnFuncionarios.setForeground(new Color(124, 77, 255));
		btnFuncionarios.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		//Botão dos treinos
		btnTreinos = new JButton("Treinos");
		btnTreinos.setBounds(28, 239, 128, 25);
		panelMenu.add(btnTreinos);
		btnTreinos.setForeground(new Color(124, 77, 255));
		btnTreinos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		//Botão dos planos da academia
		btnPlanos = new JButton("Planos");
		btnPlanos.setBounds(28, 305, 128, 25);
		panelMenu.add(btnPlanos);
		btnPlanos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelConteudo.removeAll();
				
				PlanosPanel planos = new PlanosPanel();
				planos.setBounds(0, 0, 680, 483);
				
				panelConteudo.add(planos);
				panelConteudo.revalidate();
		        panelConteudo.repaint();
			}
		});
		btnPlanos.setForeground(new Color(124, 77, 255));
		btnPlanos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		//Botão dos relatórios
		btnRelatorios = new JButton("Relatórios");
		btnRelatorios.setBounds(28, 371, 128, 25);
		panelMenu.add(btnRelatorios);
		btnRelatorios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelConteudo.removeAll();
				
				RelatoriosPanel relatorios = new RelatoriosPanel();
				relatorios.setBounds(0, 0, 680, 483);
				
				panelConteudo.add(relatorios);
				panelConteudo.revalidate();
		        panelConteudo.repaint();
			}
		});
		btnRelatorios.setForeground(new Color(124, 77, 255));
		btnRelatorios.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		//Botão do Ponto, onde mostra a questão de bater ponto
		btnPonto = new JButton("Ponto");
		btnPonto.setBounds(28, 437, 128, 25);
		panelMenu.add(btnPonto);
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelConteudo.removeAll();
				
				PontoPanel ponto = new PontoPanel();
				ponto.setBounds(0, 0, 680, 483);
				
				panelConteudo.add(ponto);
				panelConteudo.revalidate();
		        panelConteudo.repaint();
			}
		});
		btnPonto.setForeground(new Color(124, 77, 255));
		btnPonto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnTreinos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelConteudo.removeAll();
				
				TreinosPanel treinos = new TreinosPanel();
				treinos.setBounds(0, 0, 680, 483);
				
				panelConteudo.add(treinos);
				panelConteudo.revalidate();
		        panelConteudo.repaint();
			}
		});
		
		btnAlunos.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {

		        panelConteudo.removeAll();
		        
		        MenuAlunosPanel perfil = new MenuAlunosPanel();
		        perfil.setBounds(0, 0, 680, 483);

		        panelConteudo.add(perfil);
		        panelConteudo.revalidate();
		        panelConteudo.repaint();
		    }
		});
		panelConteudo.revalidate();
		panelConteudo.repaint();
	}

	protected void organizarBotoes() {
		JButton[] botoes = {
			btnHome, btnAlunos, btnFuncionarios, 
			btnTreinos, btnPlanos, btnRelatorios, btnPonto
		};
		
		int y = 41; // Posição vertical inicial (a mesma do btnHome no seu código)
		int espacamento = 66; // Distância entre um botão e outro (41 -> 107 -> 173...)
		
		for (JButton botao : botoes) {
			if (botao != null && botao.isVisible()) {
				botao.setBounds(28, y, 128, 25);
				y += espacamento;
			}
		}
	}
}
