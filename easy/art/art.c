#include <stdio.h>
#include <math.h>

void main() {

    double cost = 40;

    int n_colors;

    printf("Introduce el número de pinturas:");
    scanf("%d",&n_colors);

    cost += n_colors*5;
    cost += cost/10;

    printf("%d",(int)ceil(cost));
}
