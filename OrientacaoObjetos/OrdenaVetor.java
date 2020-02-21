import java.util.Scanner;

public class OrdenaVetor{
    public static void main(String[] args) {
        
        int i, tam, j, flag=0;
        Scanner scan = new Scanner(System.in);
    
        System.out.printf("Informe a quantidade de numeros quer digitar: ");
        tam = scan.nextInt();

        int[] arr;
        arr = new int[tam];
        System.out.println("\nDigite %d numeros", tam)
        for(i = 0; i < tam; i++){
            System.ou.println(""+d+"° numero: "+(i+1));
            arr[i] =  scan.nextInt();
        }
        
        for(i = 0; i < tam; i++){
            for(j = i+1; j < tam;){
                if(arr[i]>arr[j]){
                    flag++;
                }
            }
        }
        if (flag != 0){
            //Ordene o vetor
        }
        else{
            //Printe mensagem de vetor ordenado
        }
    }
}