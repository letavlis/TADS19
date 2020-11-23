package pacote1.aquaticos;

import pacote1.Animal;

public abstract class Aquaticos extends Animal {
    protected int numeroBarbatanas;

    public Aquaticos(int codigo, double peso, String nome, int numeroBarbatanas) {
        super(codigo, peso, nome);
        this.numeroBarbatanas = numeroBarbatanas;
    }
}
