#include <stdio.h>
int main(){
	long num;
	long *p;
	num = 98;
	p = &num; // Ponteiro recebe o endereço da variável
	printf("\nConteudo de p: %p", p);// printa o endereço de memória
	printf("\nValor apontado por p: %li", *p); // printa o valor apontado
	printf("\nValor apontado por p incrementado: %li", ++(*p));	//incrementa o ponteiro
	printf("\nConteúdo de p: %p", p); // printa o endereço de memória
	printf("\nValor apontado por p: %li", num); // printa o valor apontado
	return 0;
}
