package br.com.liol.ui;

public class MenuRecepcionistaPanel extends MenuBase {
	private static final long serialVersionUID = 1L;

	public MenuRecepcionistaPanel() {
		super();
		setTitle("LIOL - Menu Recepcionista");
		btnTreinos.setVisible(false);
		btnRelatorios.setVisible(false);
		organizarBotoes();
	}
}