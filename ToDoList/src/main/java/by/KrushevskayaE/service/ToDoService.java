package by.KrushevskayaE.service;

import by.KrushevskayaE.entity.ToDo;
import java.util.List;

public interface ToDoService {

	ToDo save(ToDo plan);
	
	List<ToDo> findAll();
	
}
