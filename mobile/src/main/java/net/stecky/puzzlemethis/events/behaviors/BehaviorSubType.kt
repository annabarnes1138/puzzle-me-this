package net.stecky.puzzlemethis.events.behaviors

import android.widget.ImageView
import net.stecky.puzzlemethis.events.EventSubType

/**
 * Created by sb185219 on 11/14/2017.
 */
class BehaviorSubType(name: String, icon: ImageView, var good: Boolean) : EventSubType(name, icon)
{
}