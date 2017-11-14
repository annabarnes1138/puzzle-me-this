package net.stecky.puzzlemethis.viewholders;

import android.view.ViewGroup;
import android.widget.TextView;

import net.stecky.puzzlemethis.R;
import net.stecky.puzzlemethis.events.Event;
import net.stecky.puzzlemethis.events.behaviors.BadBehavior;

import at.grabner.circleprogress.CircleProgressView;

/**
 * Created by sb185219 on 11/9/2017.
 */

public class BadBehaviorViewHolder extends BaseEventViewHolder
{
    public TextView duration;
    public CircleProgressView severity;

    public BadBehaviorViewHolder(ViewGroup parent)
    {
        super(parent, R.layout.bad_behavior_event_card);
        duration = this.itemView.findViewById(R.id.duration_text);
        severity = this.itemView.findViewById(R.id.severity);
    }

    @Override
    protected void populateValuesFromEvent(Event event)
    {
        this.duration.setText("duration: " + ((BadBehavior)event).getDuration());
        severity.setValue(((BadBehavior)event).getSeverity());
    }
}
