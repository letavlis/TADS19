package exemplomap;

import modelos.Pessoa;

import java.util.*;

public class MainMap {

    public static void main(String[] args) {

        String op,nome,cpf;
        int idade;

        Map<String,Pessoa> mapa = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Digite o nome:");
            nome = scanner.nextLine();

            System.out.println("Digite o cpf:");
            cpf = scanner.nextLine();

            System.out.println("Digite a idade:");
            idade = scanner.nextInt();
            scanner.nextLine();

            Pessoa p = new Pessoa(nome,cpf,idade);

            mapa.put(cpf,p);


            System.out.println("Continuar? s-sim");
            op = scanner.nextLine();

        }while (op.equals("s"));


        for(String chave:mapa.keySet()){

            System.out.println("CPF:"+chave+" -> "+mapa.get(chave));

        }



    }


}
