#include <iostream>
#include <sstream>
#include <iterator>
#include <vector>
#include <algorithm>

using std::cout; using std::cin;
using std::endl; using std::string;
using std::vector; using std::istringstream;
using std::stringstream;

int main(){

    string text;
    cout << "Introduce los ruidos escuchados: " << "\n";
    getline(cin, text);/**Lee espacios también**/;

    vector<string> words{};

    stringstream sstream(text);
    string word;

    while (getline(sstream, word, ' ')){/**Seprar el string por un caracter**/
        word.erase(remove_if(word.begin(), word.end(), ispunct), word.end());
        words.push_back(word);
    }

    for (const auto &str : words) {

            if(str == "Grr")cout << "Lion ";
            else if(str == "Rawr")cout << "Tiger ";
            else if(str == "Ssss")cout << "Snake ";
            else if(str == "Chirp")cout << "Bird " ;
        }

    return 0;
}

