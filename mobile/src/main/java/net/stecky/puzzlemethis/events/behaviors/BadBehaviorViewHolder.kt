package net.stecky.puzzlemethis.events.behaviors

import android.view.ViewGroup
import android.widget.TextView
import at.grabner.circleprogress.CircleProgressView
import net.stecky.puzzlemethis.R
import net.stecky.puzzlemethis.events.BaseEventViewHolder
import net.stecky.puzzlemethis.events.Event

/**
 * Created by sb185219 on 11/14/2017.
 */
class BadBehaviorViewHolder(parent: ViewGroup) :
        BaseEventViewHolder(parent, R.layout.bad_behavior_event_card)
{
    protected var duration: TextView = this.itemView.findViewById(R.id.duration_text)
    protected var severity: CircleProgressView = this.itemView.findViewById(R.id.severity)

    override fun populateValuesFromEvent(event: Event)
    {
        duration.text = (event as BadBehavior).duration
        severity.setValue(event.severity.toFloat())
    }
}