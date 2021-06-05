#include <stdio.h>

void main() {

    int pesos,dollars;

    printf("Introduce los pesos y los dolares:");
    scanf("%d%d",&pesos,&dollars);

    if(pesos/50 > dollars) printf("Dollars");
    else printf("Pesos");

}
