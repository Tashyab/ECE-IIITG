import java.util.*;
public class switch_7 {
    public static void main(String[] args) {
        System.out.print("Enter a number from 1, 2, 3, 4, 5: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("You entered 1.");
                break;
            case 2:
                System.out.println("You entered 2.");
                break;
            case 3:
                System.out.println("You entered 3.");
                break;
            case 4:
                System.out.println("You entered 4.");
                break;
            case 5:
                System.out.println("You entered 5.");
                break;
            default:
                System.out.println("Number entered does not belong to the set.");
                break;
        }
        sc.close();
    }
}
