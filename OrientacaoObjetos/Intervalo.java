public class Intervalo{
  public static void main(String[] args){
    
    int i, j, cont=0;

    System.out.println("Intervalo de 1 a 2500");
    System.out.println();
    
    System.out.println("Números que divididos por 11 tem resto 5: ");
    for(i = 1; i <=2500; i++){
      if(i%11 == 5){
        if(i != 5){System.out.printf(", %d", i);}
        else{System.out.printf("%d", i);}
      }
    }
    System.out.println();
    System.out.println();
    
    System.out.println("Números pares: ");
    for(i = 1; i <=2500; i++){
      if(i%2 == 0){
        if(i != 2){System.out.printf(", %d", i);}
        else{System.out.printf("%d", i);}
      }
    }
    System.out.println();
    System.out.println();
    
    System.out.println("Números impares: ");
    for(i = 1; i <=2500; i++){
      if(i%2 != 0){
        if(i != 1){System.out.printf(", %d", i);}
        else{System.out.printf("%d", i);}
      }
    }
    System.out.println();
    System.out.println();
    
    System.out.println("Números primos: ");
    i=1;
    do{
      for(j = 1; j <= 2500; j++ ){
        if(i%j == 0){cont++;}
      }
      if(cont != 2){
        i++;
        cont=0;
      }else{
        if(i != 2){System.out.printf(", %d", i);}
        else{System.out.printf("%d", i);}
        i++;
        cont=0;
      }
    }while(i < 2500);
    System.out.println();
  }
}
