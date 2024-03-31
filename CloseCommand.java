package bg.tu_varna.sit.a1.f22621658.Files;

import java.util.Scanner;

public class CloseCommand implements Command {
    public String execute(Filework filework, Scanner scanner, String content) {
        filework.CloseFile();
        return null;
    }
}
