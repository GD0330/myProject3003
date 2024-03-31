package bg.tu_varna.sit.a1.f22621658.Files;

import java.util.Scanner;

public class ExitCommand implements Command {
    public String execute(Filework filework, Scanner scanner, String content) {
        System.out.println("Exiting...");
        return null;
    }
}
