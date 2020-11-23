package pacote1.terrestre.semPelos;

public class Cascavel extends SemPelos {
    public Cascavel(int codigo, double peso, String nome) {
        super(codigo, peso, nome);
    }

    @Override
    public void mover() {
        System.out.println("A cobra "+nome+" está rastejando");
    }

    @Override
    public void emitirSom() {
        System.out.println("A cobra "+nome+" esssssssstá ssssssibilando sssssssssssss");
    }
}
