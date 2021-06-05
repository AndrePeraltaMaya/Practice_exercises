#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){

    char text[100];
    printf("Introduzca el texto: ");
    scanf("%s", text);

    for(int i = strlen(text)-1 ; i >= 0  ;i--){
        printf("%c",text[i]);
    }
}
