import java.security.SecureRandom;
import java.util.Arrays;

public class BubbleSort {
    
    public static void bubbleSort(int[] data) {
        int n = data.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1; j++) {
                if (data[j] > data[j + 1]) {
                    swap(data, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    // Helper, private method to swap two elements in an array
    private static void swap(int[] data, int first, int second) {
        int temporary = data[first];
        data[first] = data[second];
        data[second] = temporary;
    }
    
    public static void main(String[] args) {
        
        SecureRandom generator = new SecureRandom();

        int[] data = generator.ints(10, 10, 91).toArray(); 

        System.out.printf("Unsorted array: %s%n", Arrays.toString(data));
        bubbleSort(data);
        System.out.printf("Sorted array: %s%n", Arrays.toString(data));
    }
}
