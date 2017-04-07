package by.KrushevskayaE;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javafx.application.Application;
import javafx.scene.Scene;

import javafx.stage.Stage;

public class StartMain extends Application {
	
	public static void main(String[] args) {
		Application.launch(args);		
	}
	
	@Override
	public void start(Stage stage) {
		String[] contextPaths = new String[] {"by/KrushevskayaE/app-context.xml"};
		ApplicationContext context = (ApplicationContext) new ClassPathXmlApplicationContext(contextPaths);
		Scene scene = (Scene) context.getBean("mainScene");
		stage.setTitle("To Do List");
		stage.setScene(scene);
		stage.show();
	}

}
