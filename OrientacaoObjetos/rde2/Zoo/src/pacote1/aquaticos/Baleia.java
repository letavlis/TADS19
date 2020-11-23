package pacote1.aquaticos;

public class Baleia extends Aquaticos{


    public Baleia(int codigo, double peso, String nome, int numeroBarbatanas) {
        super(codigo, peso, nome, numeroBarbatanas);
    }

    @Override
    public void mover() {
        System.out.println("A baleia "+nome+" está nadando");
    }

    @Override
    public void emitirSom() {
        System.out.println("A baleia "+nome+" está bufando");
    }
}
