package controller;

import model.Chromakey;
import view.ChromakeyFrame;

public class ChromakeyController {
	
	private ChromakeyFrame chromakeyFrame;
	private Chromakey chromakey;
	
	public void ChromeakeyController() {
		chromakey = new Chromakey();
		chromakeyFrame = new ChromakeyFrame(this);
	}
	
	public void start() {
		
	}
}
