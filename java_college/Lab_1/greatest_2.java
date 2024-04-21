import java.util.*;
public class greatest_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        int num = sc.nextInt();
        int gr = num;
        for(int i = 0; i<4; i++)
        {
            num = sc.nextInt();
            if(num > gr)
            {
                gr = num;
            }
        }
        System.out.println("The largest number is " + gr);
        sc.close();
    }
}
