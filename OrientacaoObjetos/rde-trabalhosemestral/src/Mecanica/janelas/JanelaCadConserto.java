package Mecanica.janelas;

import Mecanica.controles.Mecanica;
import Mecanica.MainGui;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


public class JanelaCadConserto implements Initializable{
    @FXML
    private TextField tfDescricao;
   // @FXML
    //private  TextField ;
    @FXML
    private TextField tfVMaoDeObra;
  //  @FXML
   // private  TextField ;
   // @FXML
   // private  TextField ;

    Mecanica mecanica;
    public JanelaCadConserto(Mecanica mecanica){
        this.mecanica = mecanica;
    }

    @FXML
    private void cadastrar(){
        String descricao = tfDescricao.getText();

        double maoDeObra;




        if (descricao.isBlank() || descricao.isEmpty()){
            //TODO melhorar a validação
            mensagem(Alert.AlertType.ERROR,"Descricao invalida!!");
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


        //cadastrar pintura
        /*if(!mecanica.cadastraServico()){
            mensagem(Alert.AlertType.ERROR,"Serviço não cadastrado");
        }
        else {
            mensagem(Alert.AlertType.INFORMATION, "Serviço cadastrado");
            MainGui.mudaCena(MainGui.PRINCIPAL, (aClass) -> new Principal(mecanica));
        }*/

    }
    private void mensagem(Alert.AlertType type ,String msg){
        Alert alert = new Alert(type,msg);
        alert.showAndWait();
    }
    public void limpar(){
        tfDescricao.setText("");


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    private void mostrarMenuServicos(){
        MainGui.mudaCena(MainGui.CADSERVICO, (aClass) -> new JanelaCadServico(mecanica));
    }
}

