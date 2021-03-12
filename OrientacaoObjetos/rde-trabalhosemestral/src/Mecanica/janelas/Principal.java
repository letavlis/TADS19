package Mecanica.janelas;

import Mecanica.MainGui;
import Mecanica.controles.Mecanica;
import Mecanica.modelos.Servico;
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
    @FXML
    private ListView<Servico> lstwServicos;

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
        lstwServicos.setCellFactory(servicoListView -> new ListCell<>(){
            @Override
            protected void updateItem(Servico servico, boolean b){
                super.updateItem(servico, b);
                if(servico != null){
                    setText(servico.getDesc());
                }else{
                    setText("");
                }
            }
        });
        atualizaListaVeiculo();
        atualizaListaServicos();
    }

    private void atualizaListaVeiculo(){
        List<Veiculo> veiculos = this.mecanica.getVeiculos();
        lstwVeiculo.getItems().clear();
        for (Veiculo v:veiculos){
            lstwVeiculo.getItems().add(v);
        }
    }
    private void atualizaListaServicos(){
        List<Servico> servico = this.mecanica.getServicos();
        lstwServicos.getItems().clear();
        for (Servico s:servico){
            lstwServicos.getItems().add(s);
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
    @FXML
    private void mostrarEmitirRelatorio(){
        MainGui.mudaCena(MainGui.EMITIRRELATORIO, (aClass)-> new JanelaEmitirRelatorio(mecanica));
    }
    @FXML
    private void mostrarExecutaServico(){
        MainGui.mudaCena(MainGui.EXECUTASERVICO, (aClass)-> new JanelaExecutaServico(mecanica));
    }
}