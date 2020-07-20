/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertnumbers;

import java.util.Scanner;

/**
 *
 * @author Vagos
 */
public class InsertNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      
       int sum = 0;
       int counter = 0;
       while(sum<=100){
       System.out.print("Please add a number : ");
       int number = input.nextInt();
       sum +=number;
       counter++;
       }
       System.out.println("The sum of your numbers is >100 ");
       System.out.println("You' ve entered " + counter + " numbers !");
       
       
       
    }
    
}
