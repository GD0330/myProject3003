package bg.tu_varna.sit.a1.f22621658;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        try {
            String command = "";
            String commandSecond = "";

            while (!command.equals("exit")) {
                System.out.println("Enter a command: ");
                Scanner sc = new Scanner(System.in);
                command = sc.next();
                switch (command) {
                    case "open":
                        String fileName = sc.next();
                        FileWriter file = new FileWriter(fileName, true);

                        while(!commandSecond.equals("close")) {

                            System.out.println("Enter a command: ");
                            commandSecond = sc.next();

                            switch (commandSecond) {
                                case "close":

                                    file.close();
                                    break;
                                case "save":

                                    break;
                                case "saveas":

                                    break;
                                case "help":
                                    System.out.println("The following commands are supported:");
                                    System.out.println("Open <file>          opens <file>");
                                    System.out.println("Close                closes currently opened file");
                                    System.out.println("Save                 saves the currently open file");
                                    System.out.println("Save As <file>       saves the currently open file in <file>");
                                    System.out.println("Help                 prints this information");
                                    System.out.println("Exit                 exists the program");
                                    break;
                                case "exit":
                                    System.out.println("Firs close te file! ");
                                    break;
                                default:
                                    System.out.println("No such command. Try again!");
                            }
                        }
                        break;
                    case "close","save","saveas":
                        System.out.println("You should open a file first! ");
                        break;
                    case "help":
                        System.out.println("The following commands are supported:");
                        System.out.println("Open <file>          opens <file>");
                        System.out.println("Close                closes currently opened file");
                        System.out.println("Save                 saves the currently open file");
                        System.out.println("Save As <file>       saves the currently open file in <file>");
                        System.out.println("Help                 prints this information");
                        System.out.println("Exit                 exists the program");
                        break;
                    case "exit":
                        System.out.println("Exiting the program...\n");
                        sc.close();
                        break;
                    default:
                        System.out.println("No such command. Try again!");
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }




    }
}
