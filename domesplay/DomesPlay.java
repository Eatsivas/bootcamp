/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domesplay;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vagos
 */
public class DomesPlay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a name:");
        String name1 = input.next();
        System.out.println("Please enter a second name:");
        String name2 = input.next();
        System.out.println("Please enter a third name:");
        String name3 = input.next();

        String[] names = {name1, name2, name3};

        ArrayList<String> namesList = new ArrayList();

        namesList.add(name1);
        namesList.add(name2);
        namesList.add(name3);

        String indexArray = names[2];
        String indexList = namesList.get(2);

        if (indexArray == indexList) {
            System.out.println("The array and arraylist have the same index in place 2 which is : "
                    + indexArray);
        }

        System.out.println("Please enter another name :");
        String name4 = input.next();
        namesList.add(2, name4); // h me namesList.set(2,name4);
        String indexList2 = namesList.get(2);
        if (indexArray != indexList2) {
            System.out.println("The array and arraylist have different values in index 2 which are : "
                    + indexArray + " and " + indexList2);
        }

        System.out.println("Please enter a number between 0 and 2 ");
        int number1 = input.nextInt();
        System.out.println("Please enter another number between 0 and 2");
        int number2 = input.nextInt();

        String arrayName1 = names[number1];
        String arrayName2 = names[number2];

        ArrayList<String> namesList2 = new ArrayList();
        namesList2.add(arrayName1);
        namesList2.add(arrayName2);

        boolean remove = namesList.removeAll(namesList2);
        System.out.println(namesList);
        
    }
}
