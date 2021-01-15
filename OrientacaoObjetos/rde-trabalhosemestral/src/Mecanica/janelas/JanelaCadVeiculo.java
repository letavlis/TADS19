package Mecanica.janelas;

import Mecanica.MainGui;

import Mecanica.controles.Mecanica;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import Mecanica.modelos.Veiculo;

import java.net.URL;
import java.util.ResourceBundle;

public class JanelaCadVeiculo implements Initializable {
    @FXML
    private TextField tfPlaca;
    @FXML
    private TextField tfModelo;
    @FXML
    private TextField tfCliente;
    @FXML
    private ComboBox<Integer> cbAno;
    @FXML
    private ListView<Veiculo> lstwPlacas;
    @FXML
    private TextArea txtaInfos;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for (int i=1900;i<=2021;i++){
            cbAno.getItems().add(i);
        }
    }
    Mecanica mecanica;

    public JanelaCadVeiculo(Mecanica mecanica){
        this.mecanica = mecanica;
    }
    @FXML
    private void cadastrar(){
        String placa = tfPlaca.getText();
        String modelo = tfModelo.getText();
        String cliente = tfCliente.getText();
        int ano = cbAno.getValue();

        if (placa.isBlank() || placa.isEmpty()){
            //TODO melhorar a validação
            mensagem(Alert.AlertType.ERROR,"Placa invalida!!");
            return;
        }
        if (modelo.isBlank() || modelo.isEmpty()){
            //TODO melhorar a validação
            mensagem(Alert.AlertType.ERROR,"Modelo invalido!!");
            return;
        }
        if (cliente.isBlank() || cliente.isEmpty()){
            //TODO melhorar a validação
            mensagem(Alert.AlertType.ERROR,"cliente invalida!!");
            return;
        }

        //cadastrar veiculo
        if(!mecanica.cadastraVeiculo(placa, ano, modelo, cliente)){
            mensagem(Alert.AlertType.ERROR,"Veiculo não cadastrado");
        }
        else {
            mensagem(Alert.AlertType.INFORMATION, "Veiculo cadastrado");
            MainGui.mudaCena(MainGui.PRINCIPAL, (aClass) -> new Principal(mecanica));
        }

    }
    /*private void atualizaLista(){
        List<Veiculo> lista = veiculo.getLista();
        lstwPlacas.getItems().clear();
        for(Veiculo v:lista){
            lstwPlacas.getItems().add(v);
        }
    }*/
    private void mensagem(Alert.AlertType type ,String msg){
        Alert alert = new Alert(type,msg);
        alert.showAndWait();
    }
    public void limpar(){
        tfPlaca.setText("");
        tfModelo.setText("");
        cbAno.getSelectionModel().clearSelection();
        tfCliente.setText("");
    }

}
