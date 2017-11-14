package net.stecky.puzzlemethis

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.event_activity.*
import net.stecky.puzzlemethis.events.Event

class EventActivity : AppCompatActivity()
{
    private var recyclerView: RecyclerView = recycler_view
    private var adapter: EventAdapter? = null
    private var eventsList: MutableList<Event> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.event_activity)
    }
}
