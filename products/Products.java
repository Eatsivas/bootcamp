/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Vagos
 */
public class Products {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList();

        list = getProductListFromInput();
        question("----Printed list---");
        printList(list);
        sortList(list);
        question("----Sorted list---");
        printList(list); 

    }

    static ArrayList<String> getProductListFromInput() {

        Scanner sc = new Scanner(System.in);
        question("How many products do you want to insert ? ");
        int numOfProducts = sc.nextInt();
        question("Please add " + numOfProducts + " products: ");
        ArrayList<String> listOfProducts = new ArrayList();
        int counter = 0;
        while (counter < numOfProducts) {
            question("Please add  product " + (counter + 1) + ": ");
            String product = sc.next();
            listOfProducts.add(product);
            counter++;
            
//            for(int i =0; i<numOfProducts; i++){
//            String product = sc.next();
//            listOfProducts.add(product);

        }
        return listOfProducts;
    }

    static void printList(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i < list.size() - 1) {
                System.out.print(list.get(i) + ", ");
            } else {
                System.out.print(list.get(i) + ".");
            }
        }
        System.out.println();

    }

    static void sortList(ArrayList<String> list) {
        Collections.sort(list);
    }

    static void question(String question) {
        System.out.println(question);
    }
}
