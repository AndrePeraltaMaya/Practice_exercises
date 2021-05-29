#include <iostream>
#include <map>

using std::cout;
using std::cin;
using std::string;
using std::map;

int main(){
    string text;

    cout << "Introduce el texto: ";
    getline(cin, text);

    std::map<char, string> numeros = {{'1', "one",},
                        {'2', "two",},
                        {'3', "three",},
                        {'4', "four",},
                        {'5', "five",},
                        {'6', "six",},
                        {'7', "seven",},
                        {'8', "eight",},
                        {'9', "nine",}};

    for(int i = 0 ;i < text.length();i++){

        if(text[i] == '1' && text[i+1] == '0'){
            cout << "ten";
            i++;

        }
        else if(numeros[text[i]] != ""){

            cout << numeros[text[i]];
        }else{
            cout << text[i];
        }
    }
}
