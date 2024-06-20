package bg.tu_varna.sit.a1.f22621658.TicketCommands;

import bg.tu_varna.sit.a1.f22621658.Helpers.Command;
import bg.tu_varna.sit.a1.f22621658.models.Calendars;
import bg.tu_varna.sit.a1.f22621658.models.Event;

import java.io.IOException;

public class BuyCommand implements Command {
    @Override
    public Calendars execute( String[] param, Calendars calendars) throws IOException {
        String name=param[1];
        String date=param[2];
        int row= Integer.parseInt(param[3]);
        int seatNum= Integer.parseInt(param[4]);

        for (Event event : calendars.getEvents()) {
            if (event.getName().equals(name)&&event.getDate().equals(date)) {
                int x = 1;
                for (int i = 0; i < event.getHallSize(); i++) {
                    if (event.getCertainSeatID(x) == seatNum &&
                            event.getCertainSeatRow(x) == row &&
                            event.getCertainSeatState(x).equals("Free")) {
                        String code=name+"@"+date+"@"+event.getHall().getNumber()+"@"+row+"@"+seatNum;
                        // Example for code: @12:1:24@2@5@3
                        String state="Bought-"+code;

                        event.setCertainSeatState(x,state);
                        System.out.println("Your seat is Bought !");
                        System.out.println("Your code is: "+code);
                        return calendars;
                    }
                    x++;
                }
                System.out.println("The seat is TAKEN, or it doesnt exist !");
                return calendars;
            }
        }
        System.out.println("No such event on this date !");
        return calendars;
    }
}
