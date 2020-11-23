package pacote1.terrestre.comPelos;

import pacote1.terrestre.Terrestre;

public abstract class ComPelos extends Terrestre {
    public ComPelos(int codigo, double peso, String nome) {
        super(codigo, peso, nome);
    }

    public abstract void apararPelo();
}
