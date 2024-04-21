import java.util.*;

public class cir_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total numbers: ");
        int n = sc.nextInt();
        int temp = n;
        int t = 0;
        while (n != 1) {
            n = n / 2;
            t++;
        }
        if (temp - Math.pow(2, t) == 0) 
        {
            System.out.println("The value is " + temp);
        }
        else 
        {
            int val = (int) (temp - Math.pow(2, t)) * 2;
            System.out.println("The value is " + val);
        }
        sc.close();
    }
}
