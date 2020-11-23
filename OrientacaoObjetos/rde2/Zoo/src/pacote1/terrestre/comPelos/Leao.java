package pacote1.terrstre.comPelos;

public class Leao extends ComPelos{
    public Leao(final int codigo, final double peso, final String nome) {
        super(codigo, peso, nome);
    }

    @Override
    public void apararPelo() {
        System.out.println("O leão "+nome+" está com a juba aparada");

    }

    @Override
    public void mover() {
        System.out.println("O leão "+nome+" está andando");
    }

    @Override
    public void emitirSom() {
        System.out.println("O leão "+nome+" está rugindo RAWR!");
    }
}
