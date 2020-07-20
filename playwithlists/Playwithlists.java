/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playwithlists;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vagos
 */
public class Playwithlists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many names do you want to insert?");
        int numberOfNames=input.nextInt();
        ArrayList<String> listOfNames= new ArrayList();
        
        //String[] arrayNames = {"John", "Mary', "Andy"};  
        //Create an array with "numberOfNames' spaces and empty values
        String[] arrayOfNames = new String[numberOfNames];
        System.out.println(arrayOfNames[0]);
        System.out.print("Please enter 1st name: ");
        String name = input.next();
        arrayOfNames[0]= name;
        listOfNames.add(name);
        
        System.out.print("Please enter 2nd name: ");
        name = input.next();
        arrayOfNames[1]=name;
        listOfNames.add(name);
        
        System.out.print("Please enter 3rd name: ");
        name = input.next();
        arrayOfNames[2]=name;
        listOfNames.add(name);
        
        System.out.println( "listOfNames: " +listOfNames);
        System.out.println("arrayOfNames: " +arrayOfNames);
        
        boolean areEqual = arrayOfNames[2] == listOfNames.get(2); // h me if 
        System.out.println("Are equal : " +areEqual);
        
        System.out.println("Please enter one more name: ");
        name = input.next();
        listOfNames.add(2, name);
        
        areEqual = arrayOfNames[2] == listOfNames.get(2);  
        System.out.println("Are equal : " +areEqual);
        System.out.println(listOfNames);
        
        System.out.println("-------------------------");
        System.out.println("Now we need 2 numbers between 0 and " + (arrayOfNames.length -1) ); //θελει () στην πραξη για να μην την δει string
        System.out.print("Enter 1st number :");
        int number1 = input.nextInt();
        System.out.print("Enter 2nd number :");
        int number2 = input.nextInt();
        ArrayList<String> listOfNames2 = new ArrayList();
        name = arrayOfNames[number1];
        listOfNames2.add(name);
        name = arrayOfNames[number2];
        listOfNames2.add(name);
        
        System.out.println("listOfNames2 : " + listOfNames2);
        
        listOfNames.removeAll(listOfNames2);
        System.out.println(listOfNames);
    }
    
}
