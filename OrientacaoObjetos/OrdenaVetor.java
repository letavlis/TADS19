import java.util.Scanner;

public class OrdenaVetor{
    public static void main(String[] args) {
        
        int i, tam, j, flag=0, aux;
        Scanner scan = new Scanner(System.in);
    
        System.out.printf("Informe a quantidade de numeros quer digitar: ");
        tam = scan.nextInt();

        int[] arr;
        arr = new int[tam];
        System.out.printf("\nDigite %d numeros\n", tam);
        for(i = 0; i < tam; i++){
            System.out.printf("%d° numero: ", i+1);
            arr[i] =  scan.nextInt();
            System.out.println();
        }
        
        System.out.print("\nO vetor digitado: ");

        for(i = 0; i < tam; i++){
                System.out.printf("%d ", arr[i]);
        }

        for(i = 0; i < tam; i++){
           j = i+1;
           while(j < tam-1){
                if(arr[i]>arr[j]){
                    flag++;
                }
                j++;
            }
        }
        if (flag != 0){
            for (i = 1; i < tam; i++){
                    aux = arr[i];
                    j=i-1;
                    while(j >= 0 && aux < arr[j]){
                            arr[j+1] = arr[j];
                            j--;
                    }
                    arr[j+1] = aux;
            }
            System.out.print("\n\nO vetor ordenado: ");
            for(i=0; i < tam; i++){
                System.out.printf("%d ", arr[i]);
            }
       }
       System.out.println();
    }
}
