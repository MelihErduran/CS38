// Program prompts user for words
// to store in an ArrayList
import java.util.ArrayList;
import java.util.Scanner;
public class Lab16Debug1
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      ArrayList<String> words = new ArrayList<String>(); //change (string) to <String>
      String word;
      final String QUIT = "ZZZ";
      System.out.print("Enter a word to store  or " + QUIT +
         " to quit >> ");
      word = kb.nextLine();
      while(!word.equals(QUIT))
      {
         words.add(word);
         System.out.println("Current list : " + words);
         System.out.print("Enter a word to store  or " + QUIT +
            " to quit >> ");
         word = kb.nextLine(); //added this line
      }
   }
}