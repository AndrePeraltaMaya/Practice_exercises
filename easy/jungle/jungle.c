#include <stdio.h>
#include <string.h>

int main(){
    char sonidos[100];
    printf("Introduce los ruidos: \n");
    fgets(sonidos,sizeof(sonidos),stdin);/**obtenemos **/

    char delimitador[] = ",. "; /**Delimitamos los separadores**/

    char *token = strtok(sonidos, delimitador);

    if(token != NULL){
        while(token != NULL){

            if(token[0] == 'G')
                printf("Lion ");
            else if(token[0] == 'R')
                printf("Tiger ");

            else if(token[0] == 'S')
                printf("Snake ");

            else if(token[0] == 'C')
                printf("%s" ,"Bird ");

            token = strtok(NULL, delimitador);
        }
    }
}


