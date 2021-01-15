package Mecanica.modelos;

import java.util.ArrayList;

public class Conserto extends Servico{
    private double valorPecas;
    private ArrayList<String> pecas;

    public Conserto(int codigo, String descricao, ArrayList<String> pecas, double valorMaodeObra, double valorPecas) {
        super(codigo, descricao, valorMaodeObra);
        this.valorPecas = valorPecas;
        this.pecas = pecas;
    }

    public Conserto(int codigo) {
        super(codigo);
    }

    public double getValorPecas() {
        return valorPecas;
    }

    public void setValorPecas(double valorPecas) {
        this.valorPecas = valorPecas;
    }

    public ArrayList<String> getPecas() {
        return pecas;
    }

    public void setPecas(ArrayList<String> pecas) {
        this.pecas = pecas;
    }

    @Override
    public double calculaTotal() {
        return 0;
    }
}
