package bg.tu_varna.sit.a1.f22621658;

import bg.tu_varna.sit.a1.f22621658.fileCommands.*;

import java.io.IOException;
import java.util.*;

public class Application {
    public static void main(String[] args) {

        try {
            System.out.println("Welcome to Ticket Station ");
            System.out.println("For a list of commands type 'help' ");

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
            fileCommands.put("check",new CheckCommand());
            fileCommands.put("report",new ReportCommand());
            fileCommands.put("mostviewed",new MostViewedCommand());

            Calendars calendars=new Calendars();
            Scanner scanner = new Scanner(System.in);
            String choice;

            do {
                System.out.print("Enter a command: ");
                String line= scanner.nextLine();
                String[] param=line.split(" ");
                choice = param[0].toLowerCase();

                if (fileCommands.containsKey(choice)) {
                    if (choice.equals("open")){
                        OpenCommand.filename=param[1];
                    } else if (choice.equals("close")) {
                        OpenCommand.filename=null;
                    }

                    Command command = fileCommands.get(choice);
                    calendars=command.execute(param,calendars);
                } else {
                    System.out.println("Invalid choice. Please enter a supported command!");
                }
            } while (!choice.equals("exit"));

            scanner.close();

        }catch (IndexOutOfBoundsException b){
            System.out.println("You didnt enter the needed parameters for the command! ");
            System.out.println("Ïf you dont know what the command need, first use 'help' next time! ");
        }
        catch (IOException e){
            System.out.println("Exception!");
            e.printStackTrace();
        }

    }
}
