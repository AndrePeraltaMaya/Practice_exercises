package ejercicios;

import java.util.Scanner;

/**
 *06/05/2021
 * @author Andre Peralta
 */
public class metodo {
    public static void main(String[] args) { 

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Number of colors : ");
        int colors = scan.nextInt();
        
        double cost = (40 + colors*5);
        
        cost += cost/10;
        
        cost = Math.ceil(cost);
        
        System.out.println((int)cost);
   }
}
