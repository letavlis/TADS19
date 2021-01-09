import controles.Mecanica;
public class Main {
    public static void main(String[] args) {
        Mecanica m = new Mecanica("Silva");
        m.cadastraVeiculo("abd-2b55", 96, "Gol", "Joao");
        System.out.println(m.toString());
        m.cadastraVeiculo("abd-2b54", 96, "Gol", "Jose");
        System.out.println(m.toString());
        m.cadastraVeiculo("abd-2b53", 96, "Gol", "Jeff");
        m.cadastraVeiculo("abd-2b54", 97, "Golf", "Julio");
        System.out.println(m.toString());
        m.cadastraVeiculo("abd-2b53", 97, "Golf", "Jeje");
        System.out.println(m.toString());
    }
}
