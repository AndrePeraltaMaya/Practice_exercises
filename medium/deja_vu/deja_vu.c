#include <stdio.h>
#include <string.h>

int main(){
    char texto[100];
    printf("Introduce el texto: \n");
    fgets(texto,sizeof(texto),stdin);/**obtenemos **/

    char repetidas[100];
    int cont = 0;

    for(int i = 0 ;i < strlen(texto);i++){

        if(strchr(repetidas, texto[i]) == NULL){
            repetidas[cont] = texto[i];
            cont++;
        }
        else{
            printf("Deja Vu");
            return;
        }
    }
    printf("Unique");
}
