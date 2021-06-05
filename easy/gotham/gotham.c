#include <stdio.h>
#include <math.h>

void main() {

    int criminals;

    printf("Introduce el número de criminales: ");
    scanf("%d",&criminals);
    
    if(criminals < 5) printf("I got this!");
    else if(criminals >= 5 && criminals < 10)printf("Help me Batman");
    else if(criminals > 10) printf("Good Luck out there!");
}
