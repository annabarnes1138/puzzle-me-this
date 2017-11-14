package net.stecky.puzzlemethis.events.behaviors

import net.stecky.puzzlemethis.events.notes.Note
import java.time.ZonedDateTime

/**
 * Created by sb185219 on 11/14/2017.
 */
class BadBehavior(type: BehaviorSubType, timestamp: ZonedDateTime, notes: List<Note>, var severity: Int, var duration: String) :
        BehaviorBase(type, timestamp, notes)
{
}