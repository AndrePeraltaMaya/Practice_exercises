package ejercicios;

import java.util.Scanner;

/**
 *07/05/2021
 * @author Andre Peralta
 */
public class metodo {
    public static void main(String[] args) {

        System.out.println("Url : ");
        Scanner input = new Scanner(System.in);
        
        String url = input.nextLine();
        
        if(url.indexOf("watch?v=") != -1){
            
            System.out.println(url.substring(url.indexOf("watch?v=")+8,url.length()));
            
        }else if(url.indexOf(".be/") != -1){
            
            System.out.println(url.substring(url.indexOf(".be/")+4,url.length()));

        }
    }
}
