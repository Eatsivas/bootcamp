
package animals.birds;

import animals.Animal;




public class Eagle extends Animal{

    private int wings;
    
   
    public Eagle(){
        super();
    }
    
    public Eagle(String name ,int age ,int wings){        
        super(name,age);
       // System.out.println("Creating Eagle ....");
        this.wings =wings;
        
    }
    
   
    

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }
    @Override
    public void play(){
        System.out.println(getName()+ " is playing fast like an eagle");
    }
    @Override
    public void printDetails(){
        System.out.println("Eagle:name= "+getName()+ ",age = "+getAge()+",wings= "+wings );
    }
    

}
