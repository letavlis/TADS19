#include <stdio.h>
void main (){
	int num, *p;
	num = 55;
	p = &num; // Recebe o endereço da variável
	printf ("Valor inicial: %d\n", num);
	*p = 100; //Muda o valor apontado pelo ponteiro
	printf ("\nValor final: %d\n", num);
}

