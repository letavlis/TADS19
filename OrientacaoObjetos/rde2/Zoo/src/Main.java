import pacote1.Animal;
import pacote1.aquaticos.Aquaticos;
import pacote1.aquaticos.Baleia;
import pacote1.aquaticos.Peixe;
import pacote1.terrstre.comPelos.Cavalo;
import pacote1.terrstre.comPelos.Leao;
import pacote1.terrstre.comPelos.Vaca;
import pacote1.terrstre.semPelos.Cascavel;
import pacote1.terrstre.semPelos.Galinha;
import sun.security.krb5.internal.NetClient;

public class Main {
    public static void main(String[] args){
        Animal[]  animal = new Animal[6];
        Baleia baleia = new Baleia(202001, 5400, "Willy", 4);
        Peixe peixe = new Peixe(202002, 0.150, "nemo", 6);
        Cavalo cavalo = new Cavalo(202003,1000,"Pé de pano");
        Leao leao = new Leao(2020004,130 ,"Simba");
        Vaca vaca = new Vaca(2020005,720 , "Mimosa");
        Galinha galinha = new Galinha(202006,0.850 , "Marylou");
        Cascavel cascavel = new Cascavel(202007, 1.2, "Nagini");

        animal[0] = baleia;
        animal[1] = peixe;
        animal[2] = cavalo;
        animal[3] = leao;
        animal[4] = vaca;
        animal[5] = galinha;
        animal[6] = cascavel;




    }
}
