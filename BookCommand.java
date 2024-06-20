package bg.tu_varna.sit.a1.f22621658.TicketCommands;

import bg.tu_varna.sit.a1.f22621658.Helpers.Command;
import bg.tu_varna.sit.a1.f22621658.models.Calendars;
import bg.tu_varna.sit.a1.f22621658.models.Event;

import java.io.IOException;

public class BookCommand implements Command {
    @Override
    public Calendars execute( String[] param, Calendars calendars) throws IOException {
        String name=param[1];
        String date=param[2];
        int row= Integer.parseInt(param[3]);
        int seatNum= Integer.parseInt(param[4]);
        StringBuilder nt= new StringBuilder();
        nt.append("Reserved-");
        for (int i = 5; i < param.length; i++) {
            nt.append(param[i]);
            nt.append(" ");
        }
        String state=nt.toString();

        for (Event event : calendars.getEvents()) {
            if (event.getName().equals(name)&&
                    event.getDate().equals(date)){
                int x=1;
                for (int i = 0; i < event.getHallSize(); i++) {
                    if (event.getCertainSeatID(x)==seatNum&&
                            event.getCertainSeatRow(x)==row&&
                            event.getCertainSeatState(x).equals("Free")){
                        event.setCertainSeatState(x,state);
                        System.out.println("Your seat is Reserved !");
                        return calendars;
                    }
                    x++;
                }
                System.out.println("Your seat isn't available! ");
                return calendars;
            }
        }
        System.out.println("No such event on this date !");
        return calendars;
    }
}
