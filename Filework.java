package bg.tu_varna.sit.a1.f22621658;

import java.io.*;

public class Filework {
    private String filename;

    public Filework() {
        this.filename = null;
    }

    public String OpenFile(String Name)throws IOException {
        filename = Name;
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        StringBuilder content = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }
        reader.close();
        System.out.println("File opened successfully.");
        return content.toString();
    }
    public void SaveFile(String content)throws IOException{
        if (filename == null) {
            System.out.println("No file is currently opened.");
            return;
        }
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            writer.write(content);
            writer.close();
            System.out.println("Changes saved successfully.");
        filename = null;
    }
    public void SaveAsFile(String content,String FileNewName)throws IOException{
        if (filename == null) {
            System.out.println("No file is currently opened.");
            return;
        }
            BufferedWriter writer = new BufferedWriter(new FileWriter(FileNewName));
            writer.write(content);
            writer.close();
            System.out.println("Changes saved successfully to " + FileNewName);
        filename = null;
    }
    public void CloseFile(){
        if (filename == null ) {
            System.out.println("No file is currently opened.");
            return;
        }
        filename = null;
        System.out.println("File closed successfully.");
    }
}
