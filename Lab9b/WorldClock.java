package Lab9b;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * PART II.
 * Provide a subclass of Clock named WorldClock whose constructor
 * accepts a time offset. For example, if you live in California,
 * a new WorldClock(3) should show the time in New York, three
 * time zones ahead. You should not override getTime.
 */

public class WorldClock extends Clock
{
    private ZoneId zoneId;

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

    public WorldClock (int offset) {
        ZoneId baseZone = ZoneId.of("UTC");
    }
}
