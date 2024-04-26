package bg.tu_varna.sit.a1.f22621658;

import bg.tu_varna.sit.a1.f22621658.fileCommands.*;

import java.io.IOException;
import java.util.*;

public class Application {
    public static void main(String[] args) {
        try {
            Map<String, Command> fileCommands = new HashMap<>();
            fileCommands.put("open", new OpenCommand());
            fileCommands.put("close", new CloseCommand());
            fileCommands.put("save", new SaveCommand());
            fileCommands.put("saveas", new SaveAsCommand());
            fileCommands.put("help", new HelpCommand());
            fileCommands.put("exit", new ExitCommand());
            fileCommands.put("addevent",new AddEventCommand());
            fileCommands.put("freeseats",new FreeSeatsCommand());
            fileCommands.put("book",new BookCommand());
            fileCommands.put("unbook",new UnBookCommand());
            fileCommands.put("buy",new BuyCommand());
            fileCommands.put("bookings",new BookingsCommand());
            fileCommands.put("show",new Show());

            String content = null;
            String filename=null;

            Scanner scanner = new Scanner(System.in);
            String choice;

            do {
                System.out.print("Enter your choice: ");
                choice = scanner.next().toLowerCase();

                if (fileCommands.containsKey(choice)) {
                    if (choice.equals("open")){
                        filename=scanner.next();
                    } else if (choice.equals("close")) {
                        filename=null;
                    }
                    Command command = fileCommands.get(choice);
                    content = command.execute(filename, scanner, content);
                } else {
                    System.out.println("Invalid choice. Please enter a supported command!");
                }
            } while (!choice.equals("exit"));

            scanner.close();
        }catch (IOException e){
            e.printStackTrace();
        }




    }
}
