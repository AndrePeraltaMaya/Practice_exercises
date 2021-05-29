#include <iostream>
#include <algorithm>

int main(){

    std::string name;
    std::string names[5];
    int agents;

    std::cout << "Introduce mi nombre : " ;
    std::cin >>  name;

    std::cout << "Introduce el número de agentes : ";
    std::cin >> agents;

    for(int i = 1;i< 5;i++){
        std::cin >> names[i];
    }

    names[0] = name;
    sort(begin(names), end(names)); /**Ordenamos el vector**/

    int pos_fila = 1;/**posicion minima en la que podemos encontrarnos**/
    int time = 20;
    
    for (const auto &str : names) {/**Encontrar nuestra posición en la fila**/
            if(str == name){
                break;
            }
            pos_fila++;
            if (pos_fila%agents == 0){
                time += 20;
            }
    }
    std::cout << time;
}
