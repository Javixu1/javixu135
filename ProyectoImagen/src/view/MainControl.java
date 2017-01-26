package view;

import java.io.IOException;

import view.MainControl;
import view.MainControl2;
import view.MainControl3;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
/**
 * This controls the fxml document,we declare the methods and we put the methods in the fxml document
 * @author javierdeandres
 * @version 1.0
 * @see MainApp
 * @see MainControl2
 * @see MainControl3
 */
 
public class MainControl {
	
	private AnchorPane rootLayout;
	 @FXML
	    private void initialize() {
		 
	    }
	 /**
	  * The function of this method configures and launches another window called Imagenes2.fxml
	  * @param
	  * @exception IOException
	  * 
	  */
	 public void showImage() {
		 try {
	            // Load the fxml file and create a new stage for the popup.
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(MainControl.class.getResource("Imagenes2.fxml"));
	            AnchorPane page = (AnchorPane) loader.load();
	            Stage sendStage = new Stage();
	            sendStage.setTitle("FormulariodeRegistro");
	            Scene scene = new Scene(page);
	            scene.getStylesheets().add(getClass().getResource("../view/stylesheet.css").toExternalForm());
	            sendStage.setScene(scene);

	            
	            sendStage.show();

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		}
	 
	 
	 public void showImage2() {
		 try {
	            // Load the fxml file and create a new stage for the popup.
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(MainControl.class.getResource("Imagenes3.fxml"));
	            AnchorPane page = (AnchorPane) loader.load();
	            Stage sendStage = new Stage();
	            sendStage.setTitle("MiPerfil");
	            Scene scene = new Scene(page);
	            /**
	             * Adds the stylesheet to the scene
	             */
	            scene.getStylesheets().add(getClass().getResource("../view/stylesheet.css").toExternalForm());
	            sendStage.setScene(scene);

	            
	            sendStage.show();

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		}
	    /**
	     * Called when the user clicks ok.
	     */
	    @FXML
	    private void lanzar() {
	    	showImage();
	    }

	    /**
	     * Called when the user clicks cancel.
	     */
	    @FXML
	    private void salir(){
	    	System.exit(0);
	    }
	 @FXML
	 private void lanzaraplicacion(){
		 showImage2();
	 }
}
