package Mecanica.janelas;

import Mecanica.controles.Mecanica;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class JanelaCadPintura {
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

        //cadastrar veiculo
       /* if(!mecanica.cadastraVeiculo(placa, ano, modelo, cliente)){
            mensagem(Alert.AlertType.ERROR,"Veiculo não cadastrado");
        }
        else {
            mensagem(Alert.AlertType.INFORMATION, "Veiculo cadastrado");
            MainGui.mudaCena(MainGui.PRINCIPAL, (aClass) -> new Principal(mecanica));
        }*/

    }
    private void mensagem(Alert.AlertType type ,String msg){
        Alert alert = new Alert(type,msg);
        alert.showAndWait();
    }
    public void limpar(){
        tfDescricao.setText("");
        tfCor.setText("");
    }

}
