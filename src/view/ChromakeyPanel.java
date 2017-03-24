package view;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

import controller.ChromakeyController;

public class ChromakeyPanel extends JPanel {
	private ChromakeyController baseController;
	private SpringLayout baseLayout;

	public ChromakeyPanel(ChromakeyController baseController) {
		super();
		this.baseController = baseController;
		baseLayout = new SpringLayout();

		setupPanel();
		setupLayout();
		setupListners();
	}

	private void setupListners() {
		// TODO Auto-generated method stub

	}

	private void setupLayout() {
		// TODO Auto-generated method stub

	}

	private void setupPanel() {
		// TODO Auto-generated method stub

	}

}
