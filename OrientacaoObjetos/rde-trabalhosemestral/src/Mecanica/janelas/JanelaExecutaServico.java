package Mecanica.janelas;

import Mecanica.MainGui;
import Mecanica.controles.Mecanica;
import Mecanica.modelos.Conserto;
import Mecanica.modelos.Pintura;
import Mecanica.modelos.Servico;
import Mecanica.modelos.Veiculo;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class JanelaExecutaServico implements Initializable {
    @FXML
    private ListView<Veiculo> lstwVeiculo;
    @FXML
    private ListView<Servico> lstwServicos;
    @FXML
    private TextArea txtaInfos;

    Mecanica mecanica;

    public JanelaExecutaServico(Mecanica mecanica) {
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
    @FXML
    private void mostrarMenuPrincipal(){
        MainGui.mudaCena(MainGui.PRINCIPAL, (aClass) -> new Principal(mecanica));
    }
    @FXML
    private void executa(){
        Veiculo v = lstwVeiculo.getSelectionModel().getSelectedItem();
        Servico s = lstwServicos.getSelectionModel().getSelectedItem();
        if(s!=null && v!=null) {
            mecanica.executaServico(v, s);

            String str = "";
            str+= "Serviço executado: " +s.getDesc()+"\n";
            str+= "Veiculo: " +v.getPlaca()+"\n";
            str+= "Cliente: " +v.getCliente()+"\n";
            str+="\tMão de Obra: "+s.getValMO()+"\n";
            if(s instanceof Conserto){
                Conserto cns = (Conserto) s;
                str+="\t\tPeças: ";
                for(String p: cns.getPecas()){
                    str+=p+";";
                }
                str+="\n\t\tValor das Peças: "+cns.getValPecas();
                str+="\n\t\tValor Total: "+cns.calculaTotal();
            }else{
                Pintura pin = (Pintura) s;
                str+="\t\tValor da tinta: "+pin.getVTinta();
                str+="\n\t\tValor da cera: "+pin.getVCera();
                str+="\n\t\tCor: "+pin.getCor();
                str+="\n\t\tValor Total: "+pin.calculaTotal();
            }
            txtaInfos.clear();
            txtaInfos.setText(str);
        }
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
}
