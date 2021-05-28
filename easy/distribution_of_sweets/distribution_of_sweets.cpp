#include <iostream>

using namespace std;

int main(){

    int siblings,popsicles;
    cout << "Introduce el número de hermanos y de dulces:";
    cin >> siblings >> popsicles;

    if(popsicles%siblings == 0) cout << "give away";
    else{
        cout << "eat them yourself";
    }

}
