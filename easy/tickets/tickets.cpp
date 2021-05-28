#include <iostream>

using namespace std;

int main(){

    int points;
    int cost;

    cout << "Introduce el número de puntos ganados:" << "\n";
    cin >> points;

    cout << "Introduce el precio de la pistola de agua:" << "\n";
    cin >> cost;

    if(points/12 >= cost){
        cout << "Buy it!";
    }else{
        cout << "Try again";
    }

	return 0;
}
