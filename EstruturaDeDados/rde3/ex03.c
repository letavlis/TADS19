#include <stdio.h>
int main (){
	int num, *p1, *p2;
	num = 55;
	p1 = &num; // Recebe o endereço apontado pela variável
	p2 = p1; // ponteiros apontam para o mesmo endereço
	printf("Conteúdo de p1: %x\n", p1);
	printf("Valor apontado por p1: %d\n", *p1);
	printf("Conteúdo de p2: %x\n", p2);
	printf("Valor apontado por p2: %d\n", *p2);
	return 0;
}
