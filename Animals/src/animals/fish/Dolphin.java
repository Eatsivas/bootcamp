
package animals.fish;

import animals.Animal;




public class Dolphin extends Animal{
   
    private int breathTime;
    
//    public Dolphin(){
//        
//    }

    public Dolphin(int breathTime, String name, int age) {
        super(name, age);
        this.breathTime = breathTime;
    }

   
    


    public void setBreathTime(int breathTime) {
        this.breathTime = breathTime;
    }

    public int getBreathTime() {
        return breathTime;
    }
    
    public void play(Dolphin friend){
        System.out.println(getName()+ " is playing with its friend "+ friend.getName());
    }
    
    @Override//annotations :contain metadata
    public String toString(){
        String details = "Dolphin: name= "+getName()+",age= "+getAge()+",breathTime= "+breathTime;
        return details;
    }
    @Override
    public void play(){
        System.out.println(getName()+ " is playing alone like a lonely dolphin!!");
    }
    
    @Override
    public void printDetails(){
        System.out.println("Dolphin: name= "+getName()+",age= "+getAge()+",breathTime= "+breathTime);
    }
}
