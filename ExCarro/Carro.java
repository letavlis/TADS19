public class Carro{

	public int velociadade;
	public int capacidadeCombustivel;
	public int potencia;
	public double combustivel;
	public String cor;
	public String modelo;
	public String marca;

	public void acelerar(){
		velociadade = velocidade + (potencia * 0.01);
		combustivel = combustivel - (potencia * 0.005);
	}
	public void abastecer(double qtde){
		combustivel = combustivel+qte;
	}

	public String toString(){
		String str =  "\nMarca: "+marca+"\nModelo: "+modelo+"\nCor: "+cor"\nPotencia: "+potencia;
		return str;
	}
}