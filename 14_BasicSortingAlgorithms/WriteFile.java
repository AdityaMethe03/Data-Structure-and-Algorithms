import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        // Provide the path for the new file
        String filePath = "example.txt";

        // Data to be written to the file
        String data = "Hello, this is some data that we are writing to the file.";

        // Create and write to the file
        writeToFile(filePath, data);

        System.out.println("Data has been written to the file: " + filePath);
    }

    private static void writeToFile(String filePath, String data) {
        try {
            // Create a File object
            File file = new File(filePath);

            // Create the file if it doesn't exist
            if (!file.exists()) {
                if (file.createNewFile()) {
                    System.out.println("File created: " + filePath);
                } else {
                    System.out.println("Unable to create the file.");
                    return;
                }
            }

            // Use FileWriter and BufferedWriter for efficient writing
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                // Write the data to the file
                writer.write(data);
            }

        } catch (IOException e) {
            // Handle IOException
            e.printStackTrace();
        }
    }
}
