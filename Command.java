package bg.tu_varna.sit.a1.f22621658.fileCommands;

import java.io.IOException;

public interface Command {
    Calendars execute( String[] param, Calendars calendars) throws IOException;
}
