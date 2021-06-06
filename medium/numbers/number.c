#include <stdio.h>
#include <string.h>

void main(){
    char text[100];
    fgets(text,100,stdin);

    char numbers[10][6] = {"zero","one","two","three","four","five","six","seven","eight","nine"};


    for(int i = 0;i < strlen(text) ;i++){
        if(text[i] >= 48 && text[i] <= 57 ){
            if (text[i] == 49 && text[i+1] == 48){
                printf("%s", "ten");
                i++;
            }
            else  printf("%s", numbers[(int)text[i] - 48 ]);

        }
        else printf("%c",text[i]);
    }
}
