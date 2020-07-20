package methods;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author emergon
 */
public class Methods {

    public static void main(String[] args) {

        //System.out.println("Hello from main method");
        hello("Hello. I am Happy");
        ArrayList<String> list = new ArrayList();
        list.add("desk");
        list.add("chair");
        list.add("phone");
        printList(list);
        System.out.println("*****Printing Sorted List**********");
        Collections.sort(list);
        printList(list);

        System.out.println("Playing with numbers");
        
        int x = returnSum(3, 5);
        System.out.println();
        System.out.println("x = "+ x);
        
        int maximum = returnMax(23, 90, 1);
        System.out.println("maximum:"+maximum);
        
        int array [] = { 3, 7, 19, 23};
        double mean = returnMean(array);
        System.out.println("mean="+mean);
    }

    static void printList(ArrayList<String> inputList) {
        int size = inputList.size();
        for (int i = 0; i < size; i++) {
            String product = inputList.get(i);
            System.out.println(i + "." + product);
        }
    }
    
    
    
    static void hello(String message) {
        System.out.println(message);
    }
    
    static int returnSum(int x, int y){
        int sum = x + y;
        return sum;
    }
    
    static int returnMax(int x1, int x2, int x3){
        int max = Math.max(x1, x2);
        max = Math.max(max, x3);
        return max;
    }
    
    
    //method accepts an array of integers
    //returns average of numbers that exist in the array
    static double returnMean(int [] inputArray){
        int length = inputArray.length;
        int sum = inputArray[0];
        for(int i=1;i<length;i++){
            sum = sum + inputArray[i];
        }
        double average = sum/length;
        return average;
    }

}









