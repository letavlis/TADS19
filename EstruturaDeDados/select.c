#include <stdio.h>

void main(){
    int rex, O=0, i, pm, v[12]={12,4,5,9,69,7,0,2,3,44,22,33};
    
    printf("\n");
    
    while(O < 11){
        pm = O;
        for(i = O+1; i <= 11; i++){
            if(v[pm] > v[i]){
                pm=i;
            }
        }
        rex = v[O];
        v[O] = v[pm];
        v[pm] = rex;
        O++;
    }

    for(i = 0; i <=11; i++){
        printf("%d ", v[i]);
    }
    printf("\n");
}