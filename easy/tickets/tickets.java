package ejercicios;

import java.util.Scanner;

/**
 *06/05/2021
 * @author Andre Peralta
 */
public class metodo {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Introduce el puntaje");
        int points = lector.nextInt();
        
        System.out.println("Introduce el precio de la pistola");
        int price = lector.nextInt();
        
        if(points/12 >= price){
            System.out.println("Buy it");
        }else{
            System.out.println("Try again");
        }
        
    }
    
}
