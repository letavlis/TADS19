package pacote1.terrestre.semPelos;

public class Galinha extends SemPelos {
    public Galinha(int codigo, double peso, String nome) {
        super(codigo, peso, nome);
    }

    @Override
    public void mover() {
        System.out.println("A galinha "+nome+" está andando");
    }

    @Override
    public void emitirSom() {
        System.out.println("A galinha "+nome+" está cacarejando có có có");
    }
}
