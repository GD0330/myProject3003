package bg.tu_varna.sit.a1.f22621658.models;

import java.util.ArrayList;
import java.util.List;

public class Calendars {
    private List<Event> events;

    public Calendars() {
        this.events = new ArrayList<>();
    }
    public void addEvent(Event event) {
        for (Event oldEvent : events) {
            if ((oldEvent.getDate()).equals(event.getDate())&&oldEvent.getHall().getNumber()==event.getHall().getNumber()){
                System.out.println("Cant have an event on this date and in this hall! Its already taken!");
                return;
            }
        }
        events.add(event);
    }
    @Override
    public String toString() {
        StringBuilder info=new StringBuilder();
        for (Event oldEvent : events) {
            info.append(oldEvent.toString());

        }
        return info.toString();
    }

    public List<Event> getEvents() {
        return events;
    }
}
