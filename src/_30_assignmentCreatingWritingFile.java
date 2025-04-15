import java.io.*;
import java.util.Scanner;

public class _30_assignmentCreatingWritingFile {
    public static void main(String[] args) {
    try
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value you want to Write in the new File: ");
        String data = sc.nextLine();
        System.out.println(data);

//        java.io.File file = new java.io.File("test.txt");
        File f = new File("test.txt");
        if (f.createNewFile()){
            System.out.println("File" + f.getName() + " created successfully");
        }
        else {
            System.out.println("Couldn't Create file.");
        }

        FileWriter writer = new FileWriter(f);
        writer.write(data);
        writer.close();
        System.out.println("Successfully written to file.");

        BufferedReader reads = new BufferedReader(new FileReader(f));
        String line;
        System.out.print("File content:");
        while ((line = reads.readLine()) != null){
            System.out.println(line);
        }
    }
    catch (IOException e){
        System.out.println("An error Occurred NOOB.");

    }finally{
        System.out.println("Code Stopped.");
    }
    }
}
