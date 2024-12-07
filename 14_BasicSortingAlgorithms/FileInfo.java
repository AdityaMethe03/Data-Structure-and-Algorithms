import java.io.File;

public class FileInfo {
    public static void main(String[] args) {
        // Provide the path to the file or directory as a command line argument
        if (args.length != 1) {
            System.out.println("Usage: java FileInfo <file_or_directory_path>");
            System.exit(1);
        }

        // Create a File object with the provided path
        File fileOrDir = new File(args[0]);

        // Check if the file or directory exists
        if (!fileOrDir.exists()) {
            System.out.println("The specified file or directory does not exist.");
            System.exit(1);
        }

        // Display information about the file or directory
        displayFileInfo(fileOrDir);
    }

    private static void displayFileInfo(File file) {
        System.out.println("Information about: " + file.getAbsolutePath());
        System.out.println("-------------------------------");
        System.out.println("Name: " + file.getName());
        System.out.println("Path: " + file.getPath());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("Is Directory: " + file.isDirectory());
        System.out.println("Is File: " + file.isFile());
        System.out.println("Size: " + file.length() + " bytes");

        // Additional information for directories
        if (file.isDirectory()) {
            System.out.println("Contents of the directory:");
            String[] contents = file.list();
            if (contents != null) {
                for (String content : contents) {
                    System.out.println(content);
                }
            } else {
                System.out.println("Unable to list contents of the directory.");
            }
        }
    }
}
