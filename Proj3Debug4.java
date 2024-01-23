// Application allows user to enter a series of words
// and displays them in reverse order
import java.util.*;
public class Proj3Debug4
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in); 
      int x = 0, y;
      String array[] = new String[100];
      String entry;
      final String STOP = "XXX"; // changed XXX --> "XXX"
      System.out.print("Enter any word. Enter " + STOP +
         " when you want to stop >> "); 
      entry = input.nextLine();
      while(!(entry.equals(STOP)))
      {
         array[x] = entry;
         ++x; // added ;
         System.out.print("Enter another word. Enter " +
            STOP + " when you want to stop >> ");
         entry = input.nextLine();
      }
      System.out.println("The words in reverse order are: ");
      for (y = x - 1; y >= 0; --y) { // changed y = x - 1; y > 0; --x --> y = x - 1; y >= 0; --y
         System.out.print(array[y] + " ");
      }
      System.out.println();
   }
}