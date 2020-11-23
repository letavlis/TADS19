package pacote1.aquaticos;

public class Peixe extends Aquaticos{


    public Peixe(int codigo, double peso, String nome, int numeroBarbatanas) {
        super(codigo, peso, nome, numeroBarbatanas);
    }

    @Override
    public void mover() {
        System.out.println("A peixe "+nome+" está nadando");
    }

    @Override
    public void emitirSom() {
        System.out.println("A peixe "+nome+" está roncando");
    }
}
