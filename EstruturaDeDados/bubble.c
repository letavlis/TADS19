#include<stdio.h>
// [TADS19]    elvis.andrade@ifpr.edu.br
void main(){		//     0 2 12       5 4
	int rex, O, i, v[12]={12,4,5,9,69,7,0,2,3,44,22,33};
	O = 0;
	printf("OOOHHH \n");
	while(O < 11){
		for(i=O+1;i<=11;i++){	
			if(v[O]>v[i]){
				rex = v[i];
				v[i]=v[O];
				v[O]=rex;
			}
		}
		O=O+1;
	}
	for(i=0;i<=11;i++)
		printf("%i ",v[i]);
}
