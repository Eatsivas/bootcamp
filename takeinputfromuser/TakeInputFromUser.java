
package takeinputfromuser;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;



public class TakeInputFromUser {

  

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert number: ");
        String word ;
        int number =0;
        boolean flag = false;
//        String dateFromInput = input.next();
//        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate date = LocalDate.parse(dateFromInput, f);
        do{
        try{
            word= input.next();
            number = Integer.parseInt(word);
            flag =true;
        }catch(NumberFormatException e){
            System.out.println("Please insert number again: ");
        }
        }while(flag==false);
        
        System.out.println("number is"+number);
 }

}
