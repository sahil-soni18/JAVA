
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/*
 * File Handling
Why File Handling?
File handling allows you to:

Store data persistently outside of your program.
Read data from files for processing.
Write data into files for reporting or logging purposes.
Key Classes in java.io Package:
File: Represents file and directory pathnames.
FileReader/FileWriter: For reading/writing text files.
BufferedReader/BufferedWriter: For efficient reading/writing of large files.
PrintWriter: For writing formatted text.
FileInputStream/FileOutputStream: For reading/writing binary files.
 */

public class File_Handling_Intro {
    public static void main(String[] args) {
        // File file = new File("Intro.txt");
        // try {
        //     if (file.createNewFile()) {
        //         System.out.println("File created: " + file.getName());
        //     } else {
        //         System.out.println("File already exists.");
        //     }
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println("An error occurred.");
        //     e.printStackTrace();
        // }

        // // Writing Into The File:
        // try {
        //     FileWriter writer = new FileWriter("Intro.txt");
        //     writer.write(
        //         "File Handling\n"
        //         + "Why File Handling?\n"
        //         + "File handling allows you to:\n\n"
        //         + "1. Store data persistently outside of your program.\n"
        //         + "2. Read data from files for processing.\n"
        //         + "3. Write data into files for reporting or logging purposes.\n\n"
        //         + "Key Classes in java.io Package:\n"
        //         + "1. File: Represents file and directory pathnames.\n"
        //         + "2. FileReader/FileWriter: For reading/writing text files.\n"
        //         + "3. BufferedReader/BufferedWriter: For efficient reading/writing of large files.\n"
        //         + "4. PrintWriter: For writing formatted text.\n"
        //         + "5. FileInputStream/FileOutputStream: For reading/writing binary files."
        //     );
        //     writer.close();
        //     System.out.println("Successfully wrote to the file.");
        // } catch (Exception e) {
        //     System.out.println("An error occurred.");
        //     e.printStackTrace();
        // }

        // Reading From The File:
        // try {
        //     BufferedReader reader = new BufferedReader(new FileReader("Intro.txt"));
        //     String line;
        //     while ((line = reader.readLine()) != null) {
        //         System.out.println(line);
        //     }
        //     reader.close();
        //     System.out.println("Successfully read from the file.");

        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println("An error occurred.");
        //     e.printStackTrace();
        // }

        // Appending to the file:

        // try {
        //     FileWriter writer = new FileWriter("Intro.txt", true);
        //     writer.write("\n\nAppending to the file.");
        //     writer.close();
        //     System.out.println("Successfully appended to the file.");
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println("An error occurred.");
        //     e.printStackTrace();
        // }

        // Delete the file:

        // try {
        //     File file = new File("Intro.txt");
        //     if (file.delete()) {
        //         System.out.println("Deleted the file: " + file.getName());
        //     } else {
        //         System.out.println("Failed to delete the file.");
        //     }
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println("An error occurred.");
        // }

        // Copy the file:

        try {
            FileInputStream in = new FileInputStream("Intro.txt");
            FileOutputStream out = new FileOutputStream("Intro_Copy.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            in.close();
            out.close();
            System.out.println("Successfully copied the file.");

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        
        

    }
}
