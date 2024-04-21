import java.util.*;

class User {
    protected int userID;
    protected String name;
    protected String dateOfBirth;
    protected String address;
    protected String pan;
    public static ArrayList<Item> itlist = new ArrayList<Item>();
    public static ArrayList<FoodItem> foodList = new ArrayList<FoodItem>();
    public static ArrayList<NonFoodItem> NonFoodList = new ArrayList<NonFoodItem>();
    public static ArrayList<Sell> sellList = new ArrayList<Sell>();
    public static ArrayList<Return> returnList = new ArrayList<Return>();

    User() {

    }

    User(int uid, String nm, String dob, String add, String pn) {
        this.userID = uid;
        this.name = nm;
        this.dateOfBirth = dob;
        this.address = add;
        this.pan = pn;
    }

    protected void modifyStock(int itcode) {
        Scanner sc = new Scanner(System.in);
        for (Item item : itlist) {
            if (itcode == item.itemCode) {
                System.out.println("Enter the new price: ");
                int pr = sc.nextInt();
                item.price = pr;
                System.out.println("Enter the new quantity: ");
                int qu = sc.nextInt();
                item.availabeQty = qu;
            }
        }
    }
}

class Admin extends User {
    protected String dateOfJoining;
    protected int salary;
    protected int permissableOperateions;

    Admin() {

    }

    Admin(int uid, String nm, String dob, String add, String pn, String jdate, int sal, int op) {
        super(uid, nm, dob, add, pn);
        this.dateOfJoining = jdate;
        this.salary = sal;
        this.permissableOperateions = op;
    }

    public void addNewStock(Item it) {
        itlist.add(it);
    }

    public void deleteStock(int itcode) {
        int i = 0;
        for (Item item : itlist) {
            if (itcode == item.itemCode) {
                if (item.availabeQty == 0) {
                    System.out.println("Item unavailable");
                } else {
                    itlist.remove(i);
                    break;
                }
            }
            i++;
        }
    }
}

class General extends User {
    protected String dateOfJoining;
    protected int salary;
    protected int dutyHourPerDay;

    General() {

    }

    General(int uid, String nm, String dob, String add, String pn, String jdate, int sal, int hours) {
        super(uid, nm, dob, add, pn);
        this.dateOfJoining = jdate;
        this.salary = sal;
        this.dutyHourPerDay = hours;
    }

    public void sellItem(int itcode, int qu) {
        Scanner sc = new Scanner(System.in);
        for (Item item : itlist) {
            if (itcode == item.itemCode) {
                System.out.println("Enter date of sell: ");
                String dt = sc.nextLine();
                int amount = qu * item.price;
                if (item.availabeQty != 0) {
                    Sell newsell = new Sell(dt, itcode, qu, amount);
                    sellList.add(newsell);
                }
                modifyStock(itcode);
            }
        }
    }

    public void returnItem(int itcode, int qu) {
        Scanner sc = new Scanner(System.in);
        for (Item item : foodList) {
            if (itcode == item.itemCode) {
                System.out.println("Food Item can't be returned");
                return;
            }
        }
        for (Item item : itlist) {
            if (itcode == item.itemCode) {
                System.out.println("Enter date of return: ");
                String dt = sc.nextLine();
                int amount = qu * item.price;
                Return newreturn = new Return(dt, itcode, qu, amount);
                returnList.add(newreturn);
            }
            modifyStock(itcode);
        }
    }

    public void displaystock(int itcode) {
        for (Item item : itlist) {
            if (itcode == item.itemCode) {
                System.out.println("Item code: " + itcode);
                System.out.println("Item price: " + item.price);
                System.out.println("Item quantity: " + item.availabeQty);
            }
        }
    }

    public int yearOf(String date) {
        String ey = date.substring(4, 6);
        int eyi = Integer.parseInt(ey);
        return eyi;
    }

    public void displaysell(String startDate, String endDate) {
        String sy = startDate.substring(4, 6);
        String ey = endDate.substring(4, 6);

        int syi = Integer.parseInt(sy);
        int eyi = Integer.parseInt(ey);

        for (Sell sitem : sellList) {
            if ((yearOf(sitem.dateOfSell) >= syi) && (yearOf(sitem.dateOfSell)) <= eyi) {
                System.out.println("Item code=" + sitem.itemCode);
                System.out.println(("Item available=" + sitem.quantity));
                System.out.println("Sell date=" + sitem.dateOfSell);
            }
        }
    }
}

class Item {
    int itemCode;
    int price;
    int availabeQty;

    Item() {

    }

    Item(int code, int pr, int avail) {
        this.itemCode = code;
        this.price = pr;
        this.availabeQty = avail;
    }
}

class FoodItem extends Item {
    String dateOfExpiry;

    FoodItem() {

    }

    FoodItem(int code, int pr, int avail, String exp) {
        super(code, pr, avail);
        this.dateOfExpiry = exp;
    }

}

class NonFoodItem extends Item {
    int returnCount;

    NonFoodItem() {

    }

    NonFoodItem(int code, int pr, int avail, int rcount) {
        super(code, pr, avail);
        this.returnCount = rcount;
    }
}

class Sell {
    String dateOfSell;
    int itemCode;
    int quantity;
    int totalAmount;

    Sell() {

    }

    Sell(String dsell, int itcode, int qu, int tamount) {
        this.dateOfSell = dsell;
        this.itemCode = itcode;
        this.quantity = qu;
        this.totalAmount = tamount;
    }
}

class Return {
    String dateOfReturn;
    int itemCode;
    int quantity;
    int returnAmount;

    Return() {

    }

    Return(String dreturn, int itcode, int qu, int ramount) {
        this.dateOfReturn = dreturn;
        this.itemCode = itcode;
        this.quantity = qu;
        this.returnAmount = ramount;
    }
}

public class stock {
    public static void main(String[] args) {

        ArrayList<String> arglist = new ArrayList<String>();
        for (String el : args) {
            arglist.add(el);
        }
        int idad = Integer.parseInt(arglist.get(0));
        int idge = Integer.parseInt(arglist.get(1));
        String name = arglist.get(2);
        String dob = arglist.get(3);
        String pan = arglist.get(4);
        String add = arglist.get(5);

        Admin ad = new Admin(idad, name, dob, add, pan, "12092007", 100000, 6);
        General gk = new General(idge, name, dob, add, pan, "11102012", 30000, 8);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 for admin and 2 for General. ");
        System.out.print("Enter Choice: ");
        int ch = sc.nextInt();
        if (ch == 1) {
            System.out.println("Enter 1 to add stock.\nEnter 2 to delete stock.\nEnter 3 to modify stock.");
            System.out.print("Enter Choice: ");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.println("Enter item code: ");
                    int code = sc.nextInt();
                    System.out.println("Enter price: ");
                    int price = sc.nextInt();
                    System.out.println("Enter Available quantity: ");
                    int qu = sc.nextInt();
                    System.out.println("Enter 1 for fooditem and 2 for non-food item: ");
                    int ce = sc.nextInt();
                    if (ce == 1) {
                        sc.nextLine();
                        System.out.println("Enter expiry date: ");
                        String dt = sc.nextLine();
                        FoodItem fd = new FoodItem(code, price, qu, dt);
                        ad.addNewStock(fd);
                    } else {
                        System.out.println("Enter return count: ");
                        int rc = sc.nextInt();
                        NonFoodItem nf = new NonFoodItem(code, price, qu, rc);
                        ad.addNewStock(nf);
                    }
                    break;

                default:
                    break;
            }
        }
    }
}
