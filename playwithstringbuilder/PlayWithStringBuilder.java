
package playwithstringbuilder;


public class PlayWithStringBuilder {

    
    public static void main(String[] args) {
        
        StringBuilder builder = new StringBuilder("New");
        builder.append(" ").append("York");     
        System.out.println(builder);
        builder.delete(0, 3);
        builder.insert(0, "New");
        builder.reverse();
        System.out.println(builder);
        StringBuilder builder2 = new StringBuilder("Vagelis");
        System.out.println("Before changeStringBuilder " +builder2);
        changeStringBuilder(builder2, "Tsivas");
        System.out.println("After changeStringBuilder " +builder2);
        
    }
    
    
    public static void changeStringBuilder(StringBuilder build, String lastName){
        build.append(lastName);
    }
    
}
