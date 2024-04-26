package bg.tu_varna.sit.a1.f22621658.fileCommands;

import bg.tu_varna.sit.a1.f22621658.models.Calendar;
import bg.tu_varna.sit.a1.f22621658.models.Event;
import bg.tu_varna.sit.a1.f22621658.models.Hall;
import bg.tu_varna.sit.a1.f22621658.models.Seat;

import java.util.HashMap;
import java.util.Map;

public class SimpleContentHandler implements ContentHandler{
    @Override
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

            int k=3;
            Map<Integer, Seat> seats= new HashMap<>();

            int r=Integer.parseInt(hallInfo[1]);
            int sN=Integer.parseInt(hallInfo[2]);
            
            Hall hall = new Hall(Integer.valueOf(hallInfo[0]));

            for (int j = 1; j < hall.getNumRows()*hall.getNumSeatsPerRow()+1; j++) {
                hall.getSeats().get(j).setSeatState(hallInfo[k]);
                k++;
            }

            Event event= new Event(eventDateAndName[0],eventDateAndName[1],hall);

            calendar.addEvent(event);
        }
        return calendar;
    }
    @Override
    public String encode(Calendars calendars) {
        StringBuilder strB=new StringBuilder();
        for (int i = 0; i < calendars.getEvents().size(); i++) {
            strB.append(calendars.getEvents().get(i).getDate()+ ";"+
                    calendars.getEvents().get(i).getName()+ ";]");
            strB.append(calendars.getEvents().get(i).getHall().getNumber()+";"+
                    calendars.getEvents().get(i).getHall().getNumRows()+";"+
                    calendars.getEvents().get(i).getHall().getNumSeatsPerRow()+";");
            for (int j = 1; j < calendars.getEvents().get(i).getHall().getNumRows()* calendars.getEvents().get(i).getHall().getNumSeatsPerRow()+1; j++) {
                strB.append(calendars.getEvents().get(i).getHall().getSeats().get(j).getSeatState()+";");
            }
            strB.append("#");
        }
        return strB.toString();
    }
}
