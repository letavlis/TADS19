#include <stdio.h>
int main (){
	int vet [4];
	int *p;
	p=vet;
	for (int count = 0; count < 4; count++){
		//ponteiro no inicio do vetor
		*p=0;
		//incrementa o ponteiro baseado em valores inteiros
		p++;
	}
	for (int i = 0; i < 4; i++)
		printf("%d ",vet[i]);


	printf("\n");
	return 0;
}
