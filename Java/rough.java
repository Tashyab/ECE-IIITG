import java.util.*;

class rough {

    static int yearOf(String dob) {
        String year = dob.substring(4);
        int yr = Integer.parseInt(year);
        return yr;
    }

    static int compare(String u1, String u2) {
        if (yearOf(u1) > yearOf(u2)) {
            return 1;
        } else if ((yearOf(u1)) == (yearOf(u2))) {
            return 0;
        } else {
            return -1;
        }
    }
    
    static int isLeap(int yr) {
        if (yr % 4 == 0) {
            if (yr % 100 == 0) {
                if (yr % 400 == 0)
                    return 1;
                else
                    return 0;
            }
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String("java");
        str = str + "tpoint";
        StringBuilder sb = new StringBuilder(20);
        sb.append(str);
        System.out.println(sb);
        sb.insert(5, "ea");
        System.out.println(sb);
        sb.delete(0, 4);
        System.out.println(sb);
        sb.deleteCharAt(4);
        System.out.println(sb);
        sb.replace(0, 3, "coffee");
        System.out.println(sb);
        sb.insert(6, " ");
        System.out.println(sb);
        String st = new String(sb);
        String[] tokens = st.split(" ");
        for (String token : tokens) {
            System.out.print(token + " ");
            System.out.println(token.matches("[a-o]*"));
        }

        int a = 4;
        int b = sc.nextInt();
        try {
            int c = a/b;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.print("Whatever");
        }

    }
}
