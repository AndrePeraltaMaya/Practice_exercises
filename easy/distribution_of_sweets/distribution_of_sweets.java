package ejercicios;

import java.util.Scanner;

/**
 *06/05/2021
 * @author Andre Peralta
 */
public class metodo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Siblings : ");
        int siblings = scan.nextInt();
        
        System.out.println("Popsicles ");
        int popsicles = scan.nextInt();
        
        if(popsicles%siblings == 0){
            System.out.println("give away");
        }
        else{
            System.out.println("eat them yourself");
        }
   }
}
