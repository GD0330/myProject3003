package bg.tu_varna.sit.a1.f22621658;


import bg.tu_varna.sit.a1.f22621658.Files.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        try {
            Map<String, Command> commands = new HashMap<>();
            commands.put("open", new OpenCommand());
            commands.put("close", new CloseCommand());
            commands.put("save", new SaveCommand());
            commands.put("saveas", new SaveAsCommand());
            commands.put("help", new HelpCommand());
            commands.put("exit", new ExitCommand());

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
