package com.reeattiy;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.IsEqual.equalTo;


public class EventLogTest {


    //given a new event
    //when the event is null
    //then an error is thrown
    @Test (expected = IllegalArgumentException.class)
    public void whenNullEventIsAddedThenThrowsAnError() throws IllegalArgumentException {
        //arrange
        EventLog isNull = new EventLog();
        //act
        isNull.addEvent(null);

    }

    //given a new event
    //when the event name is null
    //then an error is thrown
    @Test (expected = IllegalArgumentException.class)
    public void whenNameOfEventIsNullThenThrowsAnError() throws IllegalArgumentException {
        //arrange
        EventLog isNull = new EventLog();
        Event nullName = new Event(null, "valid event");
        //act
        isNull.addEvent(nullName);
    }

    //given a new event
    //when the event action is null
    //then an error is thrown
    @Test (expected = IllegalArgumentException.class)
    public void whenActionOfEventIsNullThenThrowsAnError() throws IllegalArgumentException {
        //arrange
        EventLog isNull = new EventLog();
        Event nullAction = new Event("valid name", null);
        //act
        isNull.addEvent(nullAction);
    }

    //given a new event
    //when the event has a valid name and action
    //then the new event is added to the list of events


    //given a new event
    //when the event has a valid name and action
    //then the new event is added to the list of events
    @Test
    public void whenNameAndActionAreBothValidThenEventIsAdded() {
        //arange
        EventLog eventLog = new EventLog();
        Event validEvent = new Event("valid name", "valid action");
        //act
        eventLog.addEvent(validEvent);
    }

    //given a new event
    //when a valid event is added to the list
    //then verify the correct number of items in the list is reflected
    @Test
    public void whenValidEventIsAddedThenShowNumberOfItems() {
        //arange
        EventLog eventLog = new EventLog();
        Event validEvent = new Event("valid name", "valid action");
        //act
        eventLog.addEvent(validEvent);
        assertThat(eventLog.getNumEvents(), equalTo(1));

    }
}
