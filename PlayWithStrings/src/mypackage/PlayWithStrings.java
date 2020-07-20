package mypackage;

import java.util.ArrayList;

public class PlayWithStrings {

    public static void main(String[] args) {

        String name = "Nick";
//        char n = 'N', a = 'i', m = 'c', e = 'k';
//        String name2 = "" + n + a + m + e;
//        System.out.println(name2);
//        char[] onoma = {'N', 'i', 'c', 'k'};
//        for (char c : onoma) {
//            System.out.print(c);
//        }
        String name3 = new String("Nick");
        String name4 = "Nick";
        String name5 = new String("Nick");
        boolean areEqual = name == name3;
        System.out.println("\nname==name3: " + areEqual);
        areEqual = name == name4;
        System.out.println("\nname==name4: " + areEqual);
        areEqual = name3 == name5;
        System.out.println("\nname3==name5: " + areEqual);

        int mikos = name.length();
        System.out.println(mikos);

        String word1 = "Tasos";
        String word2 = "Dimitris";
        printLargerName(word1, word2);
        char x = word1.charAt(0);
        System.out.println("x: " + x);
        String[] arrayOfNames = {"Jane", "Kevin", "Jonathan", "Peter"};
        printNamesStartingWith(arrayOfNames, 'J');
        // indexOf , concat,toLowerCase-toUppercase , trim, split, contains, replace,substring
        String[] cities = {"Athens", "Thessaloniki", "Thiva", "Thasos", "Xanthi", "Rethymno","Torino"};
        int index = word2.indexOf("is");
        System.out.println(index);
       
        ArrayList<String> poleis = getCitiesContainingLetters(cities, "th");
        for (String poli : poleis){
            System.out.print(poli+ ", ");
        }
        System.out.println();
        String leksi = "New";
        leksi = leksi.concat("York");        
        System.out.println(leksi);
        leksi = leksi.toUpperCase();
        System.out.println(leksi);
        String wordWithSpaces = "     this   is a  sentence";
        wordWithSpaces = wordWithSpaces.trim();
        System.out.println(wordWithSpaces);
        System.out.println(leksi + "contains YORK ?: " +leksi.contains("YORK"));
        String animals ="Frog,Zebra,Cat";
        String [] zwa = animals.split(",");
        for(String zwo:zwa){
            System.out.println(zwo+ "");
        }
        animals=animals.replace(",", "-");
        System.out.println(animals);
        animals =animals.substring(5,10);
        System.out.println(animals);
        String lastString = "Tasos";
        boolean areStringEqual = lastString.substring(1).toLowerCase().equals("asos");
        System.out.println(areStringEqual);
        
        
        System.out.printf("%s\n","Name");
        String formattedString = String.format("%s", "Name");
        System.out.println(formattedString);
        String keimeno = "My best book is \"Java -Begginer\"";
        System.out.println(keimeno);
        
        
    }

    public static void printLargerName(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();
        int max = Math.max(lengthA, lengthB);
        if (max == lengthA) {
            System.out.println("The larger name is: " + a);
        } else {
            System.out.println("The larger name is: " + b);
        }

    }

    public static void printNamesStartingWith(String[] array1, char letter) {
        System.out.println("Printing names starting with: " + letter);
        for (String name : array1) {
            if (name.charAt(0) == letter) {
                System.out.println(name + ", ");
            }
        }
    }

    public static ArrayList getCitiesContainingLetters(String[] array,String letters) {
        System.out.println("Printing cities NOT starting with "+ letters);
        ArrayList<String> citiesToKeep = new ArrayList();
        for (String array1 : array) {
            int index = array1.indexOf("th", 1);
            if (index != -1) {
               // System.out.print(array1 + ", ");
                citiesToKeep.add(array1);
            }

        }
        return citiesToKeep;
        //System.out.println("");
    }

}
