package modelos;

public class Pintura extends Servico {
    private String cor;
    private double valorTinta;
    private double valorCera;

    public Pintura(int codigo, String descricao, String cor, double valorMaodeObra, double valorCera, double valorTinta) {
        super(codigo, descricao, valorMaodeObra);
        this.cor = cor;
        this.valorCera = valorCera;
        this.valorTinta = valorTinta;

    }

    public Pintura(int codigo) {
        super(codigo);
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
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

    @Override
    public double calculaTotal() {
        double a, b, c, total;
        a = getValorCera();
        b = getValorTinta();
        c = getValorMaodeObra();
        total = a+b+c;
        return total;
    }
}
