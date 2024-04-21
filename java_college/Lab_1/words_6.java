import java.util.*;

public class words_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String l = sc.nextLine();
        int word = 1;
        for (int i = 0; i < l.length(); i++) {
            if (l.charAt(i) == '\s') {
                word++;
            }
        }
        System.out.println("The number of words in the given line is " + word);
        sc.close();
    }
}
