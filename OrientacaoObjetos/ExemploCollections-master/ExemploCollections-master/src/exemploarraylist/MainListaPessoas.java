package exemploarraylist;

import java.util.*;

import modelos.Pessoa;

public class MainListaPessoas {

    public static void main(String[] args) {

        String op,nome,cpf;
        int idade;

        List<Pessoa> lista = new ArrayList<>();


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

            lista.add(p);

            System.out.println("Continuar? s-sim");
            op = scanner.nextLine();

        }while (op.equals("s"));


        Collections.sort(lista, new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa pessoa, Pessoa t1) {
                return pessoa.getNome().compareTo(t1.getNome());
            }
        });


        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }

    }

}
