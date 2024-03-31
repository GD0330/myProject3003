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

            Filework myFile = new Filework();
            String content = null;

            Scanner scanner = new Scanner(System.in);
            String choice;

            do {
                System.out.print("Enter your choice: ");
                choice = scanner.next().toLowerCase();

                if (commands.containsKey(choice)) {
                    Command command = commands.get(choice);
                    content = command.execute(myFile, scanner, content);
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
