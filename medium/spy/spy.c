#include <stdio.h>
#include <string.h>

int main(){
    char textReverse[100];
    fgets(textReverse,100,stdin);

    char text[100];

    for(int i = strlen(textReverse)-1,j = 0 ; i >= 0 ; i--,j++){
        text[j] = textReverse[i];
    }

    for(int i = 0 ; i < strlen(text) ; i++){

        if((text[i] >= 65 && text[i] <= 90) || (text[i] >= 97 && text[i] <= 122) || text[i] == 32 ){
           printf("%c",text[i]);
        }
    }

    return 0;
}
