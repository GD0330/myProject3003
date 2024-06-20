package bg.tu_varna.sit.a1.f22621658.fileCommands;

public class ExitCommand implements Command {
    public Calendars execute( String[] param, Calendars calendars) {
        System.out.println("Exiting the program...");
        return null;
    }
}
