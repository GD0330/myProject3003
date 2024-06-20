package bg.tu_varna.sit.a1.f22621658.TicketCommands;

import bg.tu_varna.sit.a1.f22621658.Helpers.Command;
import bg.tu_varna.sit.a1.f22621658.models.Calendars;
import bg.tu_varna.sit.a1.f22621658.models.Event;

import java.io.IOException;

public class UnBookCommand implements Command {
    @Override
    public Calendars execute( String[] param, Calendars calendars) throws IOException {
        String name=param[1];
        String date=param[2];
        int row= Integer.parseInt(param[3]);
        int seatNum= Integer.parseInt(param[4]);

        String state="Free";
        for (Event event : calendars.getEvents()) {
            if (event.getName().equals(name)&&
                    event.getDate().equals(date)){
                int x=1;
                for (int i = 0; i < event.getHallSize(); i++) {
                    String[] CurrentState = event.getCertainSeatState(x).split("-");
                    if (event.getCertainSeatID(x)==seatNum&&
                            event.getCertainSeatRow(x)==row&&CurrentState[0].equals("Reserved")){
                        event.setCertainSeatState(x,state);
                        System.out.println("This seat is now Free !");
                        return calendars;
                    }
                    x++;
                }
                System.out.println("The seat is ALREADY FREE,BOUGHT or it doesnt exist !");
                return calendars;
            }
        }
        System.out.println("No such event on this date !");
        return calendars;
    }
}
