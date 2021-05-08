package ejercicios;

import java.util.Scanner;

/**
 *06/05/2021
 * @author Andre Peralta
 */
public class metodo {
    public static void main(String[] args) {
        System.out.println("Number of enemys :");
        Scanner scan = new Scanner(System.in);
        
        int enemys = scan.nextInt();
        
	if(enemys < 5 ){
            System.out.println("I got this!");
        }
        else if(enemys >= 5 && enemys <= 10){
            System.out.println("Help me Batman");
        }
        else if(enemys > 10){
            System.out.println("Good Luck out there!");
        }
   }
}
