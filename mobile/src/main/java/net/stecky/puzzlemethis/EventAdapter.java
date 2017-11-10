package net.stecky.puzzlemethis;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import net.stecky.puzzlemethis.events.Event;
import net.stecky.puzzlemethis.viewholders.BadBehaviorViewHolder;
import net.stecky.puzzlemethis.viewholders.BaseEventViewHolder;

import java.util.List;

/**
 * Created by sb185219 on 11/8/2017.
 */

public class EventAdapter extends RecyclerView.Adapter<BaseEventViewHolder>
{
    private Context mContext;
    private List<Event> eventList;


    public EventAdapter(Context mContext, List<Event> eventList)
    {
        this.mContext = mContext;
        this.eventList = eventList;
    }

    @Override
    public BaseEventViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        switch(viewType)
        {
            case 0: return new BadBehaviorViewHolder(parent);
        }

        return null;
    }

    @Override
    public void onBindViewHolder(BaseEventViewHolder holder, int position)
    {
        Event event = eventList.get(position);

        switch(holder.getItemViewType())
        {
            case 0: holder.populateValuesFromEvent(event);
        }
    }

    @Override
    public int getItemCount()
    {
        return eventList.size();
    }
}
