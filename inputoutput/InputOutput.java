package inputoutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //     String fileName = "/Users/Vagos/Documents/myTextFile.txt";
//      printTextFromFileUsingBufferedReader(fileName);
        //      File file = new File(fileName);
//        FileWriter fileWriter = new FileWriter(fileName,true);//Set true for append mode
//        PrintWriter writer = new PrintWriter(fileWriter);
//        writer.println("This is second line");
//        writer.close();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = input.next();

        int age;
        do {
            System.out.println("Enter age: ");
            while (!input.hasNextInt()) {
                System.out.print("Please enter a number: ");
                input.next();//βημα (step)
            }
            age = input.nextInt();
        } while (age < 0 || age > 100);

        System.out.println("My age: " + age);

        String nameOfFile = "/Users/Vagos/Documents/myNameAndAge.txt";
        File myfile = new File(nameOfFile);
        FileWriter fileWriter = new FileWriter(nameOfFile, true);//Set true for append mode
        PrintWriter writer = new PrintWriter(fileWriter);
        writer.append("My name is: " + name);
        writer.append("\nMy age is:" + age);
        writer.close();

    }

    public static void printTextFromFileUsingBufferedReader(String file) throws FileNotFoundException, IOException {

        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();

        }
        reader.close();
        fileReader.close();
    }

    public static void printTextFromFileUsingScanner(File file) throws FileNotFoundException {
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String line = input.nextLine();
            System.out.println(line);
        }
        input.close();
    }

    public static void printFileDetails(File file) {
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        File fileparent = file.getParentFile();
        String[] array = fileparent.list();
        System.out.println(fileparent.toString() + " has " + array.length + "files");
        for (String arxeio : array) {
            System.out.println(arxeio);
        }

    }

    public static void writeToFileUsingPrintWriter(File file) throws IOException {
        FileWriter fileWriter = new FileWriter(file, true);//Set true for append mode
        PrintWriter writer = new PrintWriter(fileWriter);
        writer.println("This is the vary first line");
        writer.close();
    }
}
