#include <stdio.h>

void main(){
    int rex, O, i, v[12]={12,4,5,9,69,7,0,2,3,44,22,33};
    
    for (i = 1; i <= 11; i++){
        rex = v[i];
        O=i-1;
        while(O >= 0 && rex < v[O]){
            v[O+1] = v[O];
            O--;
        }
        v[O+1] = rex;
    }

    for (i = 0; i <= 11; i++)
        printf("%d ", v[i]);

    printf("\n");
}