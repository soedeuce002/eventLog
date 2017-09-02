package com.reeattiy;

import java.util.ArrayList;
import java.util.List;

public class EventLog {


    private List<Event> eventList;

    public EventLog(){

        this.eventList = new ArrayList<>();
    }

    public boolean addEvent(Event event) throws IllegalArgumentException{
        if (event == null || event.getName() == null || event.getAction() == null) {
            throw new IllegalArgumentException("Event must contain a valid value.");
        } else {
            System.out.println(event);
            eventList.add(event);
        }

        return true;

    }

    public int getNumEvents(){

        return eventList.size();
    }

}
