import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) {
        // Provide the path to the file created in Question-02
        String filePath = "example.txt";

        // Read data from the file
        String fileContent = readFromFile(filePath);

        System.out.println("Data read from the file:");
        System.out.println(fileContent);
    }

    private static String readFromFile(String filePath) {
        StringBuilder content = new StringBuilder();

        try {
            // Create a File object
            File file = new File(filePath);

            // Check if the file exists
            if (!file.exists()) {
                System.out.println("The specified file does not exist.");
                return "";
            }

            // Use FileReader and BufferedReader for efficient reading
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
            }

        } catch (IOException e) {
            // Handle IOException
            e.printStackTrace();
        }

        return content.toString();
    }
}
