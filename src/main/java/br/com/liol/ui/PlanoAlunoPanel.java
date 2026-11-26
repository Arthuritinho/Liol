package br.com.liol.ui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class PlanoAlunoPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private TelaLogin telaLogin;

	/**
	 * Construtor usado pela janela principal para navegação.
	 */
	public PlanoAlunoPanel(TelaLogin telaLogin) {
		this();
		this.telaLogin = telaLogin;
	}

	/**
	 * Construtor padrão (mantém a aba Design do WindowBuilder funcionando).
	 */
	public PlanoAlunoPanel() {
		setBackground(new Color(0, 0, 0));
		setLayout(null);
		setBounds(0, 0, 960, 540);

		// Botão de voltar (seta no canto superior esquerdo)
		JButton btnVoltar = new JButton("<-");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (telaLogin != null) {
					telaLogin.voltarParaLogin(); // Trocar para o painel anterior (ex: Dashboard) quando existir
				}
			}
		});
		btnVoltar.setBorder(new LineBorder(new Color(124, 77, 255), 2));
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnVoltar.setForeground(new Color(124, 77, 255));
		btnVoltar.setBackground(new Color(255, 255, 255));
		btnVoltar.setFocusPainted(false);
		btnVoltar.setBounds(30, 25, 55, 38);
		add(btnVoltar);

		// Título principal
		JLabel lblTitulo = new JLabel("PLANO DO ALUNO");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTitulo.setBounds(330, 30, 300, 35);
		add(lblTitulo);

		// COLUNA ESQUERDA: TIPO DO PLANO E INFORMAÇÕES ATUAIS ---
		JLabel lblTipoPlano = new JLabel("Tipo do plano");
		lblTipoPlano.setForeground(Color.WHITE);
		lblTipoPlano.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTipoPlano.setBounds(115, 100, 150, 25);
		add(lblTipoPlano);

		ButtonGroup grupoPlanos = new ButtonGroup();

		JRadioButton rdbtnMensal = new JRadioButton("Mensal");
		rdbtnMensal.setBackground(Color.BLACK);
		rdbtnMensal.setForeground(Color.WHITE);
		rdbtnMensal.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnMensal.setFocusPainted(false);
		rdbtnMensal.setBounds(175, 138, 130, 28);
		grupoPlanos.add(rdbtnMensal);
		add(rdbtnMensal);

		JRadioButton rdbtnTrimestral = new JRadioButton("Trimestral");
		rdbtnTrimestral.setBackground(Color.BLACK);
		rdbtnTrimestral.setForeground(Color.WHITE);
		rdbtnTrimestral.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnTrimestral.setFocusPainted(false);
		rdbtnTrimestral.setBounds(175, 173, 130, 28);
		grupoPlanos.add(rdbtnTrimestral);
		add(rdbtnTrimestral);

		JRadioButton rdbtnSemestral = new JRadioButton("Semestral");
		rdbtnSemestral.setBackground(Color.BLACK);
		rdbtnSemestral.setForeground(Color.WHITE);
		rdbtnSemestral.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnSemestral.setFocusPainted(false);
		rdbtnSemestral.setBounds(175, 208, 130, 28);
		grupoPlanos.add(rdbtnSemestral);
		add(rdbtnSemestral);

		JRadioButton rdbtnAnual = new JRadioButton("Anual");
		rdbtnAnual.setSelected(true);
		rdbtnAnual.setBackground(Color.BLACK);
		rdbtnAnual.setForeground(Color.WHITE);
		rdbtnAnual.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnAnual.setFocusPainted(false);
		rdbtnAnual.setBounds(175, 243, 130, 28);
		grupoPlanos.add(rdbtnAnual);
		add(rdbtnAnual);

		// Etiquetas de Valor e Vencimento (destaque roxo)
		JLabel lblValorAtual = new JLabel("Valor atual: R$720,00");
		lblValorAtual.setOpaque(true);
		lblValorAtual.setBackground(new Color(149, 117, 255));
		lblValorAtual.setForeground(Color.WHITE);
		lblValorAtual.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorAtual.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblValorAtual.setBounds(115, 295, 210, 32);
		add(lblValorAtual);

		JLabel lblVencimento = new JLabel("Vencimento: 01/2027");
		lblVencimento.setOpaque(true);
		lblVencimento.setBackground(new Color(149, 117, 255));
		lblVencimento.setForeground(Color.WHITE);
		lblVencimento.setHorizontalAlignment(SwingConstants.CENTER);
		lblVencimento.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVencimento.setBounds(115, 340, 210, 32);
		add(lblVencimento);

		// --- COLUNA DIREITA: ÚLTIMOS PAGAMENTOS ---
		JLabel lblUltimosPagamentos = new JLabel("Últimos pagamentos:");
		lblUltimosPagamentos.setForeground(Color.WHITE);
		lblUltimosPagamentos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUltimosPagamentos.setBounds(415, 100, 200, 25);
		add(lblUltimosPagamentos);

		// Painel interno que guarda as linhas do histórico
		JPanel painelListaPagamentos = new JPanel();
		painelListaPagamentos.setBackground(Color.BLACK);
		painelListaPagamentos.setLayout(null);
		painelListaPagamentos.setPreferredSize(new Dimension(420, 260));

		// Linhas simuladas de pagamentos (UI)
		adicionarLinhaPagamento(painelListaPagamentos, 15, "01/2025", "Trimestral", "Pago", "R$ 180,00");
		adicionarLinhaPagamento(painelListaPagamentos, 65, "04/2025", "Trimestral", "Pago", "R$ 180,00");
		adicionarLinhaPagamento(painelListaPagamentos, 115, "07/2025", "Trimestral", "Pago", "R$ 180,00");
		adicionarLinhaPagamento(painelListaPagamentos, 165, "01/2026", "Anual", "Pago", "R$ 720,00");
		adicionarLinhaPagamento(painelListaPagamentos, 215, "01/2027", "Anual", "Pendente", "R$ 720,00");

		JScrollPane scrollPagamentos = new JScrollPane(painelListaPagamentos);
		scrollPagamentos.setBounds(415, 138, 450, 235);
		scrollPagamentos.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		scrollPagamentos.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPagamentos.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPagamentos.getViewport().setBackground(Color.BLACK);
		add(scrollPagamentos);

		// BOTÕES INFERIORES 
		JButton btnEditar = new JButton("Editar");
		btnEditar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEditar.setForeground(new Color(124, 77, 255));
		btnEditar.setBackground(Color.WHITE);
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEditar.setFocusPainted(false);
		btnEditar.setBounds(265, 425, 125, 36);
		add(btnEditar);

		JButton btnRenovar = new JButton("Renovar");
		btnRenovar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRenovar.setForeground(new Color(124, 77, 255));
		btnRenovar.setBackground(Color.WHITE);
		btnRenovar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnRenovar.setFocusPainted(false);
		btnRenovar.setBounds(418, 425, 125, 36);
		add(btnRenovar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancelar.setForeground(new Color(124, 77, 255));
		btnCancelar.setBackground(Color.WHITE);
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCancelar.setFocusPainted(false);
		btnCancelar.setBounds(570, 425, 125, 36);
		add(btnCancelar);
	}

	/**
	 * Método auxiliar para montar cada linha da lista de pagamentos.
	 */
	private void adicionarLinhaPagamento(JPanel container, int posY, String data, String plano, String status, String valor) {
		JLabel lblData = new JLabel(data);
		lblData.setOpaque(true);
		lblData.setBackground(new Color(149, 117, 255));
		lblData.setForeground(Color.WHITE);
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblData.setBounds(15, posY, 95, 28);
		container.add(lblData);

		JLabel lblPlano = new JLabel(plano);
		lblPlano.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlano.setForeground(Color.WHITE);
		lblPlano.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPlano.setBounds(120, posY, 95, 28);
		container.add(lblPlano);

		JLabel lblStatus = new JLabel(status);
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatus.setForeground(Color.WHITE);
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStatus.setBounds(220, posY, 75, 28);
		container.add(lblStatus);

		JLabel lblValor = new JLabel(valor);
		lblValor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblValor.setForeground(Color.WHITE);
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValor.setBounds(305, posY, 95, 28);
		container.add(lblValor);
	}
}
