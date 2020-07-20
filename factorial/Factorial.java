/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author Vagos
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 4! = 1*2*3*4
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int n = input.nextInt();
        int result = getFactorialRecursive(n);
        System.out.println(result);
    }

    static int getFactorial(int number) {

        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
    static int getFactorialRecursive(int number){
        if(number == 0){
            return 1;
        }else{
            return number * getFactorialRecursive(number-1);
        }
       
    }
}
