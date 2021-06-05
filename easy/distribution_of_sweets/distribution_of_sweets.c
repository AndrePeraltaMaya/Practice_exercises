#include <stdio.h>
#include <math.h>

void main() {

    int siblings,popsicles;
    printf("Introduce el número de hermanos y de dulces: ");
    scanf("%d%d",&siblings,&popsicles);

    if(popsicles%siblings == 0) printf("give away");
    else printf("eat them yourself");
}
