package modelos;

import java.io.Serializable;

public class Pintura implements Serializable {
    private Servico servico;
    private String cor;
    private double valorTinta;
    private double valorCera;

    public Pintura(Servico servico, String cor, double valorCera, double valorTinta) {
        this.servico = servico;
        this.cor = cor;
        this.valorCera = getValorCera();
        this.valorTinta = getValorTinta();

    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Servico getServico() {
        return servico;
    }

    public double getValorTinta() {
        return valorTinta;
    }

    public void setValorTinta(double valorTinta) {
        this.valorTinta = valorTinta;
    }

    public double getValorCera() {
        return valorCera;
    }

    public void setValorCera(double valorCera) {
        this.valorCera = valorCera;
    }
}
