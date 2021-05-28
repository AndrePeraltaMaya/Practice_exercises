#include <iostream>

using namespace std;

int main(){


    int pesos,dollars;

    cout << "Introduce los pesos y los dolares:";
    cin >> pesos >> dollars;

    if(pesos/50 > dollars) cout << "Dollars";
    else{
        cout << "Pesos";
    }
}
