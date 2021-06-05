#include <stdio.h>
#include <string.h>
int main() {
    char link[100];
    scanf("%s",link);
    if( strlen(link) > 30 ){
        for(int i = 28; i < strlen(link);i++){
            printf("%c",link[i]);
        }
    }else{
        for(int i = 17; i < strlen(link);i++){
            printf("%c",link[i]);
        }
    }
    return 0;
}
