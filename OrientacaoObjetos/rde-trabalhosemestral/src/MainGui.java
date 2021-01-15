import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class MainGui extends Application{
    public static void main(String[] args){
        Application.launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception{

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("fxml/JanelaCadVeiculo.fxml"));

        Parent root = loader.load();
        //VBox root = new VBox();
        //root.setStyle("-fx-background-color: gray");

        Scene scene = new Scene(root,400,600);

        stage.setScene(scene);
        stage.setTitle("Gerenciador de Mecanica");

        stage.show();
    }
}
