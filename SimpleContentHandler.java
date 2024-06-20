package bg.tu_varna.sit.a1.f22621658.fileCommands;

import bg.tu_varna.sit.a1.f22621658.models.Calendar;
import bg.tu_varna.sit.a1.f22621658.models.Event;
import bg.tu_varna.sit.a1.f22621658.models.Hall;

public class SimpleContentHandler implements ContentHandler{
    
    public Calendars decode(String content) {
        Calendars calendar=new Calendars();
        
        String[] allEvents =content.split("#");
        String[] singleEventInfo;
        String[] eventDateAndName;
        String[] hallInfo;

        for (int i=0;i<allEvents.length;i++){
            singleEventInfo=allEvents[i].split("]");
            eventDateAndName=singleEventInfo[0].split(";");
            hallInfo=singleEventInfo[1].split(";");

            int k=1;
            
            Hall hall = new Hall(hallInfo[0]);

            for (int j = 1; j < (hall.getHallTotalSeats())+1; j++) {
                hall.setSeatState(j,hallInfo[k]);
                k++;
            }

            Event event= new Event(eventDateAndName[0],eventDateAndName[1],hall);

            calendar.addEvent(event);
        }
        return calendar;
    }
   
    public String encode(Calendars calendars) {
        StringBuilder strB=new StringBuilder();
        for (int i = 0; i < calendars.getCalendarsSize(); i++) {
            strB.append(calendars.getCertainEventDate(i));
            strB.append(";");
            strB.append(calendars.getCertainEventName(i));
            strB.append(";]");
            strB.append(calendars.getEvents().get(i).getHallNumber());
            strB.append(";");
            for (int j = 1; j < calendars.getEvents().get(i).getHallSize()+1; j++) {
                strB.append(calendars.getEvents().get(i).getCertainSeatState(j));
                strB.append(";");
            }
            strB.append("#");
        }
        return strB.toString();
    }
}
