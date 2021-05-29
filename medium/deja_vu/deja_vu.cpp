#include <iostream>
#include <vector>
#include <algorithm>

using std::cout;
using std::cin;
using std::string;
using std::vector;

int main(){

    string text;

    cout << "Introduce el texto: ";
    cin >> text;

    vector<string> letters_list(text.length());

    for(int cont = 0;cont < text.length() ;cont++){
        letters_list[cont] = text[cont];
    }

    sort(letters_list.begin(), letters_list.end());


    for(int cont = 0;cont+1 < text.length() ;cont++){
        if(letters_list[cont] == letters_list[cont+1]){
            cout << "Deja vu" ;
            return 0;
        }
    }
    cout << "Unique" ;
}
