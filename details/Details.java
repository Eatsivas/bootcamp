/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package details;

import java.util.Scanner;






/**
 *
 * @author Vagos
 */
public class Details {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        Scanner input = new Scanner(System.in);//need to be created only once
//        String onoma = input.next();
//        System.out.println(onoma);
        
        System.out.println("What is your name?");
        String name = input.next();
        System.out.println("What year were you born?");
        int yearOfBirth= input.nextInt();
        System.out.println("What is the current year?");
        int yearNow = input.nextInt();
        int age = yearNow - yearOfBirth;
        System.out.println("Your name is "+ name + " and your age is " +age + "!");
        
        
        
        
        
        
        
    }
    
}
