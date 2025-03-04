import java.util.Scanner;

import java.util.ArrayList;

class User {
    protected String name;
    protected String date_of_birth;
    protected int userid;
    public static ArrayList<User> ls = new ArrayList<User>();

    User() {
    }

    User(String nm, String dob, int id) {
        this.name = nm;
        this.date_of_birth = dob;
        this.userid = id;
    }

    public void setDetails(String nm, String date) {
        name = nm;
        date_of_birth = date;
    }

    public int yearOf(String dob) {
        String year = dob.substring(6);
        int yr = Integer.parseInt(year);
        return yr;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + date_of_birth);
        System.out.println("User id: " + userid);
    }

    public void showDetails(int year) {
        if (year == yearOf(date_of_birth)) {
            showDetails();
        }
    }
}

class Student extends User {
    private int roll;
    private int semester;
    private double cpi;
    public static ArrayList<Student> sal = new ArrayList<Student>();

    Student() {
    }

    Student(String nm, String dob, int id, int roll, int sem, double cpi) {
        super(nm, dob, id);
        this.roll = roll;
        this.semester = sem;
        this.cpi = cpi;
    }

    public void setDetails(String nm, String date, int rollno, int sem, double s_cpi) {
        super.setDetails(nm, date);
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

class Staff extends User {
    private int eid;
    private String sector;
    private String designation;
    public static ArrayList<Staff> stal = new ArrayList<Staff>();

    Staff() {
    }

    Staff(String nm, String dob, int id, int eid, String sec, String des) {
        super(nm, dob, id);
        this.eid = eid;
        this.sector = sec;
        this.designation = des;
    }

    public void setDetails(String nm, String date, int s_eid, String sec, String des) {
        super.setDetails(nm, date);
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

    public void compare(Staff a, Staff b) {
        if ((a.designation).equalsIgnoreCase(b.designation)) {
            System.out.println("Same designation");
        } else {
            System.out.println("Different designation");
        }
    }
}

class Faculty extends User {
    private int eid;
    private String dep_name;
    private int no_ofpub;

    public static ArrayList<Faculty> fal = new ArrayList<Faculty>();

    Faculty() {
    }

    Faculty(String nm, String dob, int id, int eid, String dname, int nop) {
        super(nm, dob, id);
        this.eid = eid;
        this.dep_name = dname;
        this.no_ofpub = nop;
    }

    public void setDetails(String nm, String date, int f_eid, String dname, int nop) {
        super.setDetails(nm, date);
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

    public void compare(Faculty a, Faculty b) {
        if ((a.dep_name).equalsIgnoreCase(b.dep_name)) {
            System.out.println("Same department");
        } else {
            System.out.println("Different department");
        }
    }
}

class userin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student tr = new Student("Tashyab", "09-10-2002", 11, 2101214, 3, 8.3);
        Staff sr = new Staff("Dhanjeet", "09-07-1994", 33, 2191, "Canteen", "chef");
        Faculty fr = new Faculty("Shyamal", "12-12-1987", 22, 98, "Mathematics", 2);
        User.ls.add(tr);
        Student.sal.add(tr);
        User.ls.add(sr);
        Staff.stal.add(sr);
        User.ls.add(fr);
        Faculty.fal.add(fr);

        System.out.println("Menu:");
        System.out.println("1. Create new user\n2. Display Details\n3. Set Details\n0. Exit\n");
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
                    System.out.println("Enter user Date of birth: ");
                    String dob = sc.nextLine();

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
                                Student st = new Student(nm, dob, id, roll, sem, cpi);
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
                                Staff staff = new Staff(nm, dob, id, s_eid, sec, des);
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
                                Faculty fac = new Faculty(nm, dob, id, f_eid, dep, pub);
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
                        System.out.println("How do you want to search?\nEnter 1 for User ID or 2 for Year of birth.");
                        int chh = sc.nextInt();
                        switch (chh) {
                            case 1:
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
                            case 2:
                                System.out.println("Enter the year: ");
                                int yr = sc.nextInt();
                                for (User user : User.ls) {
                                    user.showDetails(yr);
                                }
                                break;
                            default:
                                System.out.println("Wrong Option!\n");
                                break;
                        }
                        if (chh == 1 || chh == 2) {
                            break;
                        }
                    }
                    break;
                case 3:
                    while (true) {
                        System.out.println("Enter the user id: ");
                        int sd = sc.nextInt();
                        int tf = 0;
                        for (User user : User.ls) {
                            if (user.userid == sd) {
                                tf = 1;
                            }
                        }
                        if (tf == 0) {
                            System.out.println("Wrong user ID! Try again!");
                            continue;
                        }
                        sc.nextLine();
                        System.out.println("Enter user name: ");
                        String nam = sc.nextLine();
                        System.out.println("Enter user Date of birth: ");
                        String dobt = sc.nextLine();

                        for (Student st : Student.sal) {
                            if (st.userid == sd) {
                                System.out.println("Enter roll number: ");
                                int roll = sc.nextInt();
                                System.out.println("Enter semester: ");
                                int sem = sc.nextInt();
                                System.out.println("Enter CPI: ");
                                double cpi = sc.nextDouble();
                                st.setDetails(nam, dobt, roll, sem, cpi);
                                break;
                            }
                        }
                        for (Staff sf : Staff.stal) {
                            if (sf.userid == sd) {
                                System.out.println("Enter employee id: ");
                                int s_eid = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Enter Sector: ");
                                String sec = sc.nextLine();
                                System.out.println("Enter Designation: ");
                                String des = sc.nextLine();
                                sf.setDetails(nam, dobt, s_eid, sec, des);
                                break;
                            }
                        }
                        for (Faculty fac : Faculty.fal) {
                            if (fac.userid == sd) {
                                System.out.println("Enter employee id: ");
                                int f_eid = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Enter department: ");
                                String dep = sc.nextLine();
                                System.out.println("Enter no. of publications: ");
                                int pub = sc.nextInt();
                                fac.setDetails(nam, dobt, f_eid, dep, pub);
                                break;
                            }
                        }
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