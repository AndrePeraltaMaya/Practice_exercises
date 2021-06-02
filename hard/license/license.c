#include <stdio.h>
#include <string.h>

int main(){

    char my_name[15];

    puts("Introduce tu nombre: \n");
    scanf("%s",my_name);

    int n_agents;

    puts("El número de agentes: \n");
    scanf("%d",&n_agents);

    char names[6][20];

    puts("Introduce los nombres: \n");
    for(int i=0;i<4;i++)
        scanf("%s",&names[i][0]);

    int count = 0;

    for(int i = 0 ; i<4 ; i++){
        if(my_name[0]>names[i][0])
            count++;
        if(my_name[0]==names[i][0]){
            if(my_name[1]>names[i][1])
                count++;
        }
    }

    if(n_agents ==1)
        printf("%d",20*(count+1));
    else if( n_agents >= 2 && n_agents < strlen(names) )
        printf("%d",20*(count/n_agents)+20);
    else if( n_agents >= strlen(names) )
        printf("20");
    return 0;
}


