package animals;
import java.lang.Object;

public class Animal extends Object {
    //protected can be seen if inside same package
    //or outside package but extends the class
    private String name;
    private int age;

    
    public Animal(){
        super();
    }
    
    
    
    
    public Animal(String name, int age) {
       // System.out.println("Creating animal .....");
        this.name = name;
        this.age = age;
    }
 
    
    
 public void move(){
     System.out.println(name+" is moving like an Animal");
 }   
    
   public void play(){
     System.out.println(name+ " is playing like an Animal");
 }   
   public void play(String toy){
       System.out.println(name+ " is playing like an Animal with" +toy);
   }
   
   public void eat(){
     System.out.println(name+ " is eating like an Animal");
 }   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printDetails() {
        System.out.println("Details of animal");
    }
    
   
    
   
   
   
}
