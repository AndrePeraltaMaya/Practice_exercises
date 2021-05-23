#include <iostream>
using namespace std;

int main() {
    string floor;
    cin >> floor;
    
    int posMoney;
    int posThief;
    
    for(int i = 0;i < floor.length();i++){
    
        if(floor[i] == '$'){
        
            posMoney = i;
            
        }
        else if(floor[i] == 'T'){
            posThief = i;
        }
        
    }
    
    if(posThief < posMoney ){
      for(int i = posThief;i < posMoney  ;i++){
            if(floor[i] == 'G'){
                cout << "quiet";
                return 0;
            }
                 
        }
        cout << "ALARM";
    }
    else{
    for(int i = posMoney ;i < posThief  ;i++){
            if(floor[i] == 'G'){
                cout << "quiet";
                return 0;
            }
                 
        }
        cout << "ALARM";
        
    }
    return 0;
}
