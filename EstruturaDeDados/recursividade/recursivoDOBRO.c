#include<stdio.h>
void imprime(int n);
int main(){
  int numero;
  printf("Digite um numero inteiro: ");
  scanf("%i", &numero);
  imprime(numero*2);
}
void imprime(int n){
  if (n < 1000){
    printf("%i ", n);
    imprime(n*2);
  }
}