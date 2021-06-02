#include <stdio.h>
#include <string.h>

int main(){

    char text[100];

    fgets(text,100,stdin);
    for(int i = 0 ; i < strlen(text) ; i++){

        if((text[i] >= 65 && text[i] <= 90)){
           int diferencia = 90-(text[i]-65)+32;
           printf("%c",diferencia);
        }
        else if((text[i] >= 97 && text[i] <= 122)){
             int diferencia = 122-(text[i]-97);
             printf("%c",diferencia);
        }
        else if( text[i] == 32){
            printf("%c",32);
        }
    }
    return 0;
}
