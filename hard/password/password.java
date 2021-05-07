package ejercicios;

import java.util.Scanner;

/**
 *07/05/2021
 * @author Andre Peralta
 */
public class metodo {
    public static void main(String[] args) { 

        Scanner input = new Scanner(System.in);
        
        System.out.println("Password : ");
        String password = input.next();
        
        String[] characters = {"!", "@", "#", "$", "%", "&", "*"};

        int cont_num = 0;
        int num_characters = 0;
        

        for (int i = 0; i < password.length(); i++) {
            if(Character.isDigit(password.charAt(i))){
                cont_num += 1;
            }
            if(cont_num == 2){
                break;
            }
        }
        for(String  t: characters){ 
            if(password.contains(t)){
                num_characters += 1;
            }
            if(num_characters == 2){
                break;
            }
        }
      
        if(cont_num == 2 && num_characters == 2 && password.length() >= 7){
            System.out.println("Strong");
        }
        else{
            System.out.println("Weak");
        }

   }
}
