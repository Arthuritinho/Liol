package br.com.liol.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class MeusPontosPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private TelaLogin telaLogin;
	private JPanel painelListaPontos;

	public MeusPontosPanel(TelaLogin telaLogin) {
		this();
		this.telaLogin = telaLogin;
	}

	public MeusPontosPanel() {
		setBackground(new Color(0, 0, 0));
		setLayout(null);
		setBounds(0, 0, 960, 540);

		JButton btnVoltar = new JButton("<-");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container parent = getParent();
				if (parent != null) {
					parent.removeAll();
					parent.add(new MenuFuncionariosPanel());
					parent.revalidate();
					parent.repaint();
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

		JLabel lblTitulo = new JLabel("MEUS PONTOS");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTitulo.setBounds(330, 30, 300, 35);
		add(lblTitulo);

		JPanel painelMoldura = new JPanel();
		painelMoldura.setBackground(Color.BLACK);
		painelMoldura.setBorder(new LineBorder(new Color(134, 77, 255), 3, true));
		painelMoldura.setLayout(null);
		painelMoldura.setBounds(80, 95, 800, 400);
		add(painelMoldura);

		JLabel lblData = new JLabel("Data");
		lblData.setOpaque(true);
		lblData.setBackground(new Color(149, 117, 255));
		lblData.setForeground(Color.WHITE);
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblData.setBounds(25, 20, 130, 50);
		painelMoldura.add(lblData);

		JLabel lblEntrada = new JLabel("Entrada");
		lblEntrada.setOpaque(true);
		lblEntrada.setBackground(new Color(149, 117, 255));
		lblEntrada.setForeground(Color.WHITE);
		lblEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		lblEntrada.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEntrada.setBounds(170, 20, 130, 50);
		painelMoldura.add(lblEntrada);

		JLabel lblIntervalo = new JLabel("Intervalo");
		lblIntervalo.setOpaque(true);
		lblIntervalo.setBackground(new Color(149, 117, 255));
		lblIntervalo.setForeground(Color.WHITE);
		lblIntervalo.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntervalo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIntervalo.setBounds(315, 20, 130, 50);
		painelMoldura.add(lblIntervalo);

		JLabel lblRetorno = new JLabel("Retorno");
		lblRetorno.setOpaque(true);
		lblRetorno.setBackground(new Color(149, 117, 255));
		lblRetorno.setForeground(Color.WHITE);
		lblRetorno.setHorizontalAlignment(SwingConstants.CENTER);
		lblRetorno.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRetorno.setBounds(460, 20, 130, 50);
		painelMoldura.add(lblRetorno);

		JLabel lblSaida = new JLabel("Saída");
		lblSaida.setOpaque(true);
		lblSaida.setBackground(new Color(149, 117, 255));
		lblSaida.setForeground(Color.WHITE);
		lblSaida.setHorizontalAlignment(SwingConstants.CENTER);
		lblSaida.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSaida.setBounds(605, 20, 130, 50);
		painelMoldura.add(lblSaida);

		painelListaPontos = new JPanel();
		painelListaPontos.setBackground(Color.BLACK);
		painelListaPontos.setLayout(null);
		painelListaPontos.setPreferredSize(new Dimension(740, 290));

		JScrollPane scrollPontos = new JScrollPane(painelListaPontos);
		scrollPontos.setBounds(25, 85, 755, 295);
		scrollPontos.setBorder(null);
		scrollPontos.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPontos.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPontos.getViewport().setBackground(Color.BLACK);
		painelMoldura.add(scrollPontos);
	}

	public void limparPontos() {
		painelListaPontos.removeAll();
		painelListaPontos.setPreferredSize(new Dimension(740, 290));
		painelListaPontos.revalidate();
		painelListaPontos.repaint();
	}

	public void adicionarLinhaPonto(int indiceLinha, String data,
			String entrada, boolean okEntrada,
			String intervalo, boolean okIntervalo,
			String retorno, boolean okRetorno,
			String saida, boolean okSaida) {

		int posY = 5 + (indiceLinha * 62);

		painelListaPontos.add(criarCelula(data, 0, posY, false, true));
		painelListaPontos.add(criarCelula(entrada, 145, posY, true, okEntrada));
		painelListaPontos.add(criarCelula(intervalo, 290, posY, true, okIntervalo));
		painelListaPontos.add(criarCelula(retorno, 435, posY, true, okRetorno));
		painelListaPontos.add(criarCelula(saida, 580, posY, true, okSaida));

		int alturaTotal = posY + 65;
		if (alturaTotal > painelListaPontos.getPreferredSize().height) {
			painelListaPontos.setPreferredSize(new Dimension(740, alturaTotal));
		}

		painelListaPontos.revalidate();
		painelListaPontos.repaint();
	}

	private JPanel criarCelula(String texto, int posX, int posY, boolean mostrarStatus, boolean statusOk) {
		JPanel card = new JPanel() {
			private static final long serialVersionUID = 1L;

			@Override
			protected void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g.create();
				g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
				g2.setColor(new Color(238, 238, 238));
				g2.fillRoundRect(0, 0, getWidth(), getHeight(), 16, 16);

				if (mostrarStatus) {
					g2.setColor(statusOk ? new Color(118, 215, 76) : new Color(235, 87, 87));
					g2.fillRoundRect(getWidth() - 24, 8, 15, 9, 8, 8);
				}
				g2.dispose();
			}
		};
		card.setOpaque(false);
		card.setLayout(null);
		card.setBounds(posX, posY, 130, 50);

		JLabel lblTexto = new JLabel(texto);
		lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
		lblTexto.setForeground(new Color(134, 77, 255));
		lblTexto.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTexto.setBounds(0, 5, 130, 42);
		card.add(lblTexto);

		return card;
	}
}
