/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumbers;

import java.util.Random;

/**
 *
 * @author Vagos
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int myNumber = random.nextInt(10);
        System.out.println("My Number: " + myNumber);
        int result = getRandomNumberBetween(5, 10);
        System.out.println(result);

    }

    static int getRandomNumberBetween(int a, int b) {
        Random random = new Random();
        if (a > b) {
            int swap = a;
            a=b;
            b= swap;
           
        }
        int euros = b - a;
        int result = a + random.nextInt(euros + 1);
        return result;
    }

}
