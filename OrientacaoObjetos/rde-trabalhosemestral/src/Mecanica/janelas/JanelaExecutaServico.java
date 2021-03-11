package Mecanica.janelas;

import Mecanica.MainGui;
import Mecanica.controles.Mecanica;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class JanelaExecutaServico implements Initializable {

    Mecanica mecanica;

    public JanelaExecutaServico(Mecanica mecanica) {
        this.mecanica = mecanica;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    private void mostrarMenuPrincipal(){
        MainGui.mudaCena(MainGui.PRINCIPAL, (aClass) -> new Principal(mecanica));
    }
}
