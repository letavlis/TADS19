public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) throws RuntimeException {
        if(nome.length() < 10) {
            throw new RuntimeException("Tamanho ido nome invalido!!!");
        }
        this.nome = nome;
        if (idade < 18){
            throw new RuntimeException("Idade invalida!!!");
        }
        this.idade = idade;
    }
}
