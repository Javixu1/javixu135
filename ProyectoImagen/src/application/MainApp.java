package application;

import java.awt.Font;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * A example of the use of javafx and scene builder with eclipse
 * @author javierdeandres
 * @version 1.0
 * @see MainControl
 * @see MainControl2
 * @see MainControl3
 */
 

public class MainApp extends Application {
	private Stage primaryStage;
	private AnchorPane rootLayout;//Siempre el elemento principal es un anchorpane
	/***
	 * Set my stage  apply the size and the name for the stage
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("ImageViews");
		this.primaryStage.setX(600);
		this.primaryStage.setY(400);
		
		this.primaryStage = primaryStage;
		primaryStage.show();
		initRootLayout();

	}
	/***
	 * Load the fxml, set the ccs style and the font on the scenne and set the scene in the stage
	 */
	public void initRootLayout() {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("../view/Imagenes.fxml"));
			rootLayout = (AnchorPane) loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout);
			scene.getStylesheets().add(getClass().getResource("../view/stylesheet.css").toExternalForm());

			//adding fonts
			scene.getStylesheets().add("http://fonts.googleapis.com/css?family=Shadows+Into+Light");
            
			
			primaryStage.setScene(scene);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
	

}
