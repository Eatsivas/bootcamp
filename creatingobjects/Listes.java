
package creatingobjects;

import java.util.ArrayList;
import java.util.List;


public class Listes {
    
   private static List<Person> personList;
   // private static List<Course> courseList;
    
    public static List<Person> getPersonList(){
        return personList;
    }
    
    public static void addPerson(Person p){
        if(personList ==null){
            personList= new ArrayList();
            
        }
        personList.add(p);
    }
}
