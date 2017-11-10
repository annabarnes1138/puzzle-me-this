package net.stecky.puzzlemethis.events.behaviors;

import java.time.ZonedDateTime;

/**
 * Created by sb185219 on 11/9/2017.
 */

public class BadBehavior extends Behavior
{
    private int severity;
    private String duration;

    public BadBehavior(BehaviorSubType type)
    {
        super(type);
    }

    public BadBehavior(BehaviorSubType type, ZonedDateTime timestamp, String comments, int severity, String duration)
    {
        super(type, timestamp, comments);
        this.severity = severity;
        this.duration = duration;
    }

    public int getSeverity()
    {
        return severity;
    }

    public void setSeverity(int severity)
    {
        this.severity = severity;
    }

    public String getDuration()
    {
        return duration;
    }

    public void setDuration(String duration)
    {
        this.duration = duration;
    }
}
