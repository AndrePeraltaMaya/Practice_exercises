package ejercicios;

import java.util.Scanner;

/**
 *06/05/2021
 * @author Andre Peralta
 */
public class metodo {
    public static void main(String[] args) {
        System.out.println("Number of houses :");
        Scanner lector = new Scanner(System.in);
        double houses = lector.nextInt();
        
        //Lo redondeamos hacía arriba
        double percentage = Math.ceil((2*100)/houses); 
        System.out.println((int) percentage); //Pasamos de double a int       

   }
}
