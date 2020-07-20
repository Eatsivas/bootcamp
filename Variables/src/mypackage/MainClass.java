
package mypackage;

import java.util.Scanner;


public class MainClass {
//        static String name;
//        static Scanner input = new Scanner(System.in);
//        static boolean staticBoolean;
        
        
    public static void main(String[] args) {
//        System.out.println("Name value before scanner : " + name);
//        System.out.println("Name value before " + staticBoolean );
//        System.out.println("Please enter name :");
//        name = input.next();
//        System.out.println(name);
//        printNameVariable();
        
        //akeraioi
        byte numByte = 127;
        short numShort = 30000;
        int numInt= 128;
        //numByte = (byte)numInt; // trust me i know what i'm doing.
        //numByte+=259;
        long numLong = 40L;
        //boolean : true - false
        boolean varBoolean = true;
        //dekadikoi
        float numFloat = 12.33231232314f;
        double numDouble = 15.8312415135;
        //symbola
        char symbolo = '\u00A9';
        System.out.println("numByte :" +numByte);
        System.out.println("numShort :" +numShort);
        System.out.println("numLong :" +numLong);
        System.out.println("varBoolean :" +varBoolean);
        System.out.println("numFloat :" +numFloat);
        System.out.println("numDouble :" +numDouble);
        System.out.println("symbolo :" +symbolo);
        
        //double value = Math.PI;
        //System.out.println(value);
        
      //  byte x = 1;
       // System.out.println(-x +  x++  -  --x + x );
         //               -1 +  1    -    1 + 1
       // byte y = 1;
       // System.out.println(-y +  y++  -  y + y );
        //                 -1 +  1    -  2 + 2
       // byte z = 1;
       // System.out.println(-z +  ++z  -  z + z );
        //                 -1  +  2   -  2 + 2
//        int w = ++x;
//        ////    1
//        System.out.println("w = " + w);
//        System.out.println("x = " + x);
        
         System.out.printf("Me, %s ,take : %f", "Nick" , 1.234);
        System.out.printf("I take %.2f\n", 2.3434);
        System.out.printf("Hi my name is %s and i take %.3f\n" ,"Nick",2.34343);
    }    
    
    
    
    
    
    public static void printNameVariable(){
//        System.out.println("Name from inside method : " + name);
    }
    
}
