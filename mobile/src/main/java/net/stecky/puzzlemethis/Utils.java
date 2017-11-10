package net.stecky.puzzlemethis;

import com.github.marlonlom.utilities.timeago.TimeAgo;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Created by sb185219 on 11/9/2017.
 */

public class Utils
{
    public static String getTimeAgo(ZonedDateTime timestamp)
    {
        ZonedDateTime localTime = timestamp.withZoneSameInstant(ZoneId.systemDefault());
        long eventTimeMilli = localTime.toInstant().toEpochMilli();
        return TimeAgo.using(eventTimeMilli);
    }
}
