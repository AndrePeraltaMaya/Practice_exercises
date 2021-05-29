#include <iostream>

using std::cout;
using std::cin;
using std::string;

int main(){
    string text;

    cout << "Introduce el texto: ";
    getline(cin, text);
    string textReverse[text.length()];

    int j = 0;
    for(const char i : text){
        if((i >= 65 && i <= 90) || (i >= 97 && i <= 122) || i == 32 ){
            textReverse[j] = i;
        }
        j++;
    }
    for(int i = (text.length()-1) ; i >= 0 ;i--){
        cout << textReverse[i];
    }
}
