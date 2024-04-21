package bg.tu_varna.sit.a1.f22621658.fileCommands;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SaveCommand implements Command {
    public String execute(String filename, Scanner scanner, String content) throws IOException {
        if (filename == null) {
            System.out.println("No file is currently opened.");
            return null;
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        writer.write(content);
        writer.close();
        System.out.println("Changes saved successfully.");
        return content;
    }
}
