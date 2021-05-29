#include <iostream>
#include <vector>
#include <sstream>
#include <cstdlib>

using namespace std;

int main(){

    string hora;

    cout << "Introduce la hora: ";
    getline(cin,hora);

    vector<string> partesHora{};

    /**Separamos la hora por el caracter : **/
    stringstream sstream(hora);
    string word;
    while (getline(sstream, word, ':')){
        partesHora.push_back(word);
    }

    string horario = hora.substr(hora.length()-2,-1);
    string var = partesHora[1];
    partesHora[1] = var.substr(0,2);



    if(horario == "PM"){
        if(partesHora[0] != "12"){
            cout<< atoi(partesHora[0].c_str()) +12 << ":" << partesHora[1];
        }
        else{
            cout<< partesHora[0] << ":" << partesHora[1];
        }
    }else{
        if(atoi(partesHora[0].c_str()) < 10 ){
            cout<< '0' << partesHora[0] << ":" << partesHora[1];
        }
        else{
            cout<< partesHora[0] << ":" << partesHora[1];
        }
    }
}
