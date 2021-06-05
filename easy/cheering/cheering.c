#include <stdio.h>
#include <math.h>

void main() {

    int yards;

    scanf("%d",&yards);

    if(yards > 10) printf("High Five");

    else if(yards < 1 )printf("shh");
    else{
        while(yards >0){
            printf("Ra!");
            yards--;
        }
    }
}
