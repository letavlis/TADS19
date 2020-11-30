import java.util.*;

public class Main {
    public static void main(String[] args){
        int para=6, numero, cont=1;
       int [] sorteio = new int[6];
        System.out.println("-Escolha 6 números de 1 a 60  para fazer o seu jogo");
        Set<Integer>  listanumero = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        do {
            boolean adicionar = true;
            System.out.println(""+cont+"º número: ");
            numero = scanner.nextInt();
            if(numero > 60){
                adicionar = false;
                System.out.println("Este número é maior que 60! Tente novamente.");
            }
            else if(numero < 1){
                adicionar = false;
                System.out.println("Este número é menor que 1! Tente novamente.");
            }
            for(int i:listanumero){
                if(i == numero){
                    adicionar = false;
                    System.out.println("Este número ja foi escolhido! Tente novamente.");
                    break;
                }
            }
           if(adicionar) {
               listanumero.add(numero);
               cont++;
           }
        }while(listanumero.size() < para);
        System.out.println("Os numeros sorteados foram");
        for (int i=0; i< sorteio.length; i++){
            sorteio[i] = (int) (Math.random()*60 + 1);
            System.out.print(sorteio[i]);
        }
        cont=0;
        for(int i:listanumero){
            for(int j=0;j < sorteio.length;){
                if (i == sorteio[j]){
                    cont++;
                    break;
                }
                else{j++;}
            }
        }
        switch (cont){
            case 4 -> System.out.println("Você fez uma quadra");
            case 5 -> System.out.println("Você fez uma quina");
            case 6 -> System.out.println("Você fez uma sena");
        }
    }
}