#include <iostream>

using namespace std;

int main(){

    string word;

    cout << "Introduce el string:" << "\n";
    cin >> word;

    string lista[word.length()];


    for(int i = 0;i<word.length();i++){

        cout << word[word.length()-i-1];
    }

	return 0;
}
