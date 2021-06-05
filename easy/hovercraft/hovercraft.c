#include <stdio.h>

int main(){

    int initialCost = 2000000*10;
    int sales;

    printf("Número de aerodeslizadores: ");
    scanf("%d",&sales);

    sales *= 3000000;
    sales -= 1000000;

    if(sales > initialCost) printf("Profit");
    else if(sales < initialCost) printf("Loss");
    else if(sales == initialCost) printf("Broke Even");
    return 0;
}
