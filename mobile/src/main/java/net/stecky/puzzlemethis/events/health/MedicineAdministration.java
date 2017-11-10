package net.stecky.puzzlemethis.events.health;

import net.stecky.puzzlemethis.R;

import java.time.ZonedDateTime;

/**
 * Created by sb185219 on 11/9/2017.
 */

public class MedicineAdministration extends HealthBase
{

    public MedicineAdministration(String medicineName, ZonedDateTime timeStamp, String comments)
    {
        super(new HealthSubType("received " + medicineName, R.drawable.medication), timeStamp, comments);
    }
}
