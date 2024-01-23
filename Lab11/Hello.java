package Lab11;

import java.io.*;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) throws FileNotFoundException{
        File textFile = new File("C:\\Users\\Melih\\IdeaProjects\\CS38 - Java\\src\\Lab11\\hello.txt");
        Scanner fileIn = new Scanner(textFile);
        String text = fileIn.nextLine();
        System.out.println(text);
    }
}
