#include <stdio.h>
int main (){
	long num;
	long *p;
	num = 55;
	p = &num; //Recebe o endereço da variável
	printf("Conteúdo de p: %x\n", p); //Printa o endereço apontado
	printf("Valor apontado por p: %l\n", *p);//Printa o valor apontado
	printf("Conteúdo de p incrementado: %x\n", ++p);//Incrementa o ponteiro com base em longs
	printf("Valor apontado por p incrementado: %l\n", *p);//Valor (proximo long) apontado
	printf("Conteúdo de num: %ld\n", num);//Printa o valor da variável
}