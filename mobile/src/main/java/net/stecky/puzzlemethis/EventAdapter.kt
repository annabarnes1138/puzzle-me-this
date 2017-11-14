package net.stecky.puzzlemethis

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import net.stecky.puzzlemethis.events.BaseEventViewHolder
import net.stecky.puzzlemethis.events.Event
import net.stecky.puzzlemethis.events.behaviors.BadBehaviorViewHolder
import net.stecky.puzzlemethis.events.health.MedicineAdministrationViewHolder

/**
 * Created by sb185219 on 11/14/2017.
 */
class EventAdapter(private val mContext: Context, private val eventList: List<Event>) : RecyclerView.Adapter<BaseEventViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseEventViewHolder?
    {
        when(viewType)
        {
            1 -> return BadBehaviorViewHolder(parent)
            2 -> return MedicineAdministrationViewHolder(parent)
        }

        return null
    }

    override fun onBindViewHolder(holder: BaseEventViewHolder, position: Int)
    {
        holder.onBindViewHolder(event = eventList[position])
    }

    override fun getItemCount(): Int
            = eventList.size

    override fun getItemViewType(position: Int): Int
    {
        return eventList[position].type.ordinal
    }
}