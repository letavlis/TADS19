#include<stdio.h>
void imprime(int n);
int main(){
  int numero;
  printf("Digite um numero inteiro: ");
  scanf("%i", &numero);
  imprime(numero/2);
}
void imprime(int n){
  if (n > 0){
    imprime(n/2);
    printf("%i ", n);
  }
}