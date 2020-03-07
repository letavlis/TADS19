public class Carro{

	public double velocidade;
	public double capacidadeCombustivel;
	public double potencia;
	public double combustivel;
	public String cor;
	public String modelo;
	public String marca;

	public void acelerar(){
		velocidade = velocidade + (potencia * 0.01);
		combustivel = combustivel - (potencia * 0.005);
	}
	public void abastecer(double qtde){
		combustivel = combustivel+qtde;
	}

	public String toString(){
		String str = "\nMarca: "+marca+"\nModelo: "+modelo+"\nCor: "+cor+"\nPotencia: "+potencia;
		return str;
	}
}