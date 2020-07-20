
package creatingobjects;

import java.util.ArrayList;
import java.util.List;


public class Person {
    
    private final String name;
    private ArrayList<String> languages;
    private List<BankAccount> accounts;
//    public Person(){
//        
//    }
    
    
    public Person(String name){
        this.name = name;
    }
    
//    public void setName(String name){
//        this.name = name;
//    }
    
    public String getName(){
        return name;
    }
    
//    public void setLanguages(ArrayList<String> list){
//        this.languages= list;
//    }
    
    public void addLanguage(String language){
        if(languages ==null){
            languages=new ArrayList();
        }
        languages.add(language);
    }
    
    public ArrayList<String> getLanguages(){
    return languages;
}
    
    public void printLanguages(){
        if(languages == null){
            System.out.println(name + " doesn't know any languages yet");
        }else{
        System.out.println(name+ " knows these languages: ");
        for(String lang : languages){
            System.out.print(lang+", ");
            
        }
            System.out.println();
        }
    }
    
}

