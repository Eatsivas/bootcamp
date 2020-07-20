
package creatingobjects;

import java.util.ArrayList;



public class MainClass {

  

    public static void main(String[] args) {
       //Persons that know programming langs. 
        Person p1 = new Person("Jack");
        p1.printLanguages();
        ArrayList<String> glwsses = new ArrayList();
//        glwsses.add("English");
//        glwsses.add("Java");
       // p1.setLanguages(glwsses);
        p1.addLanguage("Java");
        p1.addLanguage("English");
        glwsses.add("HTML");       
        p1.printLanguages();
        ArrayList<String> glwsses2 = new ArrayList();
        glwsses2.add("C#");
       // p1.setLanguages(glwsses2);
        p1.printLanguages();
        Listes.addPerson(p1);
        
        
        PersonBankAccount pb = new PersonBankAccount();
        pb.person=p1;
        pb.accounts= new ArrayList();
        
    }

}
