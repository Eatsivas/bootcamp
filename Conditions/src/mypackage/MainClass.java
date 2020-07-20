package mypackage;

public class MainClass {

    public static void main(String[] args) {
  
        int numberOfDay =12;
//        if(numberOfDay<=15){
//            System.out.println("First half of month");
//        }else{
//            System.out.println("Second half of month");
//        }
//        System.out.println("****Switch Statement******");
       
//        char bathmos = 'Z';
//        switch (bathmos) {
//            case 'A':
//                System.out.println("Excellent");
//                break;
//            case 'B':
//                System.out.println("Well Done");
//                break;
//            case 'C':
//                System.out.println("Very Good");
//                break;
//            case 'D':
//                System.out.println("Good");
//                break;
//            case 'E':
//                System.out.println("Pass");
//                break;
//            case 'F':
//                System.out.println("Fail");
//                break;
//            default:
//                break;
//        }
//        
//        switch(bathmos){
//            case 'A':
//                System.out.println("Excellent");
//                break;
//            case 'B':
//                System.out.println("Well Done");
//                break;
//            case 'C':
//                System.out.println("Very Good");
//                break;
//            case 'D':
//                System.out.println("Good");
//                break;
//            case 'E':
//                System.out.println("Pass");
//                break;
//            case 'F':
//                System.out.println("Failed");
//                break;
//            default:
//                System.out.println("Invalid");
//                break;
//        }
//        final int a = 40;
       
      
         //Ternary operation
        
//        String message;
//        if(numberOfDay<=15){           
//            message="First half of month";
//           System.out.println(message);
//        }else{
//            message="Seconf half of month";
//            System.out.println(message);               
//        }
        
        
        
        String message = (numberOfDay<=15)?"First half of month":"Second half of month";
        System.out.println(message);
//        
        
    }
    
    

}
