import java.util.*;

public class calc_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = a + b;
        System.out.println("The sum is: " + s);
        int d = a - b;
        System.out.println("The difference is: " + d);
        sc.close();
    }
}
