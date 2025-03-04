import java.util.*;
public class gcd {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        int gcd = 1;
        if (n1 == 0)
            System.out.printf("The gcd is %d", n2);
        else if (n2 == 0)
            System.out.printf("The gcd is %d", n1);
        else {
            int i;
            for (i = 1; i <= n1 && i <= n2; i++) {
                if (n1 % i == 0 && n2 % i == 0)
                {
                    gcd = i;
                }
            }
            System.out.printf("The gcd is %d", gcd);
        }
        sc.close();
    }
}
