package net.stecky.puzzlemethis.viewholders;

import android.view.ViewGroup;
import android.widget.TextView;

import net.stecky.puzzlemethis.R;
import net.stecky.puzzlemethis.events.Event;

/**
 * Created by sb185219 on 11/9/2017.
 */

public class MedicineAdministrationViewHolder extends BaseEventViewHolder
{
    public TextView medicine;


    public MedicineAdministrationViewHolder(ViewGroup parent)
    {
        super(parent, R.layout.medicine_administration_event_card);
        medicine = this.itemView.findViewById(R.id.subtype_name);
    }

    @Override
    protected void populateValuesFromEvent(Event event)
    {
        medicine.setText(event.getSubType().getName());
    }
}
