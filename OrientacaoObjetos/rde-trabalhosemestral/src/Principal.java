import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Principal extends Application{
    public static void main(String[] args){
        Application.launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception{
        VBox root = new VBox();
        root.setStyle("-fx-background-color: gray");
        Scene scene = new Scene(root, 1000,500);
        stage.setScene(scene);
        stage.show();
    }
}
