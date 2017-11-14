package net.stecky.puzzlemethis.events;

import java.time.ZonedDateTime;

/**
 * Created by sb185219 on 11/8/2017.
 */

public abstract class Event
{
    EventType type;
    EventSubType subType;
    ZonedDateTime timeStamp;
//    List<Note> notes;
    String comments;

    public Event(EventType type)
    {
        this.type = type;
    }

    public Event(EventType type, EventSubType subType, ZonedDateTime timeStamp, String comments)
    {
        this.type = type;
        this.subType = subType;
        this.timeStamp = timeStamp;
        this.comments = comments;
    }

    public EventType getType()
    {
        return type;
    }

    public void setType(EventType type)
    {
        this.type = type;
    }

    public EventSubType getSubType()
    {
        return subType;
    }

    public void setSubType(EventSubType subType)
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
