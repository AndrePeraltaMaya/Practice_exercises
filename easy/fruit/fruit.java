package ejercicios;

import java.util.Scanner;

/**
 *06/05/2021
 * @author Andre Peralta
 */
public class metodo {
    public static void main(String[] args) {
        System.out.println("Number of fruits :");
        Scanner scan = new Scanner(System.in);
        
        int fruit = scan.nextInt();
        
        int bananas = fruit/2;
        
        int cakes = (bananas-bananas%3)/3;
        
        System.out.println(cakes);

   }
}
