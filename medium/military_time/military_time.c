#include <stdio.h>
#include <string.h>
int main(){
    char texto[10];
    fgets(texto,10,stdin);
    char periodo[3] = {texto[strlen(texto)-2],texto[strlen(texto)-1]};
    char minutos[3] = {texto[strlen(texto)-5],texto[strlen(texto)-4]};
    char token[] = ":" ;
    char *horas = strtok(texto,token);
    if(periodo[0] == 'A'){
        if (strlen(horas) < 2 )
            printf("0%s:%s",horas,minutos);
        else
            printf("%s:%s",horas,minutos);
    }else if (periodo[0] == 'P'){
        if(horas != "12"){
            printf("%d:%s",atoi(horas)+12,minutos);}
        else
            printf("%s:%s",horas,minutos);
    }

}
