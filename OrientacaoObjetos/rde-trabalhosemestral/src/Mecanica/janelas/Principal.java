package Mecanica.janelas;

import Mecanica.MainGui;
import Mecanica.controles.Mecanica;
import javafx.fxml.FXML;


public class Principal {

    private Mecanica mecanica;

    public Principal(Mecanica mecanica){
        this.mecanica = mecanica;
    }

    @FXML
    private void mostrarCadastroVeiculo(){
        MainGui.mudaCena(MainGui.CADVEICULO, (aClass) -> new JanelaCadVeiculo(mecanica));
    }
}