package ejercicios;

import java.util.Scanner;

/**
 *06/05/2021
 * @author Andre Peralta
 */
public class metodo {
    public static void main(String[] args) { 

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Number of yards : ");
        int yards = scan.nextInt();
        
        if(yards > 10){
            System.out.println("High Five");
        }
        else if(yards<1){
            System.out.println("shh");
        }
        else{
            
            for (int i = 0; i < yards; i++) {
                
                System.out.print("Ra!");
            }      
        }
   }
}
