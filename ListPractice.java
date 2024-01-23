// Program inserts and sorts random numbers in a list,
// prints the sum, and displays the average.
import java.util.*;

public class ListPractice {
    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<Integer>();
        int newNumber = 0;
        Random randomNumber = new Random();

        // Create random numbers to store in the List
        for (int k = 0; k <15; k++) {
           newNumber = randomNumber.nextInt(101);
           list.add(newNumber);
        }
        System.out.println("The list is: ");

        Collections.sort(list);

        System.out.println(list);
        int sum = 0;

        ListIterator<Integer> iterator = list.listIterator();

        while (iterator.hasNext()){
            sum += iterator.next();
        }

        System.out.println(sum);
    }
} 