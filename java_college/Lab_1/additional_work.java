import java.util.Scanner;

public class additional_work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a paragraph, Enter <end> to exit- ");
        String str = "";
        int lines = 0;
        while (sc.hasNext()) {
            String s = sc.nextLine();
            if (s.equals("<end>"))
                break;
            else if (isDate(s) == 1)
            {
                s = calendar(s);
                lines--;
            }
            str = str + "\n" + s;
            lines++;
        }
        System.out.println("The paragrph is-" + str);
        System.out.println("The number of lines is " + lines);
        sc.close();
    }

    public static int isDate(String s) {
        String[] date = s.split("/");
        int n;
        try {
            n = Integer.parseInt(date[0]);
            n = Integer.parseInt(date[1]);
            n = Integer.parseInt(date[2]);

        } catch (Exception e) {
            return 0;
        }
        return 1 - n + n;
    }

    public static int isLeap(int yr) {
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

    public static String calendar(String s) {
        String[] date = s.split("/");
        String suff = "";
        if (date[0].endsWith("11") || date[0].endsWith("12") ||
                date[0].endsWith("13")) {
            suff = "th";
        } else if (date[0].endsWith("1")) {
            suff = "st";
        } else if (date[0].endsWith("2")) {
            suff = "nd";
        } else if (date[0].endsWith("3")) {
            suff = "rd";
        }
        else {
            suff = "th";
        }
        String day = date[0] + suff;

        int d = Integer.parseInt(date[0]);
        int m = Integer.parseInt(date[1]);
        int y = Integer.parseInt(date[2]);
        String month = "";

        if (m >= 1 && m <= 12) {
            if (d <= 31 && d >= 1) {
                if (date[1].equals("1") || date[1].equals("01"))
                    month = "January";
                else if (date[1].equals("3") || date[1].equals("03"))
                    month = "March";
                else if (date[1].equals("5") || date[1].equals("05"))
                    month = "May";
                else if (date[1].equals("7") || date[1].equals("07"))
                    month = "July";
                else if (date[1] == "8" || date[1].equals("08"))
                    month = "August";
                else if (date[1].equals("10"))
                    month = "October";
                else if (date[1].equals("12"))
                    month = "December";
            } else {
                System.out.println("Invalid day");
                return "\0";
            }

            if ((isLeap(y) == 1 && d <= 29 && d >= 1) || (isLeap(y) == 0 && d <= 28 && d >= 1)) {
                if (date[1].equals("2") || date[1].equals("02"))
                    month = "February";
            } else {
                System.out.println("Invalid day");
                return "\0";
            }

            if (d <= 30 && d >= 1) {
                if (date[1].equals("4") || date[1].equals("04"))
                    month = "April";
                else if (date[1].equals("6") || date[1].equals("06"))
                    month = "June";
                else if (date[1].equals("9") || date[1].equals("09"))
                    month = "September";
                else if (date[1].equals("11"))
                    month = "November";
            } else {
                System.out.println("Invalid day");
                return "\0";
            }
        } else {
            System.out.println("<Invalid month>!");
            return "\0";
        }

        String alph_date = day + " " + month + ", " + date[2];
        return alph_date;
    }
}
