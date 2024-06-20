package bg.tu_varna.sit.a1.f22621658.fileCommands;

public class CloseCommand implements Command {
    public Calendars execute( String[] param, Calendars calendars) {
        if (OpenCommand.filename == null ) {
            System.out.println("File Closed");
        }
        else {
            System.out.println("File couldn't close");
        }
        return null;
    }

}
