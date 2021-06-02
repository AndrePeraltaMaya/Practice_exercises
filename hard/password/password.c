#include <stdio.h>
#include <string.h>

int main(){

    char password[40];

    int n_numbers = 0;
    int n_characters = 0;

    puts("Introduce la contrasena: ");
    scanf("%s",password);

    if(strlen(password) < 7){
        printf("Weak");
        return 0;
    }

    for(int i = 0; i < strlen(password);i++){

        if((password[i] >= 33 && password[i] <= 38) || password[i] == 42 || password[i] == 64 )
            n_characters++;
        else if(password[i] >= 48 && password[i] <= 57)
            n_numbers++;
        if(n_numbers >= 2 && n_characters >= 2 )
            break;
    }

    if(n_numbers >= 2 && n_characters >= 2 ){
        printf("Strong");
    }
    else{
        printf("Weak");
    }

	return 0;
}
