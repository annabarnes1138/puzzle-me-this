package net.stecky.puzzlemethis.events.behaviors;

import net.stecky.puzzlemethis.events.Event;
import net.stecky.puzzlemethis.events.EventType;

import java.time.ZonedDateTime;

/**
 * Created by sb185219 on 11/8/2017.
 */

public abstract class Behavior extends Event
{
    private String approach;

    public Behavior(BehaviorSubType type)
    {
        super(type.isGood() == true ? EventType.GOOD_BEHAVIOR : EventType.BAD_BEHAVIOR);
    }

    public Behavior(BehaviorSubType type, ZonedDateTime timestamp, String comments)
    {
        super(type.isGood() == true ? EventType.GOOD_BEHAVIOR : EventType.BAD_BEHAVIOR, type, timestamp, comments);
    }

    public String getApproach()
    {
        return approach;
    }

    public void setApproach(String approach)
    {
        this.approach = approach;
    }
}
