#include <stdio.h>
#include <math.h>

void main() {

    int fruits;

    printf("Introduce el número de frutas: ");
    scanf("%d",&fruits);

    int apples = fruits/2;

    int n_pies = apples/3;

    printf("%d",n_pies);
}
