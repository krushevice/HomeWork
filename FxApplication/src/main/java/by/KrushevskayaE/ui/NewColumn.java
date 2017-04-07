package by.KrushevskayaE.ui;

import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

public class NewColumn extends TableColumn {
	
	public NewColumn(String text) {
		super(text);
	}
	
	public void init() {
		this.setEditable(true);
		setMinWidth(600);
		setCellValueFactory(new PropertyValueFactory ("plan"));
	}	
	
}
