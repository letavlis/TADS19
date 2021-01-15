package janelas;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class JanelaCadVeiculo {
    @FXML
    private TextField tfPlaca;
    @FXML
    private TextField tfModelo;
    @FXML
    private TextField tfCliente;

    private void cadastrar(){
        String placa = tfPlaca.getText();
        String modelo = tfModelo.getText();
        String cliente = tfCliente.getText();

        if (placa.isBlank() || placa.isEmpty()){
            mensagem("Placa invalida!!");
            return;
        }
        if (modelo.isBlank() || modelo.isEmpty()){
            mensagem("Modelo invalido!!");
            return;
        }
        if (cliente.isBlank() || cliente.isEmpty()){
            mensagem("cliente invalida!!");
            return;
        }
    }
    private void mensagem(String msg){
        Alert alert = new Alert(Alert.AlertType.ERROR,msg);
        alert.showAndWait();
    }

}
