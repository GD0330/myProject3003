package bg.tu_varna.sit.a1.f22621658.TicketCommands;

import bg.tu_varna.sit.a1.f22621658.Helpers.Command;
import bg.tu_varna.sit.a1.f22621658.models.Calendars;
import bg.tu_varna.sit.a1.f22621658.models.Event;
import bg.tu_varna.sit.a1.f22621658.models.Hall;

import java.io.IOException;

public class AddEventCommand implements Command {
    @Override
    public Calendars execute( String[] param, Calendars calendars) throws IOException {
        String date= param[1];
        String name=param[2];
        String numHall=param[3];
        Hall hall = new Hall(numHall);

        Event event=new Event(date,name,hall);
        if (calendars.addEvent(event))
        System.out.println("Event added! ");

        return calendars;
    }
}
