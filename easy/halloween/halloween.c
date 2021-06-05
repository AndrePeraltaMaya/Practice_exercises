#include <stdio.h>
#include <math.h>

void main() {

    int houses;
    printf("Introduce el número de casas : ");
    scanf("%d", &houses);

    printf("%d",(int)ceil(200.0/houses));

}
