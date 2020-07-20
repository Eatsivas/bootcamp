
package sun;

public class Sun {
    private static Sun sun;
    
    
    private Sun(){
        
    }
    
    
    public static Sun getSun(){
        System.out.println("111111Sun method get sun: starting");
        if(sun==null){
            System.out.println("2222222Sun method get sun: create sun");
            sun = new Sun();   
        }
        return sun;
    }
}
