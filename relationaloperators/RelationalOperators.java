/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationaloperators;

import java.util.Scanner;

/**
 *
 * @author Vagos
 */
public class RelationalOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int a = input.nextInt();
        System.out.println("Enter a second number:");
        int b = input.nextInt();
        
        boolean result;
        result = a<b;
        System.out.println("The result of " +a + " < " + b +" is " + result);
        result = a>b;
        System.out.println("The result of " +a + " > " + b +" is " + result);
        result = a>=b;
        System.out.println("The result of " +a + " >= " + b +" is " + result);
        result = a<=b;
        System.out.println("The result of " +a + " <= " + b +" is " + result);
        result= a==b;
        System.out.println("The result of " +a + " = " + b +" is " + result);
        result = a!=b;
        System.out.println("The result of " +a + " != " + b +" is " + result);
        
        
        
        
        //boolean result = 10 < 20;
//        System.out.println("The result of 10 < 20 is " + result);
//        result = 12 < 20;
//        System.out.println("The result of 12 < 20 is " +result);
//        result = 12 > 20;
//        System.out.println("The result of 12 > 20 is " +result);
//        result = 12 <= 20;
//        System.out.println("The result of 12 <= 20 is " +result);
//        result = 12 >= 20;
//        System.out.println("The result of 12 >= 20 is " +result);
//        result = 12 == 20;
//        System.out.println("The result of 12 = 20 is " +result);
//        result = 12 != 20;
//        System.out.println("The result of 12 != 20 is " +result);
    }
    
}
