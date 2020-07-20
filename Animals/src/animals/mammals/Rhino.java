
package animals.mammals;

import animals.Animal;




public class Rhino extends Animal{
 
    private int hornSize;
    private int legs;
    
//    public Rhino(){
//        
//    }

    public Rhino(int hornSize, int legs, String name, int age) {
        super(name, age);
        this.hornSize = hornSize;
        this.legs = legs;
    }

   
    
    
 
    public void setHornSize(int size){
        this.hornSize = size;
    }
    public int getHornSize(){
        return hornSize;
    }
    
    public void setLegs(int legs){
        this.legs = legs;
    }
    
    public int getLegs(){
        return legs;
    }
    
    @Override
    public void move(){
        System.out.println("Moving like a Rhino");
    }
    @Override
     public void play(){
     System.out.println("Playinglike a Rhino");
 }   
   
    @Override
   public void eat(){
     System.out.println("Eating like a Rhino");
 }  
    @Override
   public void printDetails(){
        System.out.println("Rhino: name= "+ getName()+", age= "+getAge()+", sizeOfHorn="+hornSize);
    }
  
}
