import java.util.*;

public class pal_2 {
    public static int isPal(int n)
    {
        int temp = n;
        int rev = 0;
        while(n>0)
        {
            int dig = n % 10;
            rev = rev * 10 + dig;
            n = n / 10;
        }
        if (temp == rev) {
            return 1;
        }
        else {
            return 0;
        }
    }
    public static int pal(int n)
    {
        while(true)
        {
            if (isPal(n) == 1)
                return n;
            n++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the the number of pal. numbers you want to enter: ");
        int l = sc.nextInt();
        // System.out.println(isPal(l));
        int arr[] = new int[l];
        for (int i = 0; i < l; i++)
        {
            int num = sc.nextInt();
            arr[i] = num;
        }
        for (int i = 0; i < l; i++)
        {
            System.out.printf("%d ", pal(arr[i]));
        }
        sc.close();
    }
}