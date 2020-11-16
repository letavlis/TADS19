#include<stdio.h>
int fatorial (int);
void main(){
        int f;
        printf("insira um numero inteiro menor que 10: ");
        scanf("%d", &f);
        printf("O fatorial de %d é: %d",f, fatorial(f)); 
}
int fatorial(int n){
        if (n == 0)
                return 1;
        else
                return n*fatorial(n-1);
}
