/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenodd;

import java.util.Scanner;

/**
 *
 * @author Vagos
 */
public class EvenOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int a = input.nextInt();
        System.out.println("Please enter a 2nd integer");
        int b = input.nextInt();
        System.out.println("Please enter a 3rd integer");
        int c = input.nextInt();
        System.out.println("Please enter a 4th integer");
        int d = input.nextInt();
// allos tropos declare four variables  int num1 , num2, num3, num4;
        int abMin = Math.min(a, b);
        int cdMin = Math.min(c, d);
        int min = Math.min(abMin, cdMin);
        System.out.println("The smallest number is " + min);

        int abMax = Math.max(a, b);
        int cdMax = Math.max(c, d);
        int max = Math.max(abMax, cdMax);
        System.out.println("The largest number is " + max);

        int sum = a + b + c + d;
        System.out.println("The sum of all numbers is " + sum);

        if (sum % 2 == 0) {
            System.out.println("The number " + sum + " is even");
        } else {
            System.out.println("The number " + sum + " is odd");
        }
        
        double avg = sum / 4.0;
        System.out.println("The avarage value is " + avg);
        
    }

}
