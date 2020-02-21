import java.util.Scanner;

public class VerificaNumero{
  public static void main(String[] args){

    int [] arr;
    arr = new int[100];

    int me, ma, soma, i=0, stp=0, num, med, dif;
    Scanner scan = new Scanner(System.in);

    System.out.println("você pode digitar ate 100 numeros inteiros [ou digite -1 para parar]");
    System.out.printf("\nDigite um numero inteiro: ");
    num = scan.nextInt();
    
    if (num != -1){
      arr[i] = num;
      ma = arr[i];
      me = arr[i];
      soma = arr[i];
      while(i < 100){
        i++;
        System.out.printf("\nDigite um numero inteiro: ");
        num = scan.nextInt();
        if (num != -1){
          arr[i] = num;
          if(ma < arr[i]){ma = arr[i];}
          else if(me > arr[i]){me = arr[i];}
          soma = soma+arr[i];
        }else{
          stp = i;
          i = 101;
        }
      }  
      System.out.printf("\n\nOs numeros digitados são: ");
      for(i = 0; i < stp; i++){
        System.out.printf("%d", arr[i]);
        if (i < stp-1){System.out.printf(", ");}
      }     
      
      System.out.printf("\n\nO maior numero e: %d", ma);
      System.out.printf("\nO menor numero e: %d", me);
      System.out.printf("\nA soma de todos os numeros e: %d", soma);
      
      System.out.println("\n\nCada número digitado subtraído do maior");
      for(i = 0; i < stp; i++){
        System.out.printf("%d", arr[i]-ma);
        if (i < stp-1){System.out.printf(", ");}
      }

      System.out.println("\n\nCada número digitado acrescido do menor");
      for(i = 0; i < stp; i++){
        System.out.printf("%d", arr[i]+me);
        if (i < stp-1){System.out.printf(", ");}
      }
      
      med = soma/stp;
      System.out.printf("\n\nA media e: %d", med);
      System.out.println("\n\nA diferença entre cada numero e a media:");
      for(i = 0; i < stp; i++){
        dif = arr[i] - med;
        System.out.printf("%d", dif);
        if (i < stp-1){System.out.printf(", ");}
      }
    }
    System.out.println();
  }
}