
package singers;

import java.util.ArrayList;
import java.util.List;


public class ListsOfSingers {
    
     public static List<Singer> getRockSingers(String song){
        List<Singer> rockSingers = new ArrayList();
        rockSingers.add(new RockSinger("Bruce Dickinson",song));
        rockSingers.add(new RockSinger("Ozzy Ozbourne",song));
        rockSingers.add(new RockSinger("Εφη Θωδη",song));
        return rockSingers;
    }
    
     public static List<Singer> getFolkSingers(String song){
        List<Singer> folkSingers = new ArrayList();
        folkSingers.add(new FolkSinger("Βασίλης Τερλέγκας",song));
        folkSingers.add(new FolkSinger("Εφη Θωδη",song));
        return folkSingers;
    }
    
     public static List<Singer> getAllSingers(String song){
        List<Singer> allSingers = new ArrayList();        
        allSingers.addAll(getRockSingers(song));
        allSingers.addAll(getFolkSingers(song));
        return allSingers;
    }
    
    
    
    
    
    
}
