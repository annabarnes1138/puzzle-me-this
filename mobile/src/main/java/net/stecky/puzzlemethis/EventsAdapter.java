package net.stecky.puzzlemethis;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import net.stecky.puzzlemethis.events.Event;

import java.util.List;

/**
 * Created by sb185219 on 11/8/2017.
 */

public class EventsAdapter extends RecyclerView.Adapter<EventsAdapter.MyViewHolder>
{
    private Context mContext;
    private List<Event> eventList;

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        public TextView timestamp, subtype_name;
        public ImageView subtype_icon;

        public MyViewHolder(View view)
        {
            super(view);
            subtype_name = (TextView) view.findViewById(R.id.subtype_name);
            timestamp = (TextView) view.findViewById(R.id.timestamp);
            subtype_icon = (ImageView) view.findViewById(R.id.subtype_icon);

        }
    }

    public EventsAdapter(Context mContext, List<Event> eventList)
    {
        this.mContext = mContext;
        this.eventList = eventList;
    }

    @Override
    public EventsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.event_card, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(EventsAdapter.MyViewHolder holder, int position)
    {
        Event event = eventList.get(position);
        holder.timestamp.setText(event.getTimeStamp().toString());
        holder.subtype_name.setText(event.getSubType().getName());
        Glide.with(mContext).load(event.getSubType().getIcon()).into(holder.subtype_icon);
        ((CardView)holder.itemView).setCardBackgroundColor(mContext.getColor(event.getType().getBackgroundColor()));
    }

    @Override
    public int getItemCount()
    {
        return eventList.size();
    }
}
