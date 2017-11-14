package net.stecky.puzzlemethis.events.behaviors

import net.stecky.puzzlemethis.events.Event
import net.stecky.puzzlemethis.events.EventType
import net.stecky.puzzlemethis.events.notes.Note
import java.time.ZonedDateTime

/**
 * Created by sb185219 on 11/14/2017.
 */
abstract class BehaviorBase(type: BehaviorSubType, timestamp: ZonedDateTime, notes: List<Note>) :
        Event(
                if (type.good == true) EventType.GOOD_BEHAVIOR else EventType.BAD_BEHAVIOR, type,
                timestamp, notes) {
    var approach: String? = null

}