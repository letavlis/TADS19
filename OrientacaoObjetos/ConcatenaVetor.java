import java.util.Scanner;

public class ConcatenaVetor{
  public static void main(String[] args){

    int [] arr;
    arr = new int[100];
    int [] vet;
    vet = new int[100];
    int i=0, num=0, a=0, b=0;
    Scanner scan = new Scanner(System.in);
    System.out.println("você pode digitar ate 100 numeros inteiros para cada vetor [ou digite -1 para parar]");    
    System.out.println("Primeiro vetor");
    System.out.printf("\nDigite um numero inteiro: ");
    num = scan.nextInt();
    if (num != -1){
      arr[i] = num;
      while(i < 100){
        i++;
        if (num != -1 && i < 100){
          System.out.printf("\nDigite um numero inteiro: ");
          num = scan.nextInt();
          arr[i] = num;
          a=i;
        }else if(i == 100) {
          a=i;
          num = -i;
        }else if (num == -1){i = 101;}
      }  
    }
    System.out.println("\nSegundo vetor");
    i=0;
    System.out.printf("\nDigite um numero inteiro: ");
    num = scan.nextInt();
    if (num != -1){
      vet[i] = num;
      while(i < 100){
        i++;
        if (num != -1){
          System.out.printf("\nDigite um numero inteiro: ");
          num = scan.nextInt();
          vet[i] = num;
          b=i;
        }else if (i == 100){
          b=i;
          num = -1;
        }else if (num == -1){ i = 101;}
      }
    }   
    System.out.printf("\n\nPrimeiro vetor digitado: ");
    for(i = 0; i < a; i++){
      System.out.printf("%d", arr[i]);
      if (i < a-1){System.out.printf(", ");}
    }
    System.out.printf("\n\nSegundo vetor digitado: ");
    for(i = 0; i < b; i++){
      System.out.printf("%d", vet[i]);
      if (i < b-1){System.out.printf(", ");}
    } 
    int tam = (a+b);
    int [] v;
    v = new int[tam];
    b=0;
    for (i = 0; i < tam; i++){
      if (i < a){v[i] = arr[i];}
      else{
        v[i] = vet[b];
        b++;
      }
    }
    System.out.print("\n\nO vetor concatenado: ");
    for(i = 0; i < tam; i++){
      System.out.printf("%d", v[i]);
      if (i < tam-1){System.out.printf(", ");}
    }
    for (i = 1; i < tam; i++){
      a = v[i];
      b=i-1;
      while(b >= 0 && a < v[b]){
        v[b+1] = v[b];
        b--;
      }
      v[b+1] = a;
    }
    System.out.print("\n\nO vetor ordenado: ");
    for(i=0; i < tam; i++){
      System.out.printf("%d", v[i]);
      if (i < tam-1){System.out.printf(", ");}
    }
    System.out.println();
  }
}