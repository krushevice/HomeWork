package by.KrushevskayaE.ui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class NewTable extends TableView {
	
	ObservableList<Plan> oList = (ObservableList<Plan>) FXCollections.observableArrayList(new Plan("Do some jogging"),new Plan("Get up early"),new Plan("Drink beer"));
	TableColumn column;
	
	public NewTable() {
		super();
	}
	
	public void init() {
		this.setEditable(true);
		this.getColumns().addAll(column);
		this.setItems(oList);
	}
	
	public ObservableList<Plan> getData() {
		return oList;		
	}
	
	public void setData(ObservableList<Plan> oList) {
		 this.oList = oList;	 
	}
	
	public TableColumn getColumn() {
		return column;
	}
	
	public void setColumn(TableColumn column) {
		this.column = column;
	}
}
