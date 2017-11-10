package net.stecky.puzzlemethis.events.health;

import net.stecky.puzzlemethis.events.Event;
import net.stecky.puzzlemethis.events.EventSubType;
import net.stecky.puzzlemethis.events.EventType;

import java.time.ZonedDateTime;

/**
 * Created by sb185219 on 11/9/2017.
 */

public abstract class HealthBase extends Event
{
    public HealthBase(EventSubType subType,
                      ZonedDateTime timeStamp, String comments)
    {
        super(EventType.HEALTH, subType, timeStamp, comments);
    }
}
