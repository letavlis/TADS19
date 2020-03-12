import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Carro carro1, carro2, carro3;
		Scanner scan = new Scanner(System.in);
		int escolha, i, fim=1;
    double x;

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

		while (fim == 1){
      i = 0;
			System.out.println("Opções de carros");
			System.out.println("\nCARRO 1");
			System.out.println(carro1.toString());
			System.out.println("\nCARRO 2");
			System.out.println(carro2.toString());
			System.out.println("\nCARRO 3");
			System.out.println(carro3.toString());

			System.out.print("\n\nEscolha um carro: ");
			escolha = scan.nextInt();

			if (escolha == 1){
				while(i != 1){
					escolha = 0;
					System.out.println("-Menu-");
					System.out.println("1.Acelerar");
					System.out.println("2.Abastecer");
					System.out.println("3.Estado atual");
					System.out.println("4.Sair");
					System.out.println();
					System.out.print("-Escolha uma opção: ");
					escolha = scan.nextInt();
					if (escolha == 1) {
            x = carro1.acelerar();
            if (x == 1){
              System.out.println("Quantidade de combustivel insuficiente, abasteça por favor.");
            }            
					}
					else if (escolha == 2){
						System.out.println("Quantos litros deseja abastecer? ");
						x = scan.nextInt();
            x = carro1.abastecer(x);
            if (x == 1){
              System.out.println("Esse valor ultrapassa a quantidade suportada pelo tanque de combustivel, tente novamente");
            }
					}
					else if (escolha == 3){
						System.out.print("\nVelociadade atual: ");
						System.out.println(carro1.velocidade);
						System.out.print("Quantidade de combustivel no tanque: ");
						System.out.println(carro1.combustivel);
					}
					else if (escolha == 4){
						i = 1;
					}
          x=0;
				}
			}
			else if (escolha == 2){
        while(i != 1){
					escolha = 0;
					System.out.println("-Menu-");
					System.out.println("1.Acelerar");
					System.out.println("2.Abastecer");
					System.out.println("3.Estado atual");
					System.out.println("4.Sair");
					System.out.println();
					System.out.print("-Escolha uma opção: ");
					escolha = scan.nextInt();
					if (escolha == 1) {
            x = carro2.acelerar();
            if (x == 1){
              System.out.println("Quantidade de combustivel insuficiente, abasteça por favor.");
            }            
					}
					else if (escolha == 2){
						System.out.println("Quantos litros deseja abastecer? ");
						x = scan.nextInt();
            x = carro2.abastecer(x);
            if (x == 1){
              System.out.println("Esse valor ultrapassa a quantidade suportada pelo tanque de combustivel, tente novamente");
            }
					}
					else if (escolha == 3){
						System.out.print("\nVelociadade atual: ");
						System.out.println(carro2.velocidade);
						System.out.print("Quantidade de combustivel no tanque: ");
						System.out.println(carro2.combustivel);
					}
					else if (escolha == 4){
						i = 1;
					}
          x=0;
				}
      }
			else if (escolha == 3){
        while(i != 1){
					escolha = 0;
					System.out.println("-Menu-");
					System.out.println("1.Acelerar");
					System.out.println("2.Abastecer");
					System.out.println("3.Estado atual");
					System.out.println("4.Sair");
					System.out.println();
					System.out.print("-Escolha uma opção: ");
					escolha = scan.nextInt();
					if (escolha == 1) {
            x = carro3.acelerar();
            if (x == 1){
              System.out.println("Quantidade de combustivel insuficiente, abasteça por favor.");
            }            
					}
					else if (escolha == 2){
						System.out.println("Quantos litros deseja abastecer? ");
						x = scan.nextInt();
            x = carro3.abastecer(x);
            if (x == 1){
              System.out.println("Esse valor ultrapassa a quantidade suportada pelo tanque de combustivel, tente novamente");
            }
					}
					else if (escolha == 3){
						System.out.print("\nVelociadade atual: ");
						System.out.println(carro3.velocidade);
						System.out.print("Quantidade de combustivel no tanque: ");
						System.out.println(carro3.combustivel);
					}
					else if (escolha == 4){
						i = 1;
					}
          x=0;
				}
      }
			System.out.println("\nContinuar? 1.Sim / 2.Nao ");
			fim = scan.nextInt();
		}
	}
}