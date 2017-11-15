package net.stecky.puzzlemethis.events.behaviors

import net.stecky.puzzlemethis.Person
import net.stecky.puzzlemethis.events.Event
import net.stecky.puzzlemethis.events.EventSubType
import net.stecky.puzzlemethis.events.EventType
import net.stecky.puzzlemethis.events.notes.Note
import java.time.Period
import java.time.ZonedDateTime

/**
 * Created by sb185219 on 11/14/2017.
 */
abstract class BehaviorBase(subject: Person, author: Person, type: EventType, subType: EventSubType,
                            timeStamp: ZonedDateTime, notes: List<Note>, var duration: Period) :
        Event(subject, author, type, subType, timeStamp, notes)
{}