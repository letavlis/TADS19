package modelos;

import java.io.Serializable;
import java.util.ArrayList;

public class Conserto implements Serializable {
    private Servico servico;
    private double valorPecas;
    private ArrayList<String> pecas;

    public Conserto(Servico servico, double valorPecas, ArrayList<String> pecas) {
        this.servico = servico;
        this.valorPecas = valorPecas;
        this.pecas = pecas;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
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
}
