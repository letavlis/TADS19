#include <stdio.h>
void main(){
	int num, valor;
	int *p; num = 55; p = &num;
	valor=*p; //valor recebe o número apontado pelo endereço
	printf ("%d\n", valor);//printa o valor 
	printf ("Endereco para onde o ponteiro aponta: %p\n", p);
	printf ("Valor da variavel apontada: %d\n", *p);
}