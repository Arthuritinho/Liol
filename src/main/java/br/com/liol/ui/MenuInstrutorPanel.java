package br.com.liol.ui;

public class MenuInstrutorPanel extends MenuBase {
	private static final long serialVersionUID = 1L;

	public MenuInstrutorPanel() {
		super();
		setTitle("LIOL - Menu Instrutor");
		btnFuncionarios.setVisible(false);
		btnPlanos.setVisible(false);
		btnRelatorios.setVisible(false);
		organizarBotoes();
	}
}