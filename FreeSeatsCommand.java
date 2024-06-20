package bg.tu_varna.sit.a1.f22621658.TicketCommands;

import bg.tu_varna.sit.a1.f22621658.Helpers.Command;
import bg.tu_varna.sit.a1.f22621658.models.Calendars;
import bg.tu_varna.sit.a1.f22621658.models.Event;

import java.io.IOException;

public class FreeSeatsCommand implements Command {
    @Override
    public Calendars execute( String[] param, Calendars calendars) throws IOException {
        String name=param[1];
        String date=param[2];

        int x=1;
        for (Event event:calendars.getEvents()) {
            if ((event.getDate()).equals(date)&&
                    event.getName().equals(name)){
                System.out.println("This are the Seats for this event");
                System.out.println("  o- Free, x- Taken  ");
                System.out.println("---------------------");
                System.out.println("   Here is the scene*");
                for (int row = 1; row <event.getNumberOfRows()+1; row++) {
                  for (int seatNum = 1; seatNum < event.getNumberOfSeatsPerRow()+1; seatNum++) {
                      if (event.getCertainSeatState(x).equals("Free")){
                          System.out.print(" o ");
                      }
                      else{
                          System.out.print(" x ");
                      }
                      x++;
                  }
                    System.out.print("\n");
                 }
            }
        }
        return calendars;
    }
}
