
package playingwithemployees;


public class Teacher extends Employee implements Advisable{

    public Teacher(String name, int salary) {
        super(name, salary);
    }
    
   
    public void teach(){
        System.out.println(getName()+" teacher is teaching");
    }

    @Override
    public void giveAdvice() {
        System.out.println(getName()+ " teacher is giving advice");
    }

    @Override
    public void work() {
        teach();
  }

    @Override
    public String toString() {
        String message= String.format("Teacher: name=%s ,salary=%.0f", getName(),getSalary());
        return message;
    }
    
    
}
