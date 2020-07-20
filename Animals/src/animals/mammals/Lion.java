
package animals.mammals;

import animals.Animal;




public class Lion extends Animal{

 
    private int legs;
    
    

    public Lion(int legs, String name, int age) {
        super(name, age);
        this.legs = legs;
    }
    
    
    public void setLegs(int legs){
        this.legs = legs;
    }
    
    public int getLegs(){
        return legs;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(getName()+ " is eating very fast and tasty meat"); 
    }

    @Override
    public void play() {
        System.out.println("Playing like a Lion!"); 
    }

    @Override
    public void move() {
        System.out.println("Moving like a Lion!"); 
    }
    
    @Override
    public void printDetails(){
        System.out.println(getName()+ " has legs: "+ legs);
    }
}
