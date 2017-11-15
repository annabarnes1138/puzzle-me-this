package net.stecky.puzzlemethis.events.behaviors

import net.stecky.puzzlemethis.Person
import net.stecky.puzzlemethis.events.EventSubType
import net.stecky.puzzlemethis.events.EventType
import net.stecky.puzzlemethis.events.notes.Note
import java.time.Period
import java.time.ZonedDateTime

/**
 * Created by sb185219 on 11/14/2017.
 */
class BadBehavior(subject: Person, author: Person, behaviorType: BehaviorSubType, timeStamp: ZonedDateTime,
                  notes: List<Note>, duration: Period, var severity: Int) :
        BehaviorBase(subject, author, EventType.BAD_BEHAVIOR, behaviorType, timeStamp, notes, duration)
{
}