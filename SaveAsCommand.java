package bg.tu_varna.sit.a1.f22621658.fileCommands;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SaveAsCommand implements Command {
    public Calendars execute( String[] param, Calendars calendars) throws IOException {
        String newFileName = param[1];
        if (OpenCommand.filename == null) {
            System.out.println("No file is currently opened.");
            return null;
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(newFileName));
        SimpleContentHandler simpleContentHandler=new SimpleContentHandler();
        writer.write(simpleContentHandler.encode(calendars));
        writer.close();
        System.out.println("Changes saved successfully to " + newFileName);
        return calendars;
    }
}
