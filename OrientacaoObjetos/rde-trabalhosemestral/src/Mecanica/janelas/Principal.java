package Mecanica.janelas;

import Mecanica.MainGui;
import Mecanica.controles.Mecanica;
import Mecanica.modelos.Veiculo;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;


public class Principal implements Initializable {

    @FXML
    private ListView<Veiculo> lstwVeiculo;

    private Mecanica mecanica;

    public Principal(Mecanica mecanica){
        this.mecanica = mecanica;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        lstwVeiculo.setCellFactory(veiculoListView -> new ListCell<>(){
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
        atualizaListaVeiculo();

    }

    private void atualizaListaVeiculo(){
        List<Veiculo> veiculos = this.mecanica.getVeiculos();
        lstwVeiculo.getItems().clear();
        for (Veiculo v:veiculos){
            lstwVeiculo.getItems().add(v);
        }
    }

    @FXML
    private void mostrarCadastroVeiculo(){
        MainGui.mudaCena(MainGui.CADVEICULO, (aClass) -> new JanelaCadVeiculo(mecanica));
    }
    @FXML
    private void mostrarCadastroServico(){
        MainGui.mudaCena(MainGui.CADSERVICO, (aClass)-> new JanelaCadServico(mecanica));
    }
}