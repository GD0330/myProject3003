package bg.tu_varna.sit.a1.f22621658.fileCommands;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class OpenCommand implements Command {
        @Override
        public String execute(String filename, Scanner scanner, String content) throws IOException {
            File file = new File(filename);
            if (!file.exists()) {
                if (file.createNewFile()) {
                    System.out.println("File created successfully.");
                } else {
                    throw new IOException("Failed to create the file.");
                }
            }
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            StringBuilder rawContent = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                rawContent.append(line);
            }
            reader.close();
            System.out.println("File opened successfully.");
            return rawContent.toString();
        }
}
