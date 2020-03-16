import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Carro[] carros;
		Carro selecionado;
		Scanner scan = new Scanner(System.in);
		int escolha, escolha2, fim = 1;
		double x;

		carros = new Carro[3];


        for (int i = 0; i < carros.length; i++) {
            carros[i] = new Carro();
        }
		// fazer a inicialização dos carros
		//--->

		while (escolha != 4) {
			
			System.out.println("Opções:");
			for(int i = 0; i < carros.length; i++){
				System.out.println((i+1)+" - "+carros[i].modelo);
			}
			System.out.println("4 - Sair")

			System.out.printl("\n\nEscolha uma opção:");
			escolha = scan.nextInt();

			if (escolha > 0 && escolha <= carros.length) {
				selecionado = carros[escolha - 1];

				while (escolha2 != 4) {
					System.out.println("-Menu-");
					System.out.println("1.Acelerar");
					System.out.println("2.Abastecer");
					System.out.println("3.Estado atual");
					System.out.println("4.Sair");
					System.out.println();
					
					escolha2 = scan.nextInt();
					if (escolha2 == 1) {
						x = selecionado.acelerar();
						if (x == 1) {
							System.out.println("Quantidade de combustivel insuficiente, abasteça por favor.");
						}
					} else if (escolha2 == 2) {
						System.out.println("Quantos litros deseja abastecer? ");
						x = scan.nextInt();
						x = selecionado.abastecer(x);
						if (x == 1) {
							System.out.println(
									"Esse valor ultrapassa a quantidade suportada pelo tanque de combustivel, tente novamente");
						}
					} else if (escolha2 == 3) {
						System.out.print("\nVelociadade atual: ");
						System.out.println(selecionado.velocidade);
						System.out.print("Quantidade de combustivel no tanque: ");
						System.out.println(selecionado.combustivel);
					}
					x = 0;
				}
			}
			System.out.println("\nContinuar? 1.Sim / 2.Nao ");
			fim = scan.nextInt();
			if(fim == 2){
				escolha = 4;
			}
		}
	}
}
		/*
		 * carro1 = new Carro(); carro1.marca = "Dodge"; carro1.modelo = "Charger 1969";
		 * carro1.cor = "Laranja"; carro1.potencia = 375; carro1.capacidadeCombustivel =
		 * 100;
		 * 
		 * carro2 = new Carro(); carro2.marca = "Chevrolet"; carro2.modelo =
		 * "Impala 1967"; carro2.cor = "Preto"; carro2.potencia = 330;
		 * carro2.capacidadeCombustivel = 100;
		 * 
		 * carro3 = new Carro(); carro3.marca = "DeLorean"; carro3.modelo = "DMC-12";
		 * carro3.cor = "Prata"; carro3.potencia = 140; carro3.capacidadeCombustivel =
		 * 100;
		 */