package net.stecky.puzzlemethis.events

import net.stecky.puzzlemethis.Person
import net.stecky.puzzlemethis.events.notes.Note
import java.time.ZonedDateTime

/**
 * Created by sb185219 on 11/14/2017.
 */
abstract class Event(var subject: Person,
                     var author: Person,
                     var type: EventType,
                     var subType: EventSubType,
                     var timeStamp: ZonedDateTime,
                     var notes: List<Note>)
{}