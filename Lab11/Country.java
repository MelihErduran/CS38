package Lab11;
import java.io.*;
import java.util.Scanner;

public class Country {
    public static void main(String[] args) throws FileNotFoundException {
        File countriesText = new File("C:\\Users\\Melih\\IdeaProjects\\CS38 - Java\\src\\Lab11\\worldpop.txt");
        File countriesOutput = new File("C:\\Users\\Melih\\IdeaProjects\\CS38 - Java\\src\\Lab11\\countries.txt");
        PrintWriter countryTyper = new PrintWriter(countriesOutput);
        Scanner lineScanner = new Scanner(countriesText);
        while (lineScanner.hasNextLine()){
            String line = lineScanner.nextLine();
            int i = 0;
            while (!Character.isDigit(line.charAt(i))){
                i++;
            }
            String countryName = line.substring(0, i);
            countryTyper.println(countryName);
        }
        countryTyper.close();
    }
}
