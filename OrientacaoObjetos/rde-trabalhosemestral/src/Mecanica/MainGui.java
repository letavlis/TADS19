package Mecanica;

import Mecanica.controles.Mecanica;
import Mecanica.janelas.Principal;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Callback;


public class MainGui extends Application{

    public static final String PRINCIPAL = "/fxml/Principal.fxml";
    public static final String CADVEICULO = "/fxml/JanelaCadVeiculo.fxml";
    public static final String CADPINTURA = "/fxml/JanelaCadPintura.fxml";

    private Mecanica mecanica;

    private static StackPane base;

    public static void main(String[] args){
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{

        mecanica = new Mecanica("Teste");
        base = new StackPane();

        Scene scene = new Scene(base, Region.USE_PREF_SIZE, Region.USE_PREF_SIZE);
        stage.setScene(scene);
        stage.setTitle("Gerenciador de Mecanica");

        mudaCena(MainGui.PRINCIPAL, (aClass) -> new Principal(mecanica));

        stage.show();
    }

    public static void mudaCena(String fxml, Callback controllerFactory){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainGui.class.getResource(fxml));
            loader.setControllerFactory(controllerFactory);

            Parent novoRoot = loader.load();

            if (base.getChildren().stream().count()>0){
                base.getChildren().remove(0);
            }
            base.getChildren().add(novoRoot);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

