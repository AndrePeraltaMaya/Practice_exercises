#include <iostream>


int main(){

    std::string link;

    std::cout << "Introduce el link de youtube: ";
    std::cin >>link;
    std::string link_recorted;

    if(link.substr(0,17) == "https://youtu.be/"){
        std::cout << link.substr(17,-1);
        return 0;
    }else{
        std::cout << link.substr(32,-1);
    }
}
