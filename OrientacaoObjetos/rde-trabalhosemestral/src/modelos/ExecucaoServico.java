package modelos;

import java.io.Serializable;

public class ExecucaoServico implements Serializable {
    private int codigo;
    private String data;
    private Veiculo veiculo;
    private Servico servico;
    private double total;

    public ExecucaoServico(int codigo, Veiculo veiculo, Servico servico) {
        this.codigo = codigo;
        this.veiculo = veiculo;
        this.servico = servico;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
