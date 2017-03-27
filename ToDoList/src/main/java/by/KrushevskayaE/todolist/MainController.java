package by.KrushevskayaE.todolist;

import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import by.KrushevskayaE.entity.ToDo;
import by.KrushevskayaE.service.ToDoService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainController {
	
	@Autowired private ToDoService todoService;
	@FXML private TableView<ToDo> table;
	@FXML private TextField plan;
    
	private ObservableList<ToDo> data;
	
	@FXML
	public void initialize() {
	}
	
	@PostConstruct
	public void init() {
		List<ToDo> plans = todoService.findAll();
		data=FXCollections.observableArrayList(plans);
		
        TableColumn<ToDo, String> idColumn = new TableColumn<ToDo, String>("ID");
        idColumn.setCellValueFactory(new PropertyValueFactory<ToDo, String>("id"));

        TableColumn<ToDo, String> planColumn = new TableColumn<ToDo, String>("Plan");
        planColumn.setCellValueFactory(new PropertyValueFactory<ToDo, String>("plan"));
		
        table.getColumns().setAll(idColumn, planColumn);
	}
	
	@FXML
	public void addPlan() {
		String string = plan.getText();
		ToDo plan = new ToDo(string) ;
    	todoService.save(plan);
    	data.add(plan);
    	plan.setPlan("");
		
	}

}
