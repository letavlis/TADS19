public class Carro{

	public double velocidade;
	public double capacidadeCombustivel;
	public double potencia;
	public double combustivel;
	public String cor;
	public String modelo;
	public String marca;

	public int acelerar(){
    double a, b;
    a = potencia*0.01;
    b = potencia*0.005;
    if (combustivel-b > 0){
      velocidade = velocidade + a;
		  combustivel = combustivel - b;
      return 0;
    }else{return 1;}
	}
	public int abastecer(double qtde){
    if (combustivel+qtde < capacidadeCombustivel){
      combustivel = combustivel+qtde;
      return 0;
    }
    else{return 1;}
	}

	public String toString(){
		String str = "\nMarca: "+marca+"\nModelo: "+modelo+"\nCor: "+cor+"\nPotencia: "+potencia;
		return str;
	}

}