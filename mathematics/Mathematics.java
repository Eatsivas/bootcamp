/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathematics;

/**
 *
 * @author Vagos
 */
public class Mathematics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 30;
        int b = 20;
        int c = 10;
        //int firstMinimum = Math.min(a, b);
        //int finalMinimum= Math.min(firstMinimum, c);
        // allos tropos 
         int minimum = Math.min(a,b); // minimum = 20
         minimum = Math.min(minimum,c); //minimum = 10
        System.out.println("Minimum of numbers 10 ,20 and 30 is "+ minimum);
        
        
        
    }
    
}
