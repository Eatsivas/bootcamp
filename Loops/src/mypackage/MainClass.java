
package mypackage;

import java.util.ArrayList;


public class MainClass {

   
    public static void main(String[] args) {        
//        ArrayList<String> days = new ArrayList();
//        System.out.println("Please choose day (1-7): ");        
//        days.add("Monday");
//        days.add("Tuesday");
//        days.add("Wednesday");
//        days.add("Thursday");
//        days.add("Friday");
//        days.add("Saturday");
//        days.add("Sunday");
        //for -enchanced
//        for(String day: days){ // prints everyday of the list
//            System.out.println(day);
//        }
        //for -traditional
//        for (int i = 0; i < days.size(); i++) {
//            System.out.println((i + 1) + ". " + days.get(i));
//     }
        
        int [] array = {4,2,6,10};
//        for (int num : array){
//            System.out.print(num + " ");
//        }  
        //use a for-traditional to print numbers of the array but not 4
        System.out.println("***Print all numbers except 4*****");
        for(int i=0; i<array.length; i++){
            if(array[i]==4){
                continue;               
            }
            System.out.print(array[i]+" "); 
            
        }

        //if array contains number 2 stop printing the array
          System.out.println("\n*****If 2 is found stop printing*****");
          for(int i=0; i<array.length; i++){
            if(array[i]==2){
                break;    }           
            
            System.out.print(array[i]+" "); 
          }
        
        System.out.println("\n********Using do....while loop**********");
        int i = 10;
        do{
            System.out.print(i+ " ");
            System.out.println("Entered loop");
            i+=2;
        }while(i<0);
        System.out.println("\ni= "+ i);
        System.out.println("Printing while loop");
        i=5;
        while(i<10){
            System.out.print(i+ " ");
            i++;
        }
    }
    
}
