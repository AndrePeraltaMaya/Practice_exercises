#include <stdio.h>
#include <string.h>
#define elif else if

int main ()
{
    char us[25]={};
    scanf("%[^\n]",us); getchar ();

    int d, m, y;
    if (us[1]=='/' || us[2]=='/')
    {
        sscanf (us, "%d/%d/%d", &m, &d, &y);
    }
    else
    {
        char month[20]={};
        sscanf (us, "%s %d, %d", month, &d, &y);

        if (strcmp (month, "January")==0) m=1;
        elif (strcmp (month, "February")==0) m=2;
        elif (strcmp (month, "March")==0) m=3;
        elif (strcmp (month, "April")==0) m=4;
        elif (strcmp (month, "May")==0) m=5;
        elif (strcmp (month, "June")==0) m=6;
        elif (strcmp (month, "July")==0) m=7;
        elif (strcmp (month, "August")==0) m=8;
        elif (strcmp (month, "September")==0) m=9;
        elif (strcmp (month, "October")==0) m=10;
        elif (strcmp (month, "November")==0) m=11;
        elif (strcmp (month, "December")==0) m=12;
    }
    printf ("%d/%d/%d", d, m, y);

    return 0;
}
