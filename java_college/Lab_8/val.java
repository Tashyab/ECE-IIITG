import java.util.*;

class User {
    protected String name;
    protected String date_of_birth;
    protected int userid;
    protected int pin;
    protected String pan;
    protected String email;
    public static ArrayList<User> ls = new ArrayList<User>();

    User() {
    }

    User(String nm, String dob, int id, String pan, int pin, String em) {
        this.name = nm;
        this.date_of_birth = dob;
        this.userid = id;
        this.pin = pin;
        this.pan = pan;
        this.email = em;
    }

    public void setDetails(String nm, String date, String panno, int pinno, String em) {
        name = nm;
        date_of_birth = date;
        pin = pinno;
        pan = panno;
        email = em;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + date_of_birth);
        System.out.println("User id: " + userid);
        System.out.println("Pincode: " + pin);
        System.out.println("Pan no.: " + pan);
        System.out.println("Email: " + email);
    }

    public int isLeap(int yr) {
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

    public boolean verify_pan() {
        for (int i = 0; i < pan.length(); i++) {
            if (Character.isDigit(pan.charAt(i)) || Character.isUpperCase(pan.charAt(i))) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean verify_pin() {
        if ((pin / 100000 < 10) && (pin / 100000 > 0)) {
            return true;
        }
        return false;
    }

    public boolean verify_date() {
        String mn = date_of_birth.substring(0, 2);
        int month = Integer.parseInt(mn);
        String d = date_of_birth.substring(2, 4);
        int day = Integer.parseInt(d);
        String yr = date_of_birth.substring(4, 8);
        int year = Integer.parseInt(yr);
        if ((month > 0 && month <= 12) && (year >= 1000 && year < 2023)) {
            if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10)
                    || (month == 12)) {
                if ((day > 0) && (day <= 31)) {
                    return true;
                }
            } else if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
                if ((day > 0) && (day <= 30)) {
                    return true;
                }
            } else if (month == 2) {
                if (isLeap(year) == 1) {
                    if ((day > 0) && (day <= 29)) {
                        return true;
                    }
                } else {
                    if ((day > 0) && (day <= 28)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

class IdComparator implements Comparator<User> {
    public int compare(User u1, User u2) {
        if (u1.userid > u2.userid) {
            return 1;
        } else if (u1.userid == u2.userid) {
            return 0;
        } else {
            return -1;
        }
    }
}

class BirthYearComparator implements Comparator<User> {
    public int yearOf(String dob) {
        String year = dob.substring(4);
        int yr = Integer.parseInt(year);
        return yr;
    }

    public int compare(User u1, User u2) {
        if (yearOf(u1.date_of_birth) > yearOf(u2.date_of_birth)) {
            return 1;
        } 
        else if ((yearOf(u1.date_of_birth)) == (yearOf(u2.date_of_birth))) {
            return 0;
        } 
        else {
            return -1;
        }
    }
}

final class Student extends User {
    private int roll;
    private int semester;
    private double cpi;
    public static ArrayList<Student> sal = new ArrayList<Student>();

    Student() {
    }

    Student(String nm, String dob, int id, String pan, int pin, String em, int roll, int sem, double cpi) {
        super(nm, dob, id, pan, pin, em);
        this.roll = roll;
        this.semester = sem;
        this.cpi = cpi;
    }

    public void setDetails(String nm, String date, int rollno, String panno, int pinno, String em, int sem,
            double s_cpi) {
        super.setDetails(nm, date, panno, pinno, em);
        roll = rollno;
        semester = sem;
        cpi = s_cpi;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("User#Student");
        System.out.println("Roll: " + roll);
        System.out.println("Semester: " + semester);
        System.out.println("CPI: " + cpi);
    }
}

final class Staff extends User {
    private int eid;
    private String sector;
    private String designation;
    public static ArrayList<Staff> stal = new ArrayList<Staff>();

    Staff() {
    }

    Staff(String nm, String dob, int id, String pan, int pin, String em, int eid, String sec, String des) {
        super(nm, dob, id, pan, pin, em);
        this.eid = eid;
        this.sector = sec;
        this.designation = des;
    }

    public void setDetails(String nm, String date, int s_eid, String panno, int pinno, String em, String sec,
            String des) {
        super.setDetails(nm, date, panno, pinno, em);
        eid = s_eid;
        sector = sec;
        designation = des;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("User#Staff");
        System.out.println("Employee ID: " + eid);
        System.out.println("Sector: " + sector);
        System.out.println("Designation:" + designation);
    }
}

final class Faculty extends User {
    private int eid;
    private String dep_name;
    private int no_ofpub;

    public static ArrayList<Faculty> fal = new ArrayList<Faculty>();

    Faculty() {
    }

    Faculty(String nm, String dob, int id, String pan, int pin, String em, int eid, String dname, int nop) {
        super(nm, dob, id, pan, pin, em);
        this.eid = eid;
        this.dep_name = dname;
        this.no_ofpub = nop;
    }

    public void setDetails(String nm, String date, String panno, int pinno, String em, int f_eid, String dname,
            int nop) {
        super.setDetails(nm, date, panno, pinno, em);
        eid = f_eid;
        dep_name = dname;
        no_ofpub = nop;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("User#Faculty");
        System.out.println("Employee ID: " + eid);
        System.out.println("Department Name: " + dep_name);
        System.out.println("Number of publications:" + no_ofpub);
    }
}

class val {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student tr = new Student("Tashyab", "10092002", 233, "EYCPR3465", 800023, "tashyab.raj21b@iiitg.ac.in", 2101214,
                3, 8.3);
        Staff sr = new Staff("Dhanjeet", "07091994", 13, "AWXOT1297", 110223, "canteen@iiitg.ac.in", 2191, "Canteen",
                "chef");
        Faculty fr = new Faculty("Shyamal", "12121987", 743, "UTRYN8273", 200311, "shyamal@iiitg.ac.in", 98,
                "Mathematics", 2);
        User.ls.add(tr);
        Student.sal.add(tr);
        User.ls.add(sr);
        Staff.stal.add(sr);
        User.ls.add(fr);
        Faculty.fal.add(fr);

        System.out.println("Menu:");
        System.out.println("1. Create new user\n2. Display Details\n3. Sort\n0. Exit\n");
        while (true) {
            System.out.print("Enter Choice: ");
            int ch = sc.nextInt();
            System.out.println();
            int flag = 0;
            switch (ch) {
                case 1:
                    sc.nextLine();
                    System.out.println("Enter user name: ");
                    String nm = sc.nextLine();
                    System.out.println("Enter user id: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter email id: ");
                    String email = sc.nextLine();
                    System.out.println("Enter user Date of birth: ");
                    String dob = sc.nextLine();
                    System.out.println("Enter pan No.: ");
                    String pan = sc.nextLine();
                    System.out.println("Enter pin code: ");
                    int pin = sc.nextInt();
                    User u = new User(nm, dob, id, pan, pin, email);
                    sc.nextLine();
                    while (true) {
                        System.out.println();
                        if (u.verify_date() == false) {
                            System.out.println("Wrong DOB");
                            System.out.println("Enter DOB again: ");
                            dob = sc.nextLine();
                            u.date_of_birth = dob;
                            continue;
                        }
                        if (u.verify_pan() == false) {
                            System.out.println("Wrong pan no.");
                            System.out.println("Enter pan no. again: ");
                            pan = sc.nextLine();
                            u.pan = pan;
                            continue;
                        }
                        if (u.verify_pin() == false) {
                            System.out.println("Wrong pin no.");
                            System.out.println("Enter pin no. again: ");
                            pin = sc.nextInt();
                            u.pin = pin;
                            continue;
                        }
                        break;
                    }
                    while (true) {
                        System.out.println("Enter role code.\n1. Student\n2. Staff\n3. Faculty");
                        int code = sc.nextInt();

                        switch (code) {
                            case 1:
                                System.out.println("Enter roll number: ");
                                int roll = sc.nextInt();
                                System.out.println("Enter semester: ");
                                int sem = sc.nextInt();
                                System.out.println("Enter CPI: ");
                                double cpi = sc.nextDouble();
                                Student st = new Student(nm, dob, id, pan, pin, email, roll, sem, cpi);
                                Student.ls.add(st);
                                Student.sal.add(st);
                                break;
                            case 2:
                                System.out.println("Enter employee id: ");
                                int s_eid = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Enter Sector: ");
                                String sec = sc.nextLine();
                                System.out.println("Enter Designation: ");
                                String des = sc.nextLine();
                                Staff staff = new Staff(nm, dob, id, pan, pin, email, s_eid, sec, des);
                                Staff.ls.add(staff);
                                Staff.stal.add(staff);
                                break;
                            case 3:
                                System.out.println("Enter employee id: ");
                                int f_eid = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Enter department: ");
                                String dep = sc.nextLine();
                                System.out.println("Enter no. of publications: ");
                                int pub = sc.nextInt();
                                Faculty fac = new Faculty(nm, dob, id, pan, pin, email, f_eid, dep, pub);
                                Faculty.ls.add(fac);
                                Faculty.fal.add(fac);
                                break;
                            default:
                                System.out.println("Wrong option!\n");
                                break;
                        }
                        if (code == 1 || code == 2 || code == 3)
                            break;
                    }
                    break;
                case 2:
                    while (true) {
                        System.out.println("Enter the user id: ");
                        int dd = sc.nextInt();
                        for (User user : User.ls) {
                            if (user.userid == dd) {
                                user.showDetails();
                                flag = 1;
                            }
                        }
                        if (flag == 0) {
                            System.out.println("Wrong ID! Try again.");
                        } else {
                            break;
                        }
                    }
                    break;
                case 3:
                    while (true) {
                        flag = 0;
                        System.out.println("Enter the sorted list you want to see.\n1.By ID\n2.By Birthyear");
                        int mc = sc.nextInt();
                        switch (mc) {
                            case 1:
                                Collections.sort(User.ls, new IdComparator());
                                for (User us : User.ls) {
                                    us.showDetails();
                                    System.out.println();
                                }
                                break;
                            case 2:
                                Collections.sort(User.ls, new BirthYearComparator());
                                for (User us : User.ls) {
                                    us.showDetails();
                                    System.out.println();
                                }
                                break;
                            default:
                                System.out.println("Wrong Choice!");
                                flag = 1;
                                break;
                        }
                        if (flag == 0)
                            break;
                    }
                    break;
                default:
                    if (ch != 0) {
                        System.out.println("Wrong Choice!");
                        break;
                    }
            }
            if (ch == 0) {
                break;
            }
        }
        sc.close();
    }
}