#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    char flag1[] = "T$", flag2[] = "$T";
    char floor[200];
    char str[10];

    char money = '$';
    char thief = 'T';
    char guard = 'G';
    scanf("%s", &floor);

    int j = 0;

    for (int i = 0; i < strlen(floor); i++) {
        if (floor[i] == thief || floor[i] == money || floor[i] == guard) {
            str[j] = floor[i];
            j++;
        }
    }

    if (strstr(str, flag1) != NULL || strstr(str, flag2) != NULL)
        printf("ALARM\n");

    else printf("quiet\n");

    return 0;
}
