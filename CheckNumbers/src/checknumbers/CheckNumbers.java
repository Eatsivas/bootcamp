package checknumbers;

import java.util.Scanner;

/**@author emergon */
public class CheckNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, number3, number4;//declare 4 int variables
        int min12, max12, min34, max34, max, min;
        System.out.print("Enter number1:");
        number1 = input.nextInt();
        System.out.print("Enter number2:");
        number2 = input.nextInt();
        System.out.print("Enter number3:");
        number3 = input.nextInt();
        System.out.print("Enter number4:");
        number4 = input.nextInt();
        
        if(number1>number2){
            min12 = number2;
            max12 = number1;
        }else{
            min12 = number1;
            max12 = number2;
        }
        
        if(number3>number4){
            min34 = number4;
            max34 = number3;
        }else{
            min34 = number3;
            max34 = number4;
        }
        
        if(max12>=max34){
            max = max12;
        }else{
            max = max34;
        }
        System.out.println("Largest number is: "+max);
        
        ///same as min...
        
        
        int sum = number1 + number2 + number3 + number4;
        if(sum%2==0){
            System.out.println("The sum " + sum + " is even");
//            System.out.println("What a nice number");
        }else{
            System.out.println("The sum " + sum + " is odd");
        }
        //155 / 4
        double average = sum / 4.0;
        System.out.println("Average is:"+average);
        System.out.println("Program ends!");
    }

}
