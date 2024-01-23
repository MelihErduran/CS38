import java.util.Arrays;
import java.util.Random;


public class SortedSequence
{
   /**
      Makes an array with n random values between 0-99.
      @param n the number of random numbers
      @return an array with n random numbers
   */
   public int[] generateRandom(int n)
   {
       Random rand = new Random();
       int[] randomArray = new int[n];
       for (int i = 0; i < randomArray.length; i++) {
           randomArray[i] = rand.nextInt(99) + 1;
       }
       return randomArray;
   }

   /**
      Prints an array.
      @param array the array to print
   */
   public void printArray(int[] array)
   {
       System.out.println(Arrays.toString(array));
   }

  /**
      Returns the sum of an array.
      @param array the array to sum
      @return an int of the sum of the array
  */
  public int getSum(int[] array)
  {
      int sum = 0;
      for (int j : array) {
          sum += j;
      }
      return sum;
  }

  /**
      Returns a sorted array.
      @param array the array to sort
      @param a_or_d 0 to sort ascending, 1 to sort descending
      @return array the sorted array
  */

  public int[] sortArray(int[] array, int a_or_d)
  {
      int temp;
      if (a_or_d == 0) {
          for (int i = 0; i < array.length; i++) {
              for (int j = 0; j < array.length; j++) {
                  if (array[i] < array[j]) {
                      temp = array[i];
                      array[i] = array[j];
                      array[j] = temp;
                  }
              }
          }
      }
      else {
          for (int i = 0; i < array.length; i++) {
              for (int j = 0; j < array.length; j++) {
                  if (array[i] > array[j]) {
                      temp = array[i];
                      array[i] = array[j];
                      array[j] = temp;
                  }
              }
          }
      }
      return array;
  }
   public static void main(String[] args)
   {
      SortedSequence util = new SortedSequence();

      int[] values = util.generateRandom(20);

      System.out.println("\nUnsorted array of random numbers: ");
      util.printArray(values);

      System.out.println("\nSorted array:");
      Arrays.sort(values);

      util.printArray(values);
     
      System.out.println();
      int sum = util.getSum(values);
      System.out.println("Sum of the array is " + sum);
      System.out.println();

       System.out.println("Lowest to greatest and greatest to lowest, custom:");
      System.out.println(Arrays.toString(util.sortArray(values, 0)));
      System.out.println(Arrays.toString(util.sortArray(values, 1)));

   }
}
