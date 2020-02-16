#include <stdio.h>
#include <time.h>
#include <stdlib.h>

int main(){
        int entrada[6], saida[6], i, j, cont=0;

        printf("\t-Escolha 6 números de 1 a 60  para fazer o seu jogo");
        for(i = 0; i < 6; i++){
                printf("\n\t%dº numero: ", i+1);
                scanf("%d", &entrada[i]);
        }
        printf("\n\t-Os numeros sorteados foram: ");
        srand(time(NULL));
        for(i = 0; i < 6; i++){
                saida[i] = 1+rand()%61;
                printf("%d ", saida[i]);
        }
        for(i = 0; i < 6; i++){
                for(j = 0; j < 6; j++){
                        if(entrada[i]==entrada[j]){
                                cont++;
                        }
                }
        }
        switch(cont){
                case 4: printf("\n\tVocê fez uma quadra");break;
                case 5: printf("\n\tVocê fez uma quina");break;
                case 6: printf("\n\tVoce fez uma sena");break;
        }
        printf("\n\n");
        return 0;
}
