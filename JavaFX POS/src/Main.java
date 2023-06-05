
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vinnize
 */
public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
          try{
            Parent parentroot = FXMLLoader.load(getClass().getResource("Flower.fxml"));
            Scene scene = new Scene(parentroot,400,400);
            scene.getStylesheets().add(getClass().getResource("Flower.css").toExternalForm());
            primaryStage.setTitle("Petals & Blooms Online Flower Haven");
            primaryStage.setScene(scene);
            primaryStage.show();
            
        
        }catch(Exception ex){
            System.err.println(ex.getMessage());
            System.exit(0);
        
        }
    } public static void main(String[]args){
        launch(args);
    }
    
}
