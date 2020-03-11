package checkage;

import java.util.Scanner;

/**@author emergon */
public class CheckAge {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;//declaration
        String question = "Hello, what is your name?";
        System.out.println(question);
        name = input.next();//initialization
        question = "Ok " + name + " how old are you?";
        System.out.println(question);
        
        int age = input.nextInt();
        
        if(age<=0){//we need a condition
            System.out.println("Not valid age");
        }else if(age <= 12){//we need a condition
            System.out.println("You are a kid");
        }else if(age <= 18){
            System.out.println("You are a teenager");
        }else if(age <= 119){
            System.out.println("You are an adult");
        }else{//we don't need a condition. Covers all the rest
            System.out.println("Not serious");
        }
        
        //if only
        //if - else
        //if - else if....
        //if - else if....- else
        
    }

}
