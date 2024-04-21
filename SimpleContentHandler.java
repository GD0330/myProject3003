package bg.tu_varna.sit.a1.f22621658.fileCommands;

import bg.tu_varna.sit.a1.f22621658.models.Calendar;
import bg.tu_varna.sit.a1.f22621658.models.Event;
import bg.tu_varna.sit.a1.f22621658.models.Hall;
import bg.tu_varna.sit.a1.f22621658.models.Seat;

import java.util.HashMap;
import java.util.Map;

public class SimpleContentHandler implements ContentHandler{
    @Override
    public Calendar decode(String content) {
        Calendar calendar=new Calendar();
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

            for (int row = 1; row <= Integer.valueOf(hallInfo[1]); row++) {
                for (int seatNum = 1; seatNum <= Integer.valueOf(hallInfo[2]); seatNum++) {
                    Seat seat = new Seat(row, seatNum);
                    seat.setSeatState(hallInfo[k]);
                    seats.put(seatNum, seat);
                    k++;
                }
            }
            Hall hall = new Hall(Integer.valueOf(hallInfo[0]),Integer.valueOf(hallInfo[1]),Integer.valueOf(hallInfo[2]),seats);

            Event event= new Event(eventDateAndName[0],eventDateAndName[1],hall);

            calendar.addEvent(event);
        }
        return new Calendar();
    }

    @Override
    public String encode(String content) {
        return null;
    }
}
