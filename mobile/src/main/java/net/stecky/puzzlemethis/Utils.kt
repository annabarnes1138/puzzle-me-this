package net.stecky.puzzlemethis

import com.github.marlonlom.utilities.timeago.TimeAgo
import java.time.ZoneId
import java.time.ZonedDateTime

/**
 * Created by sb185219 on 11/14/2017.
 */
object Utils
{
    fun getTimeAgo(timestamp: ZonedDateTime): String
    {
        val localTime = timestamp.withZoneSameInstant(ZoneId.systemDefault())
        val eventTimeMilli = localTime.toInstant().toEpochMilli()
        return TimeAgo.using(eventTimeMilli)
    }
}