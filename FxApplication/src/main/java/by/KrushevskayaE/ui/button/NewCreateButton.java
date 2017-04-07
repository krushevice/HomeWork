package by.KrushevskayaE.ui.button;

import by.KrushevskayaE.ui.Plan;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class NewCreateButton extends Button {
	
	TableView table;
TextField textField;
	
	public NewCreateButton(String text) {
		super(text);
	}
	
	public void init() {
		this.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				(table.getItems()).add(new Plan(textField.getText()));
				textField.clear();
			}
		});		
	}
	
	public TextField getTextField() {
		return textField;
	}

	public void setTextField(TextField textField) {
		this.textField = textField;
	}

	public TableView getTable() {
		return table;
	}

	public void setTable(TableView table) {
		this.table = table;
	}

}
