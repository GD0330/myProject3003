package bg.tu_varna.sit.a1.f22621658.models;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private List<Event> events;

    public Calendar() {
        this.events = new ArrayList<>();
    }
    public void addEvent(Event event) {
        for (Event oldEvent : events) {
            if ((oldEvent.getDate()).equals(event.getDate())){
                System.out.println("Cant have an event on this date! Its already taken!");
                return;
            }
        }
        events.add(event);
    }
}
