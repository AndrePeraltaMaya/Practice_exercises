#include <iostream>
#include <sstream>
#include <map>

using std::string;
using std::map;
using std::cout;
using std::stringstream;
using std::string;
using std::cin;

int main(){

    string date;

    cout << "Introduce la fecha a convertir: ";
    getline(cin, date);

    string arrayDate[3];
    stringstream dateStream(date);
    int i = 0;
    string var;


    if(date.length() > 10){

        map<string, string> months = {{"January", "1"},
        {"February", "2"},
        {"March", "3"},
        {"April", "4"},
        {"May", "5"},
        {"June", "6"},
        {"July", "7"},
        {"August", "8"},
        {"September", "9"},
        {"October", "10"},
        {"November", "11"},
        {"December", "12"}};

        while(getline(dateStream, var, ' ')){
            arrayDate[i] = var;
            i++;
        }
        stringstream array0(arrayDate[1]);
        getline(array0, arrayDate[1],',');

        cout << arrayDate[1]<< '/' << months[arrayDate[0]] << '/'<< arrayDate[2];

    }else{
        while(getline(dateStream, var, '/')){
            arrayDate[i] = var;
            i++;
        }
        std::cout << arrayDate[1] << '/' << arrayDate[0] << '/'<< arrayDate[2];
    }
}
