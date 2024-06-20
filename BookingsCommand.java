package bg.tu_varna.sit.a1.f22621658.TicketCommands;

import bg.tu_varna.sit.a1.f22621658.Helpers.Command;
import bg.tu_varna.sit.a1.f22621658.models.Calendars;
import bg.tu_varna.sit.a1.f22621658.models.Event;

import java.io.IOException;

public class BookingsCommand implements Command {
    @Override
    public Calendars execute( String[] param, Calendars calendars) throws IOException {
        String name=param[1];
        String date=param[2];
        int x=1;

        if (name.equals("-")){
            for (Event event:calendars.getEvents()) {
                if ((event.getDate()).equals(date)){
                    PrintHeader();
                    PrintInfo(event,x);
                }
            }
        } else if (date.equals("-")) {
            for (Event event:calendars.getEvents()) {
                if (event.getName().equals(name)){
                    PrintHeader();
                    PrintInfo(event,x);
                }
            }
        } else{
            for (Event event:calendars.getEvents()) {
                if ((event.getDate()).equals(date)&&event.getName().equals(name)){
                    PrintHeader();
                    PrintInfo(event,x);
                }
            }
        }
        return calendars;
    }
    public void PrintHeader(){
        System.out.println("  v- Reserved, NOT Bought yet  ");
        System.out.println("  x- Bought  ");
        System.out.println("  o- Free ");
        System.out.println("-------------------------------");
        System.out.println("   Here is the scene*");
    }
    public void PrintInfo(Event event,int x){
        for (int row = 1; row <event.getNumberOfRows()+1; row++) {
            for (int seatNum = 1; seatNum < event.getNumberOfSeatsPerRow()+1; seatNum++) {
                String[] state=event.getCertainSeatState(x).split("-");
                if (state[0].equals("Reserved")){
                    System.out.print(" v ");
                } else if (state[0].equals("Free")){
                    System.out.print(" o ");
                } else if (state[0].equals("Bought")){
                    System.out.print(" x ");
                }
                x++;
            }
            System.out.print("\n");
        }
    }
}
