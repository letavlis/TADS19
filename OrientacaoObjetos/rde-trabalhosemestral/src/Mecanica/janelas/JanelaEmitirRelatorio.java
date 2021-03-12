package Mecanica.janelas;

import Mecanica.MainGui;
import Mecanica.controles.Mecanica;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class JanelaEmitirRelatorio implements Initializable {
    @FXML
    private TextArea txtaInfos;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    Mecanica mecanica;

    public JanelaEmitirRelatorio(Mecanica mecanica) {
        this.mecanica = mecanica;
    }
    @FXML
    private void mostrarMenuPrincipal(){
        MainGui.mudaCena(MainGui.PRINCIPAL, (aClass) -> new Principal(mecanica));
    }
    @FXML
    private void relatorioV(){
        txtaInfos.clear();
        txtaInfos.setText(mecanica.relatorioVeiculos());
    }
    @FXML
    private void relatorioS(){
        txtaInfos.clear();
        txtaInfos.setText(mecanica.relatorioServicos());
    }
    @FXML
    private void relatorioE(){
        txtaInfos.clear();
        txtaInfos.setText(mecanica.relatorioExecucoes());
    }

}
