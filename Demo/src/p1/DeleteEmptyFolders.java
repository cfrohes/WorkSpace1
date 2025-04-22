package p1;
import java.io.File;

public class DeleteEmptyFolders {
    public static void main(String[] args) {
        String directoryPath = "This PC\\vivo 1901\\Internal storage"; // Change this to your target folder
        File directory = new File(directoryPath);
        
        if (directory.exists() && directory.isDirectory()) {
            deleteEmptyFolders(directory);
            System.out.println("Empty folders deleted successfully!");
        } else {
            System.out.println("Directory does not exist or is not a folder.");
        }
    }

    public static void deleteEmptyFolders(File folder) {
        File[] files = folder.listFiles();
        
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteEmptyFolders(file); // Recursive call to check subdirectories
                }
            }
        }

        // Delete the folder if it's empty after checking subdirectories
        if (folder.isDirectory() && folder.list().length == 0) {
            folder.delete();
            System.out.println("Deleted empty folder: " + folder.getAbsolutePath());
        }
    }
}
