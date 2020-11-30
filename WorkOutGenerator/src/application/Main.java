package application;
/*
 * It runs the whole program	
 */
import Model.MainModel;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;

/**
* Starts program
* 
*
* @author  Andrew Constancio
* @version 1.0
* @since   2020-11-29 
*/
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
    		MainModel.init_main_data();
			
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(root,875,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		
	}
}
