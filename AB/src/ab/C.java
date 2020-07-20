
package ab;


public class C extends A {
    
   private B member ;//null
    
     public C(){
         super("Create my super class A");
         System.out.println("Creating C...");
         member = new B("Creating and Instantiating instance variable member of class C");
     }
    
}
