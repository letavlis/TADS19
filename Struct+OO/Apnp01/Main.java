//importa pacote de classe necessario para random e scan
import java.util.Random;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int[] vetor;
		int tam = 0, i = 0, a = 0;

		while(a != 1){
			System.out.println("Digite o tamanho do vetor");
			tam = scan.nextInt();
			vetor = new int [tam];
			//coloquei até 100 apenas para visualização ficar melhor
			for (i = 0; i < vetor.length; i++) {
				vetor[i] = rand.nextInt(100);
			}
			
			System.out.println("-> Insert");
			Insertion x = new Insertion(vetor);
			x.insertionSort();
			System.out.print("Vetor Original:");
			
			for (i = 0; i < tam; i++) {
				System.out.print(" "+x.getVetorOriginal(i));
			}
			
			System.out.println();
			System.out.print("Vetor Ordenado:");
			
			for (i = 0; i < tam; i++) {
				System.out.print(" "+x.getVetorOrdenado(i));
			}
			
			System.out.println();
			System.out.println("Quantidade de trocas: "+x.getQuantidadeDeTrocas());
			System.out.println(x.toString());
			
			System.out.println("-> Select");
			Select y = new Select(vetor);
			y.selectSort();
			System.out.print("Vetor Original:");
			
			for (i = 0; i < tam; i++) {
				System.out.print(" "+y.getVetorOriginal(i));
			}
			
			System.out.println();
			System.out.print("Vetor Ordenado:");
			
			for (i = 0; i < tam; i++) {
				System.out.print(" "+y.getVetorOrdenado(i));
			}
			
			System.out.println();
			System.out.println("Quantidade de trocas: "+y.getQuantidadeDeTrocas());
			System.out.println(y.toString());

			System.out.println("-> Bubble");
			Bubble z = new Bubble(vetor);
			z.bubbleSort();
			System.out.print("Vetor Original:");
			
			for (i = 0; i < tam; i++) {
				System.out.print(" "+z.getVetorOriginal(i));
			}
			
			System.out.println();
			System.out.print("Vetor Ordenado:");
			
			for (i = 0; i < tam; i++) {
				System.out.print(" "+z.getVetorOrdenado(i));
			}
			
			System.out.println();
			System.out.println("Quantidade de trocas: "+z.getQuantidadeDeTrocas());
			System.out.println(z.toString());

			System.out.println("Deseja continuar? Sim(0)/Não(1)");
			a = scan.nextInt();
		}
	}
}