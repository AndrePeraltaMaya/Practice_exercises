package ejercicios;

import java.util.Scanner;

/**
 *06/05/2021
 * @author Andre Peralta
 */
public class metodo {
    public static void main(String[] args) {
        System.out.println("Number of hovercrafts :");
        Scanner lector = new Scanner(System.in);
        int sales = lector.nextInt();
        
        int cost = 10*2000000;
	sales = sales*3000000;
	int insurance = 1000000;

	int final_cost = sales - cost - insurance;


	if(final_cost > 0){
            System.out.println("Profit");
        }             
	else if(final_cost < 0){
            System.out.println("Loss");
        }
	else if(final_cost == 0){
            System.out.println("Broke Even");
        }
            
    }
    
}
