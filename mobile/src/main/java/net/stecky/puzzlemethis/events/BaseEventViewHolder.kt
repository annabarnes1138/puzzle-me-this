package net.stecky.puzzlemethis.events

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import net.stecky.puzzlemethis.R
import net.stecky.puzzlemethis.Utils

/**
 * Created by sb185219 on 11/14/2017.
 */
abstract class BaseEventViewHolder(parent: ViewGroup, layoutResource: Int)
    : RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(layoutResource, parent, false))
{
    protected var event_name: TextView = this.itemView.findViewById(R.id.event_name)
    protected var timestamp: TextView = this.itemView.findViewById(R.id.timestamp_text)

    protected abstract fun populateValuesFromEvent(event: Event)

    fun onBindViewHolder(event: Event)
    {
        event_name.text = event.subType.name
        this.timestamp.text = Utils.getTimeAgo(event.timeStamp)

        populateValuesFromEvent(event)
    }
}