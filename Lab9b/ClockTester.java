package Lab9b;

/**
 * Tests the Clock and WorldClock Classes.
 */
public class ClockTester
{
   public static void main(String[] args)
   {
      //test Clock
      System.out.println();
      System.out.println("Testing Clock class");
      Clock clock = new Clock();
      System.out.println("Hours:   " + clock.getHours());
      System.out.println("Minutes: " + clock.getMinutes());
      System.out.println("Time:    " + clock.getTime());
         
      //test WorldClock
      /*
      System.out.println("");
      System.out.println("Testing WorldClock class");
      int offset = 3;
      System.out.println("Offset:   " + offset);
      WorldClock wclock = new WorldClock(offset);
      System.out.println("Hours:    " + wclock.getHours());
      System.out.println("Minutes:  " + wclock.getMinutes());
      System.out.println("Time:     " + wclock.getTime());
      System.out.println();
      */
   }
}
