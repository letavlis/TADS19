public class Carro {

	private double velocidade;
	private double capacidadeCombustivel;
	private double potencia;
	private double combustivel;
	private String cor;
	private String modelo;
	private String marca;
	private String placa;

	public Carro(String marca, String modelo, String placa, String cor, double potencia, double velocidade, double capacidadeCombustivel, double combustivel){
		this
	}
	public Carro(String modelo, String placa, String cor){

	}

	public int acelerar() {
		double a, b;
		a = potencia * 0.01;
		b = potencia * 0.005;
		if (combustivel - b > 0) {
			velocidade = velocidade + a;
			combustivel = combustivel - b;
			return 0;
		} else {
			return 1;
		}
	}

	public int abastecer(double qtde) {
		if (combustivel + qtde < capacidadeCombustivel) {
			combustivel = combustivel + qtde;
			return 0;
		} else {
			return 1;
		}
	}

	public String toString() {
		String str = "\nMarca: " + marca + "\nModelo: " + modelo + "\nCor: " + cor + "\nPotencia: " + potencia;
		return str;
	}

}