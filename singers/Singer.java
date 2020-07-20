
package singers;


public abstract class Singer {
    
    private String song;
    private final String name;
    
    public Singer(String name ,String song){    
        this.name =name;
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getName() {
        return name;
    }
    
    
    
    
    public abstract void sing();      
    
    
}
