#include <iostream>


using namespace std;

int main(){

    int initialCost = 2000000*10;
    int sales;

    cout << "Número de aerodeslizadores: ";
    cin >> sales;

    sales *= 3000000;
    sales -= 1000000;

    if(sales > initialCost) cout << "Profit";
    else if(sales < initialCost) cout << "Loss";
    else if(sales == initialCost) cout << "Broke Even";
    return 0;
}

