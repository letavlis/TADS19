package pacote1;

public abstract class Animal{
    protected String nome;
    protected double peso;
    protected int codigo;

    public Animal( int codigo, double peso, String nome){
        this.nome = nome;
        this.codigo = codigo;
        this.peso = peso;
    }
    public abstract void mover();
    public abstract void emitirSom();
}
