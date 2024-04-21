import java.util.*;
import java.io.*;
// import java.util.concurrent.TimeUnit;

public class filing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create new file
        File newfile = new File("newfile.txt");
        try {
            newfile.createNewFile();
        }
        catch(IOException e) {
            System.out.println("Can't Create new file");
            e.printStackTrace();
        }

        // Write file
        try { 
            FileWriter fw = new FileWriter("newfile.txt");
            fw.write("Lets write this fucking file. you. yo. youuu. yooo\nOk now bye.");
            fw.close(); // must close
        }
        catch (IOException e) {
            System.out.println("Can't write the file.");
            e.printStackTrace();
        }
        
        // Read file
        String fileCont="";
        try {
            //Usomg Scammer
            /*Scanner fr = new Scanner(newfile);
            while(fr.hasNextLine()) {
                String line = fr.nextLine();
                fileCont = fileCont + line + "\n";
            }
            System.out.print(fileCont);
            fr.close();*/

            FileReader fr = new FileReader(newfile);
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char)i);
            }
            
            fr.close(); // must close
        }
        catch (IOException e) {
            System.out.println("Can't read this file.");
            e.printStackTrace();
        }
        
        System.out.println("Completing reading operation before deleting."); // Time delay in java
        try {
            // TimeUnit.SECONDS.sleep(2);
            Thread.sleep(2000);
            
        }
        catch (Exception e) {
            System.out.println("Can't wait, In hurry!");
        }

        // Delete file
        if (newfile.delete()) {
            System.out.println("File created, written, read and now deleted.");
        }
        else {
            System.out.println("Can't delete file, file went rougue.");
        }

        sc.close();
    }
}
