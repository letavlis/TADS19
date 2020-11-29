package exemploset;

import modelos.Pessoa;

import java.util.*;

public class MainHashSet {

    public static void main(String[] args) {

        String op,nome,cpf;
        int idade;

        Set<Pessoa> conjunto = new HashSet<>();


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

            conjunto.add(p);

            System.out.println("Continuar? s-sim");
            op = scanner.nextLine();

        }while (op.equals("s"));

        for(Pessoa p:conjunto){
            System.out.println(p);
        }



    }

}
