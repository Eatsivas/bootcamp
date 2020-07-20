/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetime;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Vagos
 */
public class DateTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US); //Για να δεχεται τελεια στο δεκαδικο 
        System.out.println("How old are you?");
        int age = input.nextInt();
        boolean yourAge = age > 25 && age < 45;
        System.out.println("What is your income?");
        int income = input.nextInt();
        boolean yourIncome = income > 15000;
        System.out.println("How cute are you from 0 to 10 ?");
        double cute = input.nextDouble();
        boolean yourCute = cute > 8.3;
        boolean permission = yourAge && (yourIncome || yourCute);

        //System.out.println("Can you date my daughter?" );
        //System.out.println(permission);
        // Αν καλύπτεις τις προυποθέσεις μπορείς να βγεις βόλτα με το παιδί μου
        if (permission == true) {
            System.out.println("Ok you can take out my child");
        }
        else{
            System.out.println("You cannot take out my child");
            if (age > 45) {
                System.out.println("You are too old!");
            }
            if (age < 25) {
                System.out.println("You are too young!");
            }
            if (yourAge==true && yourIncome == false) {
                System.out.println("You are poor!");
            }
            if (yourAge==true && yourCute == false) {
                System.out.println("You are ugly!");
            }
        }

    }

}
