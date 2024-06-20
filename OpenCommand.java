package bg.tu_varna.sit.a1.f22621658.fileCommands;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class OpenCommand implements Command {
        @Override
        public Calendars execute( String[] param, Calendars calendars) throws IOException {
            File file = new File(filename);
            if (!file.exists()) {
                if (file.createNewFile()) {
                    System.out.println("File created successfully.");
                } else {
                    throw new IOException("Failed to create the file.");
                }
            }
             if (file.length()>0) {
                BufferedReader reader = new BufferedReader(new FileReader(filename));

                String line;
                StringBuilder rawContent = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    rawContent.append(line);
                }
                reader.close();

                SimpleContentHandler simpleContentHandler = new SimpleContentHandler();
                calendars = simpleContentHandler.decode(rawContent.toString());
                System.out.println("File opened successfully.");
            }
            else{
                System.out.println("Your file is empty !");
            }
            return calendars;
        }
}
