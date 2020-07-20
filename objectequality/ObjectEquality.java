
package objectequality;

import java.util.ArrayList;
import java.util.List;



public class ObjectEquality {

  

    public static void main(String[] args) {
        //Wrapper classes : Byte ,Float, Short....
        Integer a = 2;
        
        int b =4;
        boolean areEqual = (a==b);
        System.out.println("a==b: "+ areEqual);
       
        String name1 = "Nick";//String pool
        String name2 = "Nick";//String pool
        String name3 = new String("Nick");//Heap
        areEqual = (name1==name2);
        System.out.println("name1==name2: "+areEqual);
        areEqual = name2==name3;
        System.out.println("name2==name3: "+areEqual);
        
        areEqual = name1.equals(name2);
        System.out.println("name1.equals(name2: "+areEqual);
        areEqual = name2.equals(name3);
        System.out.println("name2.equals(name3: "+areEqual);
        areEqual = name1.equals(name3);
        System.out.println("name1.equals(name3: "+areEqual);
        
        Student s1 = new Student("Mary",16,70);
        Student s2 = new Student("Andy",18,60);
        Student s3 = new Student("Andy",18,60);
        Student s4=s3;
        areEqual = (s1==s2);
        System.out.println("s1==s2: "+ areEqual);
         areEqual = (s2==s3);
        System.out.println("s2==s3: "+ areEqual);
        areEqual = (s4==s3);
        System.out.println("s4==s3: "+ areEqual);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        
        areEqual =  s1.equals(s3);
        System.out.println("s1.equals(s3): " +areEqual);
         areEqual =  s2.equals(s3);
        System.out.println("s2.equals(s3): " +areEqual);
         areEqual =  s1.equals(s3);
        System.out.println("s1.equals(s3): " +areEqual);
        areEqual = s1.equals(null);
        System.out.println("s1.equals(null: "+ areEqual);
    }

}
