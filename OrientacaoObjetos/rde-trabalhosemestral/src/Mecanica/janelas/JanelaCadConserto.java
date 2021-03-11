package Mecanica.janelas;

import Mecanica.controles.Mecanica;
import Mecanica.MainGui;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;


public class JanelaCadConserto implements Initializable{
    @FXML
    private TextField tfDescricao;
   @FXML
    private  TextField tfPecas;
    @FXML
    private TextField tfVMaoDeObra;
    @FXML
    private  TextField tfVPecas;

    Mecanica mecanica;
    public JanelaCadConserto(Mecanica mecanica){
        this.mecanica = mecanica;
    }

    @FXML
    private void cadastrar(){
        String descricao = tfDescricao.getText();
        ArrayList<String> pecas;
        double maoDeObra;
        double valorPcs;




        if (descricao.isBlank() || descricao.isEmpty()){
            //TODO melhorar a validação
            mensagem(Alert.AlertType.ERROR,"Descricao invalida!!");
            return;
        }
        try {
            pecas = new ArrayList<>(Arrays.<String>asList(String.valueOf(tfPecas)));
        }
        catch (Exception e){
            //TODO melhorar a validação
            mensagem(Alert.AlertType.ERROR,"Peças invalidas!!");
            return;
        }

        try {
            maoDeObra = Double.parseDouble(tfVMaoDeObra.getText());
        }
        catch (Exception e){
            //TODO melhorar a validação
            mensagem(Alert.AlertType.ERROR,"Valor de mão de obra invalido!!");
            return;
        }
        try {
            valorPcs = Double.parseDouble(tfVPecas.getText());
        }
        catch (Exception e){
            //TODO melhorar a validação
            mensagem(Alert.AlertType.ERROR,"Valor das peças invalido!!");
            return;
        }


        //cadastrar pintura
        if(!mecanica.cadastraServico(descricao, pecas, maoDeObra, valorPcs)){
            mensagem(Alert.AlertType.ERROR,"Serviço não cadastrado");
        }
        else {
            mensagem(Alert.AlertType.INFORMATION, "Serviço cadastrado");
            MainGui.mudaCena(MainGui.PRINCIPAL, (aClass) -> new Principal(mecanica));
        }

    }
    private void mensagem(Alert.AlertType type ,String msg){
        Alert alert = new Alert(type,msg);
        alert.showAndWait();
    }
    public void limpar(){
        tfDescricao.setText("");
        tfPecas.setText("");
        tfVMaoDeObra.setText("");
        tfVPecas.setText("");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    private void mostrarMenuServicos(){
        MainGui.mudaCena(MainGui.CADSERVICO, (aClass) -> new JanelaCadServico(mecanica));
    }
}

