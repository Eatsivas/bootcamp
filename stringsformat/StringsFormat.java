
package stringsformat;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class StringsFormat {

  

    public static void main(String[] args) throws FileNotFoundException, IOException {
       String header =  String.format("%-18s%-5s%-8s\n", "NAME" ,"AGE" ,"HEIGHT");
        System.out.println(header);
        String line1 = String.format("%-18s%-5d%-8.2f\n","Nick",23,1.70);
        System.out.println(line1);
        String line2 = String.format("%-18s%-5d%-8.2f\n","Theofanopoulos",23,1.70);
        System.out.println(line2);
        FileWriter fileWriter = new FileWriter("/Users/Vagos/Documents/file.txt",true);
        //PrintWriter writer = new PrintWriter(fileWriter);
        fileWriter.write(header);
        fileWriter.write(line1);
        fileWriter.close();
        //writer.close();
        fileWriter = new FileWriter("/Users/Vagos/Documents/file.txt",true);
        //writer = new PrintWriter(fileWriter);
        fileWriter.write(line2);
        fileWriter.close();
    }

}
