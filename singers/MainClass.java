
package singers;

import java.util.List;



public class MainClass {

  

    public static void main(String[] args) {
        
//       Singer singer = new FolkSinger("Έφη Θώδη","Sweet Home Alabama");
//        singer.sing();
       
        //Create stage (the stage has the singers)
        Stage stage = new Stage(ListsOfSingers.getFolkSingers("Γαρδένια"));
        //First Folk singers are singing 
        //Ok singers on the stage, start singing
        stage.startSinging();
        //change the stage to RockSingers
        System.out.println("\n*****Stage changes to Rock*****");
        List<Singer>  rockSingers = ListsOfSingers.getRockSingers("Fear Of The Dark");
        stage.changeSingers(rockSingers);
        //Rocksingers are singing        
        stage.startSinging();
        //change stage to AllSingers
        System.out.println("\n****Stage changes to All****");
        List<Singer> allSingers = ListsOfSingers.getAllSingers("Imagine");
        stage.changeSingers(allSingers);
        //All singers singing together
        stage.startSinging();
        
        
        
    }

}
