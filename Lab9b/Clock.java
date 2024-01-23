package Lab9b;

import java.time.LocalTime;
import java.time.ZoneId;

/**
   Part I: Implement a class Clock whose getHours, getMinutes and
   getTime methods return the current time at your location.
   Return the time as a string.

   To retrieve the current time as a String:

   java.time.LocalTime.now(ZoneId.of("America/Los_Angeles")).toString();

   The output of the above should look like this, as an example:
             19:31:36.819807330

   You'll need to extract the hours and
   minutes as a substring.
*/

public class Clock
{
   /**
    * gets hours
    * @return hours of current time in string
   */
   public int getHours()
   {
      return LocalTime.now(ZoneId.of("America/Los_Angeles")).getHour();
   }

   /**
    * gets minutes
    * @return hours of current time in string
   */
   public int getMinutes()
   {
      return java.time.LocalTime.now(ZoneId.of("America/Los_Angeles")).getMinute();
   }

   /**
    * gets current time composed of hours and minutes
    * @return time in string;
    */
   public String getTime()
   {
      return java.time.LocalTime.now(ZoneId.of("America/Los_Angeles")).toString();
   }
}
