#include <iostream>
#include <stdlib.h>

using namespace std;

int main() {
    
    string password;
    int character1;
    int character2;
    int n_nums;
    
    cin >> password;
    
    if (password.length() < 7){
        cout<< "Weak";
        return 0;
    }
    
    for(int i = 0;i < password.length();i++){
        
        if(isdigit(password [i])!=0){
            n_nums++;
        }
            
    }
    character1=password.find_first_of("!@#$%&*");
    character2=password.find_last_of("!@#$%&*");

    if(character1 != character2 && n_nums >= 2 ){
        cout << "Strong";
    }
    else{
        cout<< "Weak";
    }
    return 0;
}
