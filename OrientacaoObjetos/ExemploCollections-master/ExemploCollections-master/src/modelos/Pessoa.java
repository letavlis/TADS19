package modelos;

import java.util.Objects;

public class Pessoa implements Comparable<Pessoa>{

    private String nome;
    private String cpf;
    private int idade;

    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    @Override
    public int compareTo(Pessoa pessoa) {

        return this.idade - pessoa.idade;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade &&
                Objects.equals(nome, pessoa.nome) &&
                Objects.equals(cpf, pessoa.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, idade);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                '}';
    }
}
