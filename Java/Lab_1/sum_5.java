import java.util.*;

public class sum_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum = n % 10 + sum;
            n = n / 10;
        }
        System.out.println("The sum of digits is " + sum);
        sc.close();
    }
}
