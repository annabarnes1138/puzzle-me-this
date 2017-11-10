package net.stecky.puzzlemethis.viewholders;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import net.stecky.puzzlemethis.R;
import net.stecky.puzzlemethis.Utils;
import net.stecky.puzzlemethis.events.Event;
import net.stecky.puzzlemethis.events.behaviors.BadBehavior;

import at.grabner.circleprogress.CircleProgressView;

/**
 * Created by sb185219 on 11/9/2017.
 */

public class BadBehaviorViewHolder extends BaseEventViewHolder
{
    public TextView timestamp, behavior_name, comments, duration;
    public ImageView subtype_icon, overflow;
    public CircleProgressView severity;

    public BadBehaviorViewHolder(ViewGroup parent)
    {
        super(parent, R.layout.bad_behavior_event_card);
        timestamp = this.itemView.findViewById(R.id.timestamp);
        behavior_name = this.itemView.findViewById(R.id.subtype_name);
        comments = this.itemView.findViewById(R.id.comments);
        duration = this.itemView.findViewById(R.id.duration);
        subtype_icon = this.itemView.findViewById(R.id.subtype_icon);
        overflow = this.itemView.findViewById(R.id.overflow);
        severity = this.itemView.findViewById(R.id.severity);
    }

    @Override
    public void populateValuesFromEvent(Event event)
    {
        this.timestamp.setText(Utils.getTimeAgo(event.getTimeStamp()));
        this.behavior_name.setText(event.getSubType().getName());
        this.comments.setText(event.getComments());
        this.duration.setText("duration: " + ((BadBehavior)event).getDuration());
        Glide.with(mContext).load(event.getSubType().getIcon()).into(subtype_icon);
        severity.setValue(((BadBehavior)event).getSeverity());
        overflow.setOnClickListener(view -> showPopupMenu(overflow));
    }
}
