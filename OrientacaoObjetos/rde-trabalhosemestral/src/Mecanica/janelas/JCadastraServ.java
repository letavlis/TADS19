package Mecanica.janelas;

import Mecanica.MainGui;
import Mecanica.controles.Mecanica;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javax.swing.text.html.ListView;
import java.net.URL;
import java.util.ResourceBundle;

public class JCadastraServ implements Initializable {
    @FXML
    private ListView lPintura;
    @FXML
    private ListView lConserto;

    Mecanica mecanica;

    public JCadastraServ (Mecanica mecanica){
        this.mecanica = mecanica;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    private void janPintura(){
        MainGui.mudaCena(MainGui.CADPINTURA, (aClass)-> new JCadastraP(mecanica));
    }
    @FXML
    private void MenuPrincipal(){
        MainGui.mudaCena(MainGui.PRINCIPAL, (aClass) -> new Principal(mecanica));
    }
    @FXML
    private void janConserto(){
        MainGui.mudaCena(MainGui.CADCONSERTO, (aClass)-> new JCadastraC(mecanica));
    }
}
