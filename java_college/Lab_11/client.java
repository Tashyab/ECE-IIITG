import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.util.Scanner;

class SearchFile implements FilenameFilter {
    String initials;

    SearchFile(String in) {
        this.initials = in;
    }

    public boolean accept(File dir, String name) {
        return name.equalsIgnoreCase(this.initials);
    }
}

public class client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of file you want to search: ");
        String fname = sc.nextLine();

        SearchFile filename = new SearchFile(fname);
        // String dir = "C:\\Users\\Acer\\3D Objects\\Projects\\java_college";
        // File directory = new File(dir);
        // String[] flist = directory.list(filename);

            int wc = 0, lc = 0;
            for (String f : flist) {
                fname = dir + "\\" + f;
                System.out.println("File Path: " + fname);
                try {
                    File file = new File(fname);
                    Scanner fileReader = new Scanner(file);
                    String data = " ";
                    while (fileReader.hasNextLine()) {
                        data = data + fileReader.nextLine();
                        lc += 1;
                    }

                    for (int i = 0; i < data.length(); i++) {
                        if (data.charAt(i) == '\n' || data.charAt(i) == ' ' || data.charAt(i) == '.') {
                            wc += 1;
                        }
                    }

                    System.out.println("Word Count: " + wc);
                    System.out.println("Line Count: " + lc);
                } catch (FileNotFoundException e) {
                    System.out.println("File not found.");
                }
            }
        }
    }
}
