package Mecanica.janelas;

import Mecanica.controles.Mecanica;
import Mecanica.MainGui;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class JanelaCadPintura implements Initializable {
    @FXML
    private TextField tfDescricao;
    @FXML
    private  TextField tfCor;
    @FXML
    private TextField tfVMaoDeObra;
    @FXML
    private  TextField tfCera;
    @FXML
    private  TextField tfTinta;

    Mecanica mecanica;

    public JanelaCadPintura(Mecanica mecanica){
        this.mecanica = mecanica;
    }

    @FXML
    private void cadastrar(){
        String descricao = tfDescricao.getText();
        String cor = tfCor.getText();
        double maoDeObra;
        double cera;
        double tinta;



        if (descricao.isBlank() || descricao.isEmpty()){
            //TODO melhorar a validação
            mensagem(Alert.AlertType.ERROR,"Descricao invalida!!");
            return;
        }
        if (cor.isBlank() || cor.isEmpty()){
            //TODO melhorar a validação
            mensagem(Alert.AlertType.ERROR,"Cor invalida!!");
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
            cera =  Double.parseDouble(tfCera.getText());
        }
        catch (Exception e){
            //TODO melhorar a validação
            mensagem(Alert.AlertType.ERROR,"Valor da cera invalido!!");
            return;
        }
        try {
            tinta = Double.parseDouble(tfTinta.getText());
        }
        catch (Exception e){
            //TODO melhorar a validação
            mensagem(Alert.AlertType.ERROR,"Valor da tinta invalido!!");
            return;
        }

        //cadastrar pintura
        if(!mecanica.cadastraServico(descricao, cor, maoDeObra, cera, tinta)){
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
        tfCor.setText("");
        tfVMaoDeObra.setText("");
        tfCera.setText("");
        tfTinta.setText("");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    private void mostrarMenuServicos(){
        MainGui.mudaCena(MainGui.CADSERVICO, (aClass) -> new JanelaCadServico(mecanica));
    }
}
