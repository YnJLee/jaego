package main;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class xxxxAddMain extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = FXMLLoader.load(getClass().getResource("../fxml/addnew.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("../cmn/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("구매목록");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
