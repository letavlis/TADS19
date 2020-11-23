package pacote1.terrestre.comPelos;

public class Cavalo extends ComPelos {
    public Cavalo(int codigo, double peso, String nome) {
        super(codigo, peso, nome);
    }

    @Override
    public void apararPelo() {
        System.out.println("O cavalo "+nome+" está com a crina aparada");
    }

    @Override
    public void mover() {
        System.out.println("O cavalo "+nome+" está galopando"); 
    }

    @Override
    public void emitirSom() {
        System.out.println("O cavalo "+nome+" está relinchando Hin in in");
    }
}
