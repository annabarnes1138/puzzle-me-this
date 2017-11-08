package net.stecky.puzzlemethis.events;

import java.time.ZonedDateTime;

/**
 * Created by sb185219 on 11/8/2017.
 */

public abstract class Event
{
    EventType type;
    SubType subType;
    ZonedDateTime timeStamp;
    String comments;

    public Event(EventType type)
    {
        this.type = type;
    }

    public EventType getType()
    {
        return type;
    }

    public void setType(EventType type)
    {
        this.type = type;
    }

    public SubType getSubType()
    {
        return subType;
    }

    public void setSubType(SubType subType)
    {
        this.subType = subType;
    }

    public ZonedDateTime getTimeStamp()
    {
        return timeStamp;
    }

    public void setTimeStamp(ZonedDateTime timeStamp)
    {
        this.timeStamp = timeStamp;
    }

    public String getComments()
    {
        return comments;
    }

    public void setComments(String comments)
    {
        this.comments = comments;
    }
}
