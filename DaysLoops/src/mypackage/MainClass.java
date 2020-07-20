package mypackage;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> days = new ArrayList();
        System.out.println("Please choose day (1-7): ");        
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        for (int i = 0; i < days.size(); i++) {
            System.out.println((i + 1) + ". " + days.get(i));
        }
        
 //       int choice = input.nextInt();
//        while(choice<1 || choice>7){
//            System.out.print("Wrong number .Please choose (1-7)"); 
//            choice = input.nextInt();
//       }
         
//         while(!input.hasNextInt()){
//             System.out.println("Please enter a valid number!");
//             input.next();
//         }
//         int choice = input.nextInt(); 
//        System.out.println("choice: "+ choice);
        
               
        
        
        
        
    }

}
