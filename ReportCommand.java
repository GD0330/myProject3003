package bg.tu_varna.sit.a1.f22621658.TicketCommands;

import bg.tu_varna.sit.a1.f22621658.Helpers.Command;
import bg.tu_varna.sit.a1.f22621658.models.Calendars;
import bg.tu_varna.sit.a1.f22621658.models.Event;

import java.io.IOException;

public class ReportCommand implements Command {
    @Override
    public Calendars execute( String[] param, Calendars calendars) throws IOException {
        String from=param[1];
        String to=param[2];
        String hallNum=param[3];
        int totalSold;

        if (hallNum.equals("-")){
            for (Event event: calendars.getEvents()) {
                if (checkIfBetweenDates(event,from,to)) {
                        ReportForEvent(event);
                } else {
                    System.out.println("No event between those dates.");
                }
            }
        }else{
            for (Event event: calendars.getEvents()) {
                if (checkIfBetweenDates(event,from,to)) {
                    if (event.getHallNumber().equals(hallNum)) {
                        ReportForEvent(event);
                    }else {
                        System.out.println("No event between those dates.");
                    }
                }
            }
        }
        return calendars;
    }
    public boolean checkIfBetweenDates(Event event,String from, String to){
        String[] fromDate=from.split(":");//Day-12,Month-1,Year-2024
        String[] toDate=to.split(":");
        String[] theDate;

        int fromYear=Integer.parseInt(fromDate[2]);
        int fromMonth=Integer.parseInt(fromDate[1]);
        int fromDay=Integer.parseInt(fromDate[0]);

        int toYear=Integer.parseInt(toDate[2]);
        int toMonth=Integer.parseInt(toDate[1]);
        int toDay=Integer.parseInt(toDate[0]);

        int theYear;
        int theMonth;
        int theDay;

        int finalFrom;
        int finalTo;
        int finalThe;

        theDate=event.getDate().split(":");

        theYear=Integer.parseInt(theDate[2]);
        theMonth=Integer.parseInt(theDate[1]);
        theDay=Integer.parseInt(theDate[0]);

        finalFrom=fromYear*10000+fromMonth*100+fromDay;
        finalTo=toYear*10000+toMonth*100+toDay;
        finalThe=theYear*10000+theMonth*100+theDay;

        if (finalFrom<=finalThe&&
                finalTo>=finalThe){
            return true;
        }
        else{
            return false;
        }

    }
    public void ReportForEvent(Event event){
        int totalSold=0;
        for (int i = 1; i < event.getHallSize() + 1; i++) {
            String[] seatState = event.getCertainSeatState(i).split("-");
            if (seatState[0].equals("Bought")) {
                totalSold++;
            }
        }
        System.out.println(event.getName() + " sold " + totalSold + " tickets. ");
    }
}
