package net.stecky.puzzlemethis.viewholders;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import net.stecky.puzzlemethis.R;
import net.stecky.puzzlemethis.Utils;
import net.stecky.puzzlemethis.events.Event;

/**
 * Created by sb185219 on 11/9/2017.
 */

public abstract class BaseEventViewHolder extends RecyclerView.ViewHolder
{
    protected Context mContext;
    protected TextView event_name, timestamp;

    public BaseEventViewHolder(ViewGroup parent, int layoutResource)
    {
        super(LayoutInflater.from(parent.getContext()).inflate(layoutResource, parent, false));
        mContext = parent.getContext();
        timestamp = this.itemView.findViewById(R.id.timestamp);
        event_name = this.itemView.findViewById(R.id.event_name);
    }

    protected abstract void populateValuesFromEvent(Event event);

    public void onBindViewHolder(Event event)
    {
        this.event_name.setText(event.getSubType().getName());
        this.timestamp.setText(Utils.INSTANCE.getTimeAgo(event.getTimeStamp()));

        populateValuesFromEvent(event);
    }

    protected void showPopupMenu(View view)
    {
        // inflate menu
        PopupMenu popup = new PopupMenu(mContext, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_event, popup.getMenu());
        popup.setOnMenuItemClickListener(new MyMenuItemClickListener());
        popup.show();
    }

    private class MyMenuItemClickListener implements PopupMenu.OnMenuItemClickListener
    {
        public MyMenuItemClickListener() {}


        @Override
        public boolean onMenuItemClick(MenuItem menuItem)
        {
            switch(menuItem.getItemId())
            {
                case R.id.action_event_details:
                    Toast.makeText(mContext, "Show Details", Toast.LENGTH_SHORT).show();
                    return true;
                default:
            }
            return false;
        }
    }
}
