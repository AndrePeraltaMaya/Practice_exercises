#include <stdio.h>
#include <string.h>

int main(){
    char texto[100];
    printf("Introduce el texto: \n");
    fgets(texto,sizeof(texto),stdin);/**obtenemos **/

    char delimitador[] = " "; /**Delimitamos los separadores**/

    char *token = strtok(texto, delimitador);

    if(token != NULL){
        while(token != NULL){

            token++;
            printf("%s",token);
            token--;
            printf("%c%s",token[0],"ay ");

            token = strtok(NULL, delimitador);
        }
    }
}
