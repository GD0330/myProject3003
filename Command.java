package bg.tu_varna.sit.a1.f22621658.Files;

import bg.tu_varna.sit.a1.f22621658.Files.Filework;

import java.io.IOException;
import java.util.Scanner;

public interface Command {
    String execute(Filework filework, Scanner scanner, String content) throws IOException;
}
