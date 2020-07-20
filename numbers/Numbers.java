/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

import java.util.Scanner;

/**
 *
 * @author Vagos
 */
public class Numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        int number = 0;
        for(int i = 1; i<=num; i++){
            number = number*10 + i;
            System.out.println(number + " ");
        }
            
            
    }
    
}
