package net.stecky.puzzlemethis.events;

/**
 * Created by sb185219 on 11/8/2017.
 */

public class EventSubType
{
    private String name;
    private int icon;

    public EventSubType(){}

    public EventSubType(String name, int icon)
    {
        this.name = name;
        this.icon = icon;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getIcon()
    {
        return icon;
    }

    public void setIcon(int icon)
    {
        this.icon = icon;
    }
}
