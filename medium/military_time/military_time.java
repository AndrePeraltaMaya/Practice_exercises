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
        String hour = input.nextLine();
        String [] hour_list = hour.split(" ");
        String hours = hour_list[0];
        String time = hour_list[1];
        String [] hour_minutes = hours.split(":");
        int uu = 0;

        if(time.equals("PM")) {
            uu = Integer.valueOf(hour_minutes[0]);
            uu = uu + 12;
            System.out.println(String.valueOf(uu)+":"+hour_minutes[1]);
        }
        else if (Integer.valueOf(hour_minutes[0])<10){
            System.out.println("0"+hour_minutes[0]+":"+hour_minutes[1]);
        }
        else System.out.println(hours);

    }
}
