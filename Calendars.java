package bg.tu_varna.sit.a1.f22621658.models;

import java.util.ArrayList;
import java.util.List;

public class Calendars {
    private List<Event> events;

    public Calendars() {
        this.events = new ArrayList<>();
    }

    public boolean addEvent(Event event) {
        for (Event oldEvent : events) {
            if ((oldEvent.getDate()).equals(event.getDate())&&
                    oldEvent.getHallNumber().equals(event.getHallNumber())){
                System.out.println("Cant have an event on this date and in this hall! Its already taken!");
                return false;
            }
        }
        events.add(event);
        return true;
    }
    public int getCalendarsSize(){
        return  this.events.size();
    }
    public String getCertainEventDate(int i){
        return this.events.get(i).getDate();
    }
    public String getCertainEventName(int i){
        return this.events.get(i).getName();
    }
    public Event getCertainEvent(int i){
        return this.events.get(i);
    }
    public void setCertainEvent(int i,Event event){
        this.events.set(i,event);
    }
    public List<Event> getEvents() {
        return events;
    }

    @Override
    public String toString() {
        StringBuilder info=new StringBuilder();
        for (Event oldEvent : events) {
            info.append(oldEvent.toString());

        }
        return info.toString();
    }
}
