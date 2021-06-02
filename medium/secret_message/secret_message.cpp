#include <iostream>
#include <ctype.h>

using std::cout;
using std::cin;
using std::string;

int main(){
    string text;

    cout << "Introduce el texto: ";
    getline(cin, text);
    string textReverse[text.length()];

    for(const &i : text){
        if((i >= 65 && i <= 90)){
           int diferencia = 90-(i-65);
           printf("%c",diferencia);
        }
        if((i >= 97 && i <= 122)){
             int diferencia = 122-(i-97)-32;
             printf("%c",diferencia);
        }
        if( i == 32){
            printf("%c",32);
        }
    }
}
