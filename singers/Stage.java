
package singers;

import java.util.ArrayList;
import java.util.List;


public class Stage {
    //private Singer singer;
    private List<Singer> singers;

    
    public void startSinging(){
        for(Singer singer : singers){
            singer.sing();
        }
    }
    
    
    public void changeSingers(List<Singer> list){
        this.singers = list;
    }
    
    public Stage(List<Singer> singers) {
        this.singers = singers;
    }
    
   
    public List<Singer> getSingers() {
        return singers;
    }

    public void setSingers(List<Singer> singers) {
        this.singers = singers;
    }
    
   
}
