package bg.tu_varna.sit.a1.f22621658.fileCommands;

import java.util.Scanner;

public class CloseCommand implements Command {
    public String execute(String filename, Scanner scanner, String content) {
        if (filename == null ) {
            System.out.println("No file is currently opened.");
        }
        System.out.println("File closed successfully.");
        return null;
    }

}
