package br.com.liol.ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import br.com.liol.entities.Plano;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class PlanosPanel extends JPanel {

	private static final long serialVersionUID = 1L;
    private JLabel lblPlano;
    private JLabel lblValor;
    private JLabel lblDesconto;
    private JLabel lblDuracao;
    private JTextArea txtrDescricao;

    private JComboBox<Plano> comboBoxPlanos;

	/**
	 * Create the panel.
	 */
	
	public PlanosPanel() {
		setBackground(new Color(0, 0, 0));
		setBounds(10, 10, 680, 483);
		setLayout(null);
		
		JLabel lblPlanos = new JLabel("Planos");
		lblPlanos.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlanos.setForeground(Color.WHITE);
		lblPlanos.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPlanos.setBounds(259, 43, 161, 20);
		add(lblPlanos);
		//Exibe qual o plano escolhido
		lblPlano = new JLabel("Plano");
		lblPlano.setOpaque(true);
		lblPlano.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlano.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPlano.setForeground(new Color(255, 255, 255));
		lblPlano.setBackground(new Color(124, 77, 255));
		lblPlano.setBounds(56, 140, 565, 29);
		add(lblPlano);
		//Títulos
		JLabel lblTituloValor = new JLabel("Valor (R$)");
		lblTituloValor.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloValor.setForeground(new Color(124, 77, 255));
		lblTituloValor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTituloValor.setBackground(new Color(124, 77, 255));
		lblTituloValor.setBounds(56, 189, 151, 29);
		add(lblTituloValor);
		
		JLabel lblTituloDesconto = new JLabel("Desconto (%)");
		lblTituloDesconto.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloDesconto.setForeground(new Color(124, 77, 255));
		lblTituloDesconto.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTituloDesconto.setBackground(new Color(124, 77, 255));
		lblTituloDesconto.setBounds(263, 189, 151, 29);
		add(lblTituloDesconto);
		
		JLabel lblTituloDuracao = new JLabel("Duração em Dias");
		lblTituloDuracao.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloDuracao.setForeground(new Color(124, 77, 255));
		lblTituloDuracao.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTituloDuracao.setBackground(new Color(124, 77, 255));
		lblTituloDuracao.setBounds(470, 189, 151, 29);
		add(lblTituloDuracao);
		
		JLabel lblTituloDescricao = new JLabel("Descrição:");
		lblTituloDescricao.setHorizontalAlignment(SwingConstants.LEFT);
		lblTituloDescricao.setForeground(new Color(124, 77, 255));
		lblTituloDescricao.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTituloDescricao.setBackground(new Color(124, 77, 255));
		lblTituloDescricao.setBounds(66, 268, 141, 29);
		add(lblTituloDescricao);
		//Onde os valores de cada plano serão exibidos
		lblValor = new JLabel("0");
		lblValor.setVerticalAlignment(SwingConstants.TOP);
		lblValor.setHorizontalAlignment(SwingConstants.CENTER);
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblValor.setForeground(new Color(255, 255, 255));
		lblValor.setBounds(56, 228, 151, 30);
		add(lblValor);
		
		lblDesconto = new JLabel("0");
		lblDesconto.setVerticalAlignment(SwingConstants.TOP);
		lblDesconto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDesconto.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesconto.setForeground(new Color(255, 255, 255));
		lblDesconto.setBounds(264, 228, 151, 30);
		add(lblDesconto);
		
		lblDuracao = new JLabel("0");
		lblDuracao.setVerticalAlignment(SwingConstants.TOP);
		lblDuracao.setHorizontalAlignment(SwingConstants.CENTER);
		lblDuracao.setForeground(new Color(255, 255, 255));
		lblDuracao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDuracao.setBounds(470, 228, 151, 30);
		add(lblDuracao);
		
		txtrDescricao = new JTextArea();
		txtrDescricao.setEditable(false);
		txtrDescricao.setWrapStyleWord(true);
		txtrDescricao.setLineWrap(true);
		txtrDescricao.setText("Selecione um plano para ver a descrição.");
		txtrDescricao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtrDescricao.setForeground(new Color(255, 255, 255));
		txtrDescricao.setBackground(new Color(0, 0, 0));
		txtrDescricao.setBounds(10, 157, 546, 120);
		
		//A bordinha roxa ao redor de toda a descrição
		JPanel panelDescricaoCompleta = new JPanel();
		panelDescricaoCompleta.setBorder(new LineBorder(new Color(124, 77, 255), 2));
		panelDescricaoCompleta.setForeground(new Color(255, 255, 255));
		panelDescricaoCompleta.setBackground(new Color(0, 0, 0));
		panelDescricaoCompleta.setBounds(56, 140, 566, 287);
		add(panelDescricaoCompleta);
		panelDescricaoCompleta.setLayout(null);
		panelDescricaoCompleta.add(txtrDescricao);
		
		comboBoxPlanos = new JComboBox<Plano>();
		//Criando a lista de planos disponíveis derivadas da classe Plano.java. O ideal seria armazenar num banco de dados, acredito, mas por enquanto será assim.
		comboBoxPlanos.setModel(
				new DefaultComboBoxModel<>(new Plano[] {
						new Plano("Treino Experimental",0,0,1,"Treino experimental gratuito para potenciais novos alunos."),
						new Plano("Plano Mensal",60,0,30,"Plano com pagamento mensal. Ideal para quem não quer se comprometer todos os meses."),
						new Plano("Plano Trimestral",180,5,90,"Plano trimestral, com pagamentos de 3 em 3 meses e pequeno desconto. Ideal para um comprometimento leve."),
						new Plano("Plano Semestral",360,10,180,"Plano com pagamento de 6 em 6 meses. Ideal para quem se garante por pelo menos metade do ano."),
						new Plano("Plano Anual",720,15,360,"Plano com pagamento anual, pague só 1 vez e tenha acesso à academia com o maior desconto pelo ano todo!")
				}));
		
		comboBoxPlanos.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBoxPlanos.setForeground(new Color(124, 77, 255));
		comboBoxPlanos.setBackground(new Color(0, 0, 0));
		comboBoxPlanos.setBounds(164, 76, 350, 29);
		add(comboBoxPlanos);
		
		comboBoxPlanos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atualizarLabels();
			}
		});
		
		atualizarLabels();
		
	}
	//A classe que faz os labels de fato atualizarem quando mudamos de plano
	private void atualizarLabels() {

	    Plano plano = (Plano) comboBoxPlanos.getSelectedItem();

	    if (plano != null) {
	        lblPlano.setText(plano.getNome());
	        lblValor.setText("R$ " + plano.getValor());
	        lblDesconto.setText(plano.getDesconto() + "%");
	        lblDuracao.setText(plano.getDuracaoDias() + " dias");
	        txtrDescricao.setText(plano.getDescricao());
	    }
	}
}
