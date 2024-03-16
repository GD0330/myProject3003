package bg.tu_varna.sit.a1.f22621658;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        try {
            Map<String, String> menuItems = new HashMap<>();
            menuItems.put("open <file>    ", "opens <file>");
            menuItems.put("close          ", "closes currently opened file");
            menuItems.put("save           ", "saves the currently open file");
            menuItems.put("saveas <file>  ", "saves the currently open file in <file>");
            menuItems.put("help           ", "prints this information");
            menuItems.put("exit           ", "exists the program");


            Filework myFile = new Filework();
            String content=null;

            Scanner scanner = new Scanner(System.in);
            String choice;

            do {
                System.out.print("Enter your choice: ");
                choice = scanner.next();

                switch (choice) {
                    case "open":
                        content=myFile.OpenFile(scanner.next());
                        break;
                    case "close":
                        myFile.CloseFile();
                        break;
                    case "save":
                        myFile.SaveFile(content);
                        break;
                    case "saveas":
                        myFile.SaveAsFile(content,scanner.next());
                        break;
                    case "help":
                        System.out.println("The following commands are supported:");
                        for (Map.Entry<String, String> entry : menuItems.entrySet()) {
                            System.out.println(entry.getKey() + " " + entry.getValue());
                        }
                        break;
                    case "exit":
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a supported command! ");
                }
            } while (!choice.equals("exit"));
            scanner.close();
        }catch (IOException e){
            e.printStackTrace();
        }




    }
}
