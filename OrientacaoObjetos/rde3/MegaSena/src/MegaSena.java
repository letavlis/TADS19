import java.util.*;
public class MegaSena {
    public static void main(String[] args){
        int para=6, numero, cont=1;
        System.out.println("-Escolha 6 números de 1 a 60  para fazer o seu jogo");
        Set<EscolheNum>  listanumero = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        do {
            boolean adicionar = true;
            System.out.print(""+cont+"º número: ");
            numero = scanner.nextInt();
            if(numero > 60){
                adicionar = false;
                System.out.println("Este número é maior que 60! Tente novamente.");
            }
            else if(numero < 1){
                adicionar = false;
                System.out.println("Este número é menor que 1! Tente novamente.");
            }
            EscolheNum n = new EscolheNum(numero);
            for(EscolheNum i:listanumero){
                if(i.equals(n)){
                    adicionar = false;
                    System.out.println("Este número ja foi escolhido! Tente novamente.");
                    break;
                }
            }
            if(adicionar) {
                listanumero.add(n);
                cont++;
            }
        }while(listanumero.size() < para);
        Set<EscolheNum>  listasorteio = new HashSet<>();
        do{
            numero = (int)(Math.random()*60+1);
            EscolheNum s = new EscolheNum(numero);
            listasorteio.add(s);
        }while(listasorteio.size() < para);
        System.out.println("Os numeros sorteados foram");
        for(EscolheNum s:listasorteio){
            System.out.println(s);
        }
        System.out.println();
        cont=0;
        for(EscolheNum n:listanumero){
            for(EscolheNum s: listasorteio){
                if (n.equals(s)) {
                    cont++;
                }
            }
        }
        switch (cont) {
            case 4 -> System.out.println("Você fez uma quadra");
            case 5 -> System.out.println("Você fez uma quina");
            case 6 -> System.out.println("Você fez uma sena");
        }
    }
}