package bg.tu_varna.sit.a1.f22621658.fileCommands;

import java.util.Scanner;

public class ExitCommand implements Command {
    public String execute(String filename, Scanner scanner, String content) {
        System.out.println("Exiting...");
        return null;
    }
}
