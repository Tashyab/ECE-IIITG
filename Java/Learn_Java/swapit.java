import java.util.*;

public class swapit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the value of n2: ");
        int n2 = sc.nextInt();

        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.printf("The new value of n1 is %d\n", n1);
        System.out.printf("The new value of n2 is %d\n", n2);
        sc.close();
    }
}
