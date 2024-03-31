package bg.tu_varna.sit.a1.f22621658.Files;

import java.util.Scanner;

public class HelpCommand implements Command {
    public String execute(Filework filework, Scanner scanner, String content) {
        System.out.println("The following commands are supported:");
        System.out.println("open <file>    - opens <file>");
        System.out.println("close          - closes currently opened file");
        System.out.println("save           - saves the currently open file");
        System.out.println("saveas <file>  - saves the currently open file in <file>");
        System.out.println("help           - prints this information");
        System.out.println("exit           - exits the program");
        return content;
    }
}
