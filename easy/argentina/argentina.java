package ejercicios;

import java.util.Scanner;

/**
 *06/05/2021
 * @author Andre Peralta
 */
public class metodo {
    public static void main(String[] args) { 

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Number of pesos : ");
        int pesos = scan.nextInt();

        System.out.println("Number of dollars : ");
        int dollars = scan.nextInt();
        
        double pesos_dollar = pesos/50 ;
        
        if(pesos_dollar > dollars){
            System.out.println("Dollars");
        }
        else{
            System.out.println("Pesos");
        }
   }
}
