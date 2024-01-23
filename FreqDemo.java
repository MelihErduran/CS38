import java.util.Arrays;

public class FreqDemo {
    public static void main(String[] args) {
        int[] freqArray = { 3, 4, 5, 6, 7, 8, 3, 5, 7, 9, 2, 3, 4, 6, 8, 9, 3 };

        // Sorting the array
        Arrays.sort(freqArray);

        int mostFrequent = 0;
        int highestFrequency = -1;
        int count = 0;

        for (int i = 0; i < freqArray.length; i++) {
            count++;
            if (i == freqArray.length - 1 || freqArray[i] != freqArray[i + 1]) {
                if (count > highestFrequency) {
                    highestFrequency = count;
                    mostFrequent = freqArray[i];
                }
                count = 0;
            }
        }

        System.out.println(Arrays.toString(freqArray));
        System.out.println("Most frequent element: " + mostFrequent);
        System.out.println("Frequency: " + highestFrequency);
    }
}

