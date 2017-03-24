package view;

import javax.swing.JFrame;

import controller.ChromakeyController;

public class ChromakeyFrame extends JFrame
{
	private ChromakeyController baseController;
	private ChromakeyPanel chromakeyPanel;

	public ChromakeyFrame(ChromakeyController chromakeyController) 
	{
			super();
			this.baseController = chromakeyController;
			this.chromakeyPanel = new ChromakeyPanel(baseController);
			
			this.setupFrame();
	}

	private void setupFrame() 
	{
		this.setContentPane(chromakeyPanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Chromakey");
		this.setSize(650, 400);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public ChromakeyPanel getChromakeyPanel()
	{
		return this.chromakeyPanel;
	}

}
