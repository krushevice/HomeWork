package by.KrushevskayaE.ui;

import javafx.scene.control.TextField;

public class NewTextField extends TextField {
	
	public NewTextField() {
		super();		
	}
	
	public void init() {
		this.setPromptText("Type new plan here");
	}
}
