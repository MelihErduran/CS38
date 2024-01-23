// ListReverse.java
// Program creates a list, then creates a reverse of the list
import java.util.LinkedList;
import java.util.List;

public class ListReverse {
    public static void main(String args[]) {
        // create two linked lists
        LinkedList<Character> list1 = new LinkedList<Character>();
        LinkedList<Character> list2 = new LinkedList<Character>();

        // use List insert methods
        list1.addFirst('5');
        list1.addFirst('@');
        list1.addLast('V');
        list1.addLast('+');
        list1.addFirst('P');
        list1.addFirst('c');
        list1.addLast('M');
        list1.addLast('&');
        list1.addFirst('y');
        list1.addLast('X');
      
        System.out.println("List: ");
        System.out.println(list1);
        System.out.println("");

        list2 = reverse(list1); // call reverse method
        System.out.println("Reversed list is:");
        System.out.println(list2);
        System.out.println("");
    }
    
    // method that takes as an argument a LinkedList of chars
    // returns a LinkedList that is in reverse order
    public static LinkedList<Character> reverse(List<Character> one) {
        
        // create a LinkedList to return
        LinkedList<Character> reversed = new LinkedList<Character>();

        for (Character character : one) {
            reversed.addFirst(character);
        }
        
        return reversed;
    } 
}
