package net.stecky.puzzlemethis.events;

import java.time.ZonedDateTime;

/**
 * Created by sb185219 on 11/8/2017.
 */

public class Behavior extends Event
{
    private boolean isGood;
    private String approach;

    public Behavior()
    {
        super(EventType.BEHAVIOR);
    }

    public Behavior(EventSubType type, boolean isGood, ZonedDateTime timestamp, String comments)
    {
        super(EventType.BEHAVIOR, type, timestamp, comments);
        this.isGood(isGood);
    }

    public boolean isGood()
    {
        return isGood;
    }

    public void isGood(boolean good)
    {
        isGood = good;
    }

    public void setGood(boolean good)
    {
        isGood = good;
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
