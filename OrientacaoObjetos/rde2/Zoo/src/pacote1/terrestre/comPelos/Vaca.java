package pacote1.terrstre.comPelos;

public class Vaca extends ComPelos{
    public Vaca(int codigo, double peso, String nome) {
        super(codigo, peso, nome);
    }

    @Override
    public void apararPelo() {
        System.out.println("A vaca "+nome+" está com os pelos aparados");
    }

    @Override
    public void mover() {
        
    }

    @Override
    public void emitirSom() {

    }
}
