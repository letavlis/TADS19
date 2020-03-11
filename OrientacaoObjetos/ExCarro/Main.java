import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Carro carro1, carro2, carro3;
		Scanner scan = new Scanner(System.in);
		int escolha, i, x;

		carro1 = new Carro();
		carro1.marca = "Dodge";
		carro1.modelo = "Charger 1969";
		carro1.cor = "Laranja";
		carro1.potencia = 375;
		carro1.capacidadeCombustivel = 100;

		carro2 = new Carro();
		carro2.marca = "Chevrolet";
		carro2.modelo = "Impala 1967";
		carro2.cor = "Preto";
		carro2.potencia = 330;
		carro2.capacidadeCombustivel = 100;

		carro3 = new Carro();
		carro3.marca = "DeLorean";
		carro3.modelo = "DMC-12";
		carro3.cor = "Prata";
		carro3. potencia = 140;
		carro3.capacidadeCombustivel = 100;


		System.out.println("Opções de carros");
		System.out.println("\nCARRO 1");
		System.out.println(carro1.toString());
		System.out.println("\nCARRO 2");
		System.out.println(carro2.toString());
		System.out.println("\nCARRO 3");
		System.out.println(carro3.toString());

		System.out.print("\n\nEscolha um carro: ");
		escolha = scan.nextInt():

		if (ecolha == 1){
			do{
				escolha = 0;
				System.out.println("-Menu-");
				System.out.println("1.Acelerar");
				System.out.println("2.Abastecer");
				System.out.println("3.Estado atual")
				System.out.println("4.Sair");
				System.out.println();
				System.out.print("-Escolha uma opção: ");
				escolha = scan.nextInt();
				if (escolha == 1) {
					carro1.acelerar();
				}
				else if (escolha == 2){
					System.out.println("Quantos litros deseja abastecer? ")
					x = scan.nextInt();
					carro1.abastecer(x);
				}
				else if (escolha == 3){
					System.out.println("Velociadade atual: "+i+""+carro1.velociadade);
					System.out.println("Quantidade de combustivel no tanque: "+i+""+carro1.combustivel);
				}
			}while(i == 1)
		}
		else if (ecolha == 1){}
		else if (ecolha == 1){}

	}
}