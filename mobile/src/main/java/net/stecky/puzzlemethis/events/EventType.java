package net.stecky.puzzlemethis.events;
import net.stecky.puzzlemethis.R;

/**
 * Created by sb185219 on 11/8/2017.
 */

public enum EventType
{
    BEHAVIOR(R.color.behaviorCardBackground),
    HEALTH(R.color.healthCardBackground),
    DIET(R.color.dietCardBackground),
    SLEEP(R.color.sleepCardBackground);

    private final int backgroundColor;

    EventType(int backgroundColor)
    {
        this.backgroundColor = backgroundColor;
    }

    public int getBackgroundColor()
    {
        return backgroundColor;
    }
}
