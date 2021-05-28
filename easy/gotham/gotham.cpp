#include <iostream>

using namespace std;

int main(){

    int criminals;

    cout << "Introduce el número de criminales: ";
    cin >> criminals;
    
    if(criminals < 5) cout << "I got this!";
    if(criminals >= 5 && criminals < 10) cout << "Help me Batman";
    if(criminals > 10) cout << "Good Luck out there!";

}
