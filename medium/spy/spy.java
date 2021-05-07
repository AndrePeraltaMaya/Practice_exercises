package ejercicios;

import java.util.Scanner;

/**
 *07/05/2021
 * @author Andre Peralta
 */
public class metodo {
    public static void main(String[] args) {

        System.out.println("Code  ");
        Scanner input = new Scanner(System.in);
        
        String code = input.nextLine();
        
        String code_clean = "";
        
        for (int i = 0; i < code.length(); i++) {
            
            if(Character.isLetter(code.charAt(i)) || code.charAt(i) == ' '){
                code_clean =  code.charAt(i) + code_clean ;
            }
        }
        
        System.out.println(code_clean);
    }
}
