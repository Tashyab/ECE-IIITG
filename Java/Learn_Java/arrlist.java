import java.util.*;
public class arrlist {
    public static void main(String[] anything) {
        Scanner sc = new Scanner(System.in);
        
        // System.out.println(anything.length);
        // System.out.println(anything[0]);
        
        ArrayList<Integer> arrl = new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            System.out.printf("Enter number %d:", i + 1);
            int n = sc.nextInt();
            arrl.add(n);
        }
        for (int i = 0; i < arrl.size(); i++) {
            System.out.print(arrl.get(i) + " ");
        }
        System.out.println();
        System.out.println(arrl);

        arrl.remove(2);
        System.out.println(arrl);

        arrl.remove(arrl.get(0));
        System.out.println(arrl);
        sc.close();
    }
}
