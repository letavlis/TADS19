package pacote1.terrstre.comPelos;

import pacote1.terrstre.Terrestre;

public abstract class ComPelos extends Terrestre {
    public ComPelos(int codigo, double peso, String nome) {
        super(codigo, peso, nome);
    }

    public abstract void apararPelo();
}
