import java.util.LinkedList;
import java.util.Queue;
import java.util.ListIterator;

public class ChessTourny
{  
   public static void main(String[] args)
   {  
      LinkedList<String> chessRoster = new LinkedList<>();
      chessRoster.addLast("Magnus");
      chessRoster.addLast("Bobby");
      chessRoster.addLast("Judit");
      chessRoster.addLast("Hou");
      chessRoster.addLast("Garry");
      chessRoster.addLast("Viswanathan");
      chessRoster.addLast("Anna");
      chessRoster.addLast("Maia");
      chessRoster.addLast("Zhu");
      chessRoster.addLast("Mikhail");

      // Print all elements
      System.out.println("\nFull roster before first round: ");
      System.out.println(chessRoster);

      firstRound(chessRoster, 3);
     
      // Print elements after removal
      System.out.println("\nRoster after first round: ");
      System.out.println(chessRoster);
   }

   public static void firstRound(LinkedList<String> list, int n)
   {
      ListIterator<String> chessIterator = list.listIterator();
      while (chessIterator.hasNext()) {
         boolean didBreak = false;
         for (int i = 0; i < n; i++){
            if (chessIterator.hasNext()){
               chessIterator.next();
            } else {
               didBreak = true;
               break;
            }
         }
         if (!didBreak){
            chessIterator.remove();
         }
      }

     
   }
  
}
