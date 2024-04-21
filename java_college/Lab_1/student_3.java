import java.util.*;
public class student_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark;
        int sum = 0;
        // System.out.println("Enter marks of 3 subject: ");
        for(int i = 1; i<=3; i++)
        {
            System.out.printf("Enter mark of subject %d: ", i);
            mark = sc.nextInt();
            sum = sum + mark;
        }
        int avg = sum / 3;
        if(avg>60)
        {
            System.out.print("Good!");
        }
        else if(avg<=60 && avg >= 30)
        {
            System.out.println("OK");
        }
        else
        {
            System.out.print("Poor :|");
        }
        sc.close();
    }
}
