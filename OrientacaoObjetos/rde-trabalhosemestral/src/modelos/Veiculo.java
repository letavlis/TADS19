package modelos;

import java.io.Serializable;
import java.util.Objects;

public class Veiculo implements Serializable {

    private int codigo;
    private String placa;
    private int ano;
    private String modelo;
    private String cliente;

    public Veiculo(int codigo, String placa, int ano, String modelo, String cliente) {
        this.codigo = codigo;
        this.placa = placa;
        this.ano = ano;
        this.modelo = modelo;
        this.cliente = cliente;
    }
    //para utilizar no buscar veiculo pelo codigo
    public Veiculo(int codigo){
        this.codigo = codigo;
    }
    //para buscar só a placa
    public Veiculo(String placa) {
        this.placa = placa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veiculo veiculo = (Veiculo) o;
        return codigo == veiculo.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
