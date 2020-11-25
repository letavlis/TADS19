#include <stdio.h>
int main (){
	int num, *p1, *p2;
	num = 55;
	p1 = &num;// Recebe o endereço da variável
	*p2 = *p1; // Recebe o valor apontado pelo outro ponteiro
	printf("Conteúdo de p1: %p ", p1);
	printf("Valor apontado por p1: %i", *p1);
	printf("Conteúdo de p2: %p", p2);
	printf("Valor apontado por p2: %i ", *p2);
	return 0;
}
