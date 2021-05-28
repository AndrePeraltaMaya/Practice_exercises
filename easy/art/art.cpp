#include <iostream>
#include <math.h>

using namespace std;

int main(){

    double cost = 40;

    int n_colors;

    cout << "Introduce el número de pinturas:";
    cin >> n_colors;

    cost += n_colors*5;
    cost += cost/10;

    cout << ceil(cost);
}
