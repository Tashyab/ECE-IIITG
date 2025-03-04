import java.util.*;
public class place_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int st[] = new int[n];
        int ah[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.printf("Enter the PSC of student %d: ", i + 1);
            int psc = sc.nextInt();
            st[i] = psc;
            int st_ah = 0;
            for (int j = 0; j < i; j++) {
                if (st[j] > st[i]) {
                    st_ah++;
                }
                ah[i] = st_ah;
            }
        }
        for (int i = 0; i < n; i++)
        {
            System.out.printf("%d ", ah[i]);
        }
        
        sc.close();

    }
}
