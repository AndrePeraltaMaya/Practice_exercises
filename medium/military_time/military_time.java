package ejercicios;
import java.util.Scanner;
/**
 *07/05/2021
 * @author Andre Peralta
 */
public class metodo {
   public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hour :");
        String s = input.nextLine();
        String [] y = s.split(" ");
        String xx = y[0];
        String xx1 = y[1];
        String [] t = xx.split(":");
        int uu = 0;

        if(xx1.equals("PM")) {
            uu = Integer.valueOf(t[0]);
            uu = uu + 12;
            System.out.println(String.valueOf(uu)+":"+t[1]);
        }
        else if (Integer.valueOf(t[0])<10){
            System.out.println("0"+t[0]+":"+t[1]);
        }
        else System.out.println(xx);

    }
}
