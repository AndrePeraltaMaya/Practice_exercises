package ejercicios;

import java.util.HashMap;
import java.util.Scanner;

/**
 *07/05/2021
 * @author Andre Peralta
 */
public class metodo {
    public static void main(String[] args) {

        System.out.println("Date  ");
        Scanner input = new Scanner(System.in);
        
        String date = input.nextLine();
        
        String day;        
        String month;
        String year;
        
        HashMap<String,String> months = new HashMap();
        
        months.put("January", "1");
	months.put("February", "2");
	months.put("March", "3");
	months.put("April", "4");
	months.put("May", "5");
	months.put("June", "6");
	months.put("July", "7");
	months.put("August", "8");
	months.put("September", "9");
	months.put("October", "10");
	months.put("November", "11");
        months.put("December","12");	
        
        if(date.indexOf("/") != -1){
            
            String[] date_list = date.split("/");
            
            System.out.println(date_list[1] + "/" + date_list[0] + "/" + date_list[2]);
            
        }else if(date.indexOf(",") != -1){
            
            String[] date_list = date.split(" ");

            date_list[0] = months.get(date_list[0]);

            System.out.println(date_list[1].substring(0,date_list[1].length()-1) + "/" + date_list[0] + "/" + date_list[2]);
            
        }
    }
}
