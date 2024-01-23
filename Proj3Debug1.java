// Application lists valid shipping codes
//     Code are: A, C, T, or H
// Then prompts user for a code
// Then the program checkes to see if the 
//     code is valid
import java.util.*;
public class Proj3Debug1
{
   public static void main(String[] args) // changed String args[] --> String[] args
   {
      Scanner input = new Scanner(System.in); 
      char userCode;
      String entry;
      boolean found = false; // changed true --> false
      char[] okayCodes = {'A','C','T','H'};
      System.out.println("Enter shipping code for this delivery.");
      System.out.print("Valid codes are: ");
      for(int x = 0; x < 4; ++x) // changed 2 --> 4
      {
          System.out.print(okayCodes[x]);
          if(x != (okayCodes.length - 1))
             System.out.print(", ");     
      }
      System.out.print(" >> ");
      entry = input.nextLine(); 
      userCode = entry.charAt(0); // changed 1 --> 0
      for (char okayCode : okayCodes) { // changed for loop --> enhanced for loop
         if (userCode == okayCode) // changed = --> ==
         {
            found = true;
            break; // added break statement
         }
      }
      if(!found)
         System.out.println("Good code");
      else
         System.out.println("Sorry code not found");
   }
}