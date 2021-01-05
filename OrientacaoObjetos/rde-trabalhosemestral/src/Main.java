import modelos.Veiculo;
public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo(202101, "abc3b42", 1996, "Gol", "Jose");
        System.out.println("Codigo: "+v1.getCodigo()+"\nPlaca: "+v1.getPlaca()+"\nAno: "+v1.getAno()+"\nModelo: "+v1.getModelo()+"\nCliente: "+v1.getCliente());
    }
}
