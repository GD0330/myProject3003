package bg.tu_varna.sit.a1.f22621658.fileCommands;

import java.util.Scanner;

public class HelpCommand implements Command {
    public String execute(String filename, Scanner scanner, String content) {
        System.out.println("The following commands are supported:");
        System.out.println("open <file>    - opens <file>");
        System.out.println("close          - closes currently opened file");
        System.out.println("save           - saves the currently open file");
        System.out.println("saveas <file>  - saves the currently open file in <file>");
        System.out.println("help           - prints this information");
        System.out.println("exit           - exits the program");
        System.out.println("addevent       - adds new event");
        System.out.println("<date> <name>");
        System.out.println("freeseats      - checks which seats are Free");
        System.out.println("book <name>    - books a seat ");
        System.out.println("<date> <row>");
        System.out.println("<seat> <note>");
        System.out.println("unbook <name>  - cancel a booked seat");
        System.out.println("<date> <row>");
        System.out.println("<seat>");
        System.out.println("buy <name>     - buys a seat");
        System.out.println("<date> <row>");
        System.out.println("<seat>");
        return content;
    }
}
