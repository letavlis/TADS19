import java.util.Scanner;

public class Triangulo{
  public static void main(String[] args){
    int a, b, c;
    Scanner scan = new Scanner(System.in);

    System.out.println("-Digite a medida dos lados de um triangulo qualquer-");
    System.out.printf("\n1º lado: ");
    a = scan.nextInt();
    System.out.printf("\n2º lado: ");
    b = scan.nextInt();
    System.out.printf("\n3º lado: ");
    c = scan.nextInt();

    if (a + b >= c && a + c >= b && b + c >= a){
          if (a == b && b == c && c == a)
            System.out.println("\nEste é um triangulo Equilatero\n");
          else if (a == b || b == c || c == a)
            System.out.println("\nEste é um triangulo Isosceles\n");
          else if (a != b && b != c && c != a)
            System.out.println("\nEste é um triangulo Escaleno\n");
    }else 
      System.out.println("\nValores invalidos para formar um triangulo\n");
  }
}