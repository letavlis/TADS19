package Mecanica.janelas;

import Mecanica.MainGui;
import Mecanica.controles.Mecanica;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class JanelaCadServico implements Initializable {
    @FXML
    private TextField tfDescricao;

    Mecanica mecanica;

    public JanelaCadServico (Mecanica mecanica){
        this.mecanica = mecanica;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    private void mostrarCadastroPintura(){
        MainGui.mudaCena(MainGui.CADPINTURA, (aClass)-> new JanelaCadPintura(mecanica));
    }
    @FXML
    private void mostrarMenuPrincipal(){
        MainGui.mudaCena(MainGui.PRINCIPAL, (aClass) -> new Principal(mecanica));
    }
    @FXML
    private void mostrarCadastroConserto(){
        MainGui.mudaCena(MainGui.CADCONSERTO, (aClass)-> new JanelaCadConserto(mecanica));
    }
}
