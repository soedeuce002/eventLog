package com.reeattiy;

public class Event {

    private String name;
    private String action;

    public Event(String name, String action){
        this.name = name;
        this.action = action;
    }

    public String getName() {

        return name;
    }

    public String getAction() {

        return action;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", action='" + action + '\'' +
                '}';
    }
}



