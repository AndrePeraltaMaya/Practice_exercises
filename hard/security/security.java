package ejercicios;

import java.util.Scanner;

/**
 *07/05/2021
 * @author Andre Peralta
 */
public class metodo {
    public static void main(String[] args) { 

        Scanner input = new Scanner(System.in);
        
        System.out.println("Floor : ");
        String floor = input.next();

        int money_pos = floor.indexOf("$");
	int thief_pos = floor.indexOf("T");

	if((money_pos - thief_pos) < 0){
		floor = floor.substring(money_pos,thief_pos+1); //[::-1]
		if(floor.indexOf('G') == -1){
                
                    System.out.println("ALARM");
                }
                else{
                    System.out.println("quiet");
                }

        }else{
		floor = floor.substring(thief_pos,money_pos+1);
		if(floor.indexOf('G') == -1){
                    
			System.out.println("ALARM");
                } 
                else{
			System.out.println("quiet");
                  }
        }
    }
}
