package playwithexceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PlayWithExceptions {

    public static void main(String[] args) {
        String name0 = "Jfewfwefwewefwevwvwr";
        try{
        checkName(name0);
        }catch(NameTooLargeRuntimeException e){
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println("****checking name finished****");
        
        int[] array = {1, 5, 10, 4};
        try {//Try to do these things 
            for (int i = 0; i <= array.length; i++) {//ArrayIndexOutOfBoundsException
                System.out.println(array[i] + "");

            }
            System.out.println("***finished reading array!!!!");
        } catch (ArrayIndexOutOfBoundsException variable) {//if an exception exists handle it
            System.out.println("Opa....ArrayIndexOutOfBoundsException showed up");
        }

        System.out.println("***Program after reading array***");
        String name = null;
        try {
            System.out.println(name.length());//NullPointerException
        } catch (NullPointerException er) {
            System.out.println("Opa...NullPointerException showed up");
        }

        System.out.println("***Program after reading String***");
//        FileReader fileReader = null;
//        BufferedReader reader =null;
        try (FileReader f = new FileReader("file.txt"); BufferedReader r = new BufferedReader(f)) {
//            fileReader = new FileReader("file.txt"); //FileNotFoundException
//             reader= new BufferedReader(fileReader);
            String line = null;
            line = r.readLine(); // IOException
            System.out.println("line: " + line);
        } catch (FileNotFoundException ex) {
            System.out.println("Opa....FileNotFoundException occured");
            ex.printStackTrace();//deixnei to error se olew tis klaseis/mathods pou exoun thema ap auto 
        } catch (IOException e) {
            System.out.println("Opa....IOexception occured");
        }

        System.out.println("****After all exceptions***");

        System.out.println("*****End of Program****");

    }

    public static void checkName(String name) throws NameTooLargeRuntimeException{
        if (name.length() > 15) {
            throw new NameTooLargeRuntimeException(name + " is too large");
        } else {
            System.out.println(name + ": ok .Very good");
        }
    }
}
    // to antoikatasthsame me to try()   try with resources    
//    finally {
//            System.out.println("Will always run....");
//            try {
//                fileReader.close();
//            } catch (NullPointerException | IOException ex) {
//               // Logger.getLogger(PlayWithExceptions.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            try {
//                reader.close();
//            } catch (NullPointerException|IOException ex) {
//               // Logger.getLogger(PlayWithExceptions.class.getName()).log(Level.SEVERE, null, ex);
//            }
//    
//    
//    

