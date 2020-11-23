import pacote1.Animal;
import pacote1.aquaticos.Aquaticos;
import pacote1.aquaticos.Baleia;
import pacote1.aquaticos.Peixe;

public class Main {
    public static void main(String[] args){
        Animal[]  animal = new Animal[5];
        Baleia baleia = new Baleia(202001, 5400, "Willy", 4);
        Peixe peixe = new Peixe(202002, 0.150, "nemo", 6);
        animal[0] = baleia;
        animal[1] = peixe;




    }
}
