import java.util.*;

public class student_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark;
        int sum = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.printf("Enter mark of subject %d: ", i);
            mark = sc.nextInt();
            if (mark < 0) {
                System.out.println("Enter a valid mark!!");
                i--;
                continue;
            }
            sum = sum + mark;
        }
        int avg = sum / 3;
        if (avg > 60) {
            System.out.print("Good!");
        } else if (avg <= 60 && avg >= 30) {
            System.out.println("OK");
        } else {
            System.out.print("Poor :|");
        }
        sc.close();
    }
}
