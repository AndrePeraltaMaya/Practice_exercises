#include <stdio.h>

void main(){

    int points;
    printf("Introduzca el número de puntos: ");
    scanf("%d", &points);

    int cost;
    printf("Introduzca el costo del producto: ");
    scanf("%d", &cost);

    if((points/12) < cost){

        printf("%s","Try again");
    }
    else{
        printf("%s","Buy it!");
    }

}
