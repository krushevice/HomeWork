package by.KrushevskayaE.ui.button;

import by.KrushevskayaE.ui.Plan;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class NewDeleteButton extends Button{
	TableView table;
	
	public NewDeleteButton (String text) {
		super(text);
	}
	
	public void init() {
		this.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				int selectedIndex = table.getSelectionModel().getSelectedIndex();
				table.getItems().remove(selectedIndex);
				
			}
		});		
	}

	public TableView getTable() {
		return table;
	}

	public void setTable(TableView table) {
		this.table = table;
	}

}
