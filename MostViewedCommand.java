package bg.tu_varna.sit.a1.f22621658.TicketCommands;

import bg.tu_varna.sit.a1.f22621658.Helpers.Command;
import bg.tu_varna.sit.a1.f22621658.models.Calendars;
import bg.tu_varna.sit.a1.f22621658.models.Event;

import java.io.IOException;

public class MostViewedCommand implements Command {
    @Override
    public Calendars execute(String[] param, Calendars calendars) throws IOException {
        int[] views = new int[calendars.getCalendarsSize()];
        int i = 0;
        String[] CertainSeatState;
        for (Event event : calendars.getEvents()) {
            views[i] = 0;
            for (int j = 1; j < event.getHallSize()-1; j++) {
                CertainSeatState = event.getCertainSeatState(j).split("-");
                if (CertainSeatState[0].equals("Bought")) {
                    views[i]++;
                }
            }
            i++;
        }


        reArrangeByView(views,calendars);
        printResult(views,calendars);

        return calendars;
    }

    private void reArrangeByView(int[] views,Calendars calendars){
        int ISwap;
        Event ESwap;
        for (int k = 0; k < calendars.getCalendarsSize()-1; k++) {
            for (int j = 0; j < calendars.getCalendarsSize() - 1; j++) {
                if (views[j] < views[j + 1]) {

                    ISwap = views[j];
                    views[j] = views[j + 1];
                    views[j + 1] = ISwap;

                    ESwap = calendars.getCertainEvent(j);
                    calendars.setCertainEvent(j, calendars.getCertainEvent(j + 1));
                    calendars.setCertainEvent(j + 1, ESwap);
                }
            }
        }
    }
    private void printResult(int[] views, Calendars calendars){
        int i=0;
        System.out.println("Top 3 most viewed events: ");
        for (Event event: calendars.getEvents()) {
            System.out.println(event.getName()+" was watched by "+views[i]);
            i++;
            if (i>=3){
                break;
            }
        }
    }

}
