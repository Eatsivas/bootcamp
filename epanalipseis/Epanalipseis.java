package epanalipseis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author emergon
 */
public class Epanalipseis {

    public static void main(String[] args) {

        //declaration-initialization; condition ; step
        //if(true) 
        //  then do this
        //else
        //  do that
//        for(int i = 0; i<=10; i++){
//            System.out.println(i);
//        }
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.println(array[i]);
        }
        System.out.println("------------------------");
        //In the previous example print only the numbers divisible by 2
        System.out.print("The numbers divided by 2 are: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        //Make the above more readable... place commas.
        //Make PlayWithLists program more dynamic.

        System.out.println();
        //Create an array with 4 names:Jack, John, Mary, Andy
        String[] nameArray = {"Jack", "John", "Mary", "Andy"};
        //Print their values in a message. The message must be one line
        for (int i = 0; i < nameArray.length; i++) {
            System.out.print(nameArray[i] + " ");
        }
        //System.out.println(Arrays.toString(nameArray));

        System.out.println("---------Filling ArrayList with names---------");
        //Use a for loop to add the names of the array to a new ArrayList.
        ArrayList<String> listOfNames = new ArrayList();

        int mikos = nameArray.length;

        System.out.println("mikos:" + mikos);

        for (int i = 0; i < mikos; i++) {
            String word = nameArray[i];
            listOfNames.add(word);
        }

        System.out.println("*************Learning while loop**********");

        int a = 100;
        while (a > 0) {
            System.out.println("value:" + a);
            a = a / 2;
        }

        System.out.println("***Printing names in listOfNames****");
        int counter = 0;
        int size = listOfNames.size();
        while (counter < size) {
            //System.out.println("counter before increment:"+counter);
            String name = listOfNames.get(counter);
            System.out.println(counter + 1 + "." + name);
            counter++;
            //System.out.println("counter after increment:"+counter);
        }

        System.out.println("*****Sorting and printing List****");
        counter = 0;
        System.out.println("counter:"+counter);
        Collections.sort(listOfNames);
        while (counter < size) {
            String name = listOfNames.get(counter);
            System.out.println(counter + 1 + "." + name);
            counter++;
        }
        
        //Variables declared inside a method are called local variables.
        //Local variables must have been initialized in order to read their value
//        int i;
//        int x =i;
//        System.out.println(i);
        
        System.out.println("*****Reversing and printing List****");
        counter = 0;
        System.out.println("counter:"+counter);
        Collections.reverse(listOfNames);
        while (counter < size) {
            String name = listOfNames.get(counter);
            System.out.println(counter + 1 + "." + name);
            counter++;
        }
        
    }

}
