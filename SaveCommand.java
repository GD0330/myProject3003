package bg.tu_varna.sit.a1.f22621658.fileCommands;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveCommand implements Command {
    public Calendars execute( String[] param, Calendars calendars) throws IOException {
        if (OpenCommand.filename == null) {
            System.out.println("No file is currently opened.");
            return null;
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(OpenCommand.filename));
        SimpleContentHandler simpleContentHandler=new SimpleContentHandler();
        writer.write(simpleContentHandler.encode(calendars));
        writer.close();
        System.out.println("Changes saved successfully.");
        return calendars;
    }
}
