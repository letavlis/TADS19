#include <stdio.h>
int main (){
	float matrx [4][4];
	float *p;
	int count;
	p  =matrx[0];
	for (count = 0; count < 16; count++){
		//Inicia o ponteiro
		*p = 0;
		//Incrementa o ponteiro com base em floats
		p++;
		printf("%f ", *p);
	}
}

