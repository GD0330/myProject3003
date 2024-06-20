package bg.tu_varna.sit.a1.f22621658.TicketCommands;

import bg.tu_varna.sit.a1.f22621658.Helpers.Command;
import bg.tu_varna.sit.a1.f22621658.models.Calendars;
import bg.tu_varna.sit.a1.f22621658.models.Event;

import java.io.IOException;

public class CheckCommand implements Command {
    @Override
    public Calendars execute( String[] param, Calendars calendars) throws IOException {
        String code=param[1];
        String[] eventInfo=code.split("@");

        for (Event event : calendars.getEvents()) {
            if (event.getName().equals(eventInfo[0])&&
                    event.getDate().equals(eventInfo[1])&&
                    event.getHallNumber().equals(eventInfo[2])) {
                int x = 1;
                for (int i = 0; i < event.getHallSize(); i++) {
                    String[] seatCode=event.getCertainSeatState(x).split("-");
                    if (seatCode[0].equals("Bought")) {
                        if (code.equals(seatCode[1])) {
                            System.out.println("Your seat is on the " +
                                    event.getCertainSeatRow(x) + " row, Number " +
                                    event.getCertainSeatID(x)+ ". Enjoy!");
                            return calendars;
                        }
                    }
                    x++;
                }
            }
        }
        System.out.println("Wrong or non-existing code!");
        return calendars;
    }
}
