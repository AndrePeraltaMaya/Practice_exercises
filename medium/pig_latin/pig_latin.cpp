#include <iostream>
#include <sstream>

using std::cout;
using std::cin;
using std::string;
using std::stringstream;

int main(){
    string text;

    cout << "Introduce el texto: ";
    getline(cin, text);

    stringstream textStream(text);
    string var;

    while (getline(textStream, var, ' ')){

        cout << var.substr(1,-1) << var[0] << "ay " ;
    }
}
