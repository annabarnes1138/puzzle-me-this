package net.stecky.puzzlemethis.events;

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

    public boolean isGood()
    {
        return isGood;
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
