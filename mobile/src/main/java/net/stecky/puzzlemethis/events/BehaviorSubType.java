package net.stecky.puzzlemethis.events;

/**
 * Created by sb185219 on 11/9/2017.
 */

public class BehaviorSubType extends EventSubType
{
    private boolean isGood;

    public BehaviorSubType(String name, int icon, boolean isGood)
    {
        super(name, icon);
        this.isGood = isGood;
    }

    public boolean isGood()
    {
        return isGood;
    }

    public void setGood(boolean good)
    {
        isGood = good;
    }
}
