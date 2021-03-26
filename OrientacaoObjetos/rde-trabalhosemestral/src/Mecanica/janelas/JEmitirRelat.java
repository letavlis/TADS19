package Mecanica.janelas;

import Mecanica.MainGui;
import Mecanica.controles.Mecanica;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class JEmitirRelat implements Initializable {
    @FXML
    private TextArea txtaInfos;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    Mecanica mecanica;

    public JEmitirRelat(Mecanica mecanica) {
        this.mecanica = mecanica;
    }
    @FXML
    private void mostrarMenuPrincipal(){
        MainGui.mudaCena(MainGui.PRINCIPAL, (aClass) -> new Principal(mecanica));
    }
    @FXML
    private void relatorioV(){
        txtaInfos.clear();
        txtaInfos.setText(mecanica.relatorioV());
    }
    @FXML
    private void relatorioS(){
        txtaInfos.clear();
        txtaInfos.setText(mecanica.relatorioS());
    }
    @FXML
    private void relatorioE(){
        txtaInfos.clear();
        txtaInfos.setText(mecanica.relatorioE());
    }

}
