package mypackage;

public class MainClass {

    public static void main(String[] args) {
        
        double number = 3.45;
        double ceil = Math.ceil(number);
        double floor = Math.floor(number);
        long round = Math.round(number);
        double abs = Math.abs(number);
        System.out.println("Ceil: " +ceil);
        System.out.println("Floor " +floor);
        System.out.println("Round " +round);
        System.out.println("Abs " +abs);
        
        number = -3.14;
        ceil = Math.ceil(number);
        floor = Math.floor(number);
        round = Math.round(number);
        abs = Math.abs(number);
         System.out.println("Ceil: " +ceil);
        System.out.println("Floor " +floor);
        System.out.println("Round " +round);
        System.out.println("Abs " +abs);
                
                
    }

}
