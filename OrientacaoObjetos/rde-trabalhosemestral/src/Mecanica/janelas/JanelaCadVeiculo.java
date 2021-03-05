package Mecanica.janelas;

import Mecanica.MainGui;
import Mecanica.controles.Mecanica;
import Mecanica.modelos.Veiculo;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.List;
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
        for (int i=1980;i<=2021;i++){
            cbAno.getItems().add(i);
        }
        lstwPlacas.setCellFactory(veiculoListView -> new ListCell<>(){
            @Override
            protected void updateItem(Veiculo veiculo, boolean b) {
                super.updateItem(veiculo, b);
                if (veiculo != null){
                    setText(veiculo.getPlaca());
                }else {
                    setText("");
                }
            }
        });
        atualizaLista();
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
        int ano;


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
            mensagem(Alert.AlertType.ERROR,"cliente invalido!!");
            return;
        }
        try{
            ano = cbAno.getValue();
        } catch (Exception e) {
            //TODO melhorar a validação
            mensagem(Alert.AlertType.ERROR,"Ano invalido!!");
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
    private void atualizaLista(){
        List<Veiculo> veiculos = this.mecanica.getVeiculos();
        lstwPlacas.getItems().clear();
        for(Veiculo v:veiculos){
            lstwPlacas.getItems().add(v);
        }
    }
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
    @FXML
    private void mostrarMenuPrincipal(){
        MainGui.mudaCena(MainGui.PRINCIPAL, (aClass) -> new Principal(mecanica));
    }

}
