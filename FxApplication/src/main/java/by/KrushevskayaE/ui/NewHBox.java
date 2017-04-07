package by.KrushevskayaE.ui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.HBox;

public class NewHBox extends HBox {
	
	public NewHBox(double spacing, Node... children) {
		super(spacing, children);
		
	}
	
	public void init() {
		setPadding(new Insets(20, 0, 20, 0));
		this.setAlignment(Pos.CENTER);		
	}

}
