package bg.tu_varna.sit.a1.f22621658.fileCommands;

import java.io.IOException;
import java.util.Scanner;

public interface Command {
    String execute(String filename, Scanner scanner, String content) throws IOException;
}
