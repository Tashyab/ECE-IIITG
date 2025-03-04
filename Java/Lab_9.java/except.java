import java.util.*;
class User {
    protected int userID;
    protected String name;
    protected String dateOfBirth;
    protected String address;
    protected String pan;

    public static ArrayList<Item> it = new ArrayList<Item>();
    public static ArrayList<Item> sellList = new ArrayList<Item>();
    public static ArrayList<Item> returnList = new ArrayList<Item>();
    public static ArrayList<Item> foodList = new ArrayList<Item>();
    User() {

    }

    User(int uid, String nm, String dob, String add, String pn) {
        this.userID = uid;
        this.name = nm;
        this.dateOfBirth = dob;
        this.address = add;
        this.pan = pn;
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

    public void modifyStock(int itcode) {
        Scanner sc = new Scanner(System.in);
        for (Item item : itlist) {
            if (itcode == item.itemCode) {
                System.out.println("Enter the new price, if the price is same press Enter ");
                try {
                    int pr = sc.nextInt();
                    item.price = pr;
                } catch (Exception e) {

                }
                System.out.println("Enter the new quantity: ");
                int qu = sc.nextInt();
                item.availabeQty = qu;
            }
        }
    }

}

class FoodItemReturnException extends Exception {
    public FoodItemReturnException(String str) {
        super(str);
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
                Sell newsell = new Sell(dt, itcode, qu, amount);
                sellList.add(newsell);
            }
        }
        sc.close();
        //modify stock
    }

    public void returnItem(int itcode, int qu) {
        Scanner sc = new Scanner(System.in);
        for (Item item : foodList) {
            if (itcode == item.itemCode) {
                try {
                    throw new FoodItemReturnException("FoodItemReturnException");
                }
                catch (FoodItemReturnException fire) {
                    System.out.println(fire.getMessage());
                    System.out.println("Food Items can not be returned");
                }
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
        }
        sc.close();
        //modify stock
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
    protected int itemCode;
    protected int price;
    protected int availabeQty;

    Item() {

    }

    Item(int code, int pr, int avail) {
        this.itemCode = code;
        this.price = pr;
        this.availabeQty = avail;
    }
}

class FoodItem extends Item {
    protected String dateOfExpiry;

    FoodItem() {

    }

    FoodItem(int code, int pr, int avail, String exp) {
        super(code, pr, avail);
        this.dateOfExpiry = exp;
    }

}

class NonFoodItem extends Item {
    protected int returnCount;

    NonFoodItem() {

    }

    NonFoodItem(int code, int pr, int avail, int rcount) {
        super(code, pr, avail);
        this.returnCount = rcount;
    }
}

class Sell {
    protected String dateOfSell;
    protected int itemCode;
    protected int quantity;
    protected int totalAmount;

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
    protected String dateOfReturn;
    protected int itemCode;
    protected int quantity;
    protected int returnAmount;

    Return() {

    }

    Return(String dreturn, int itcode, int qu, int ramount) {
        this.dateOfReturn = dreturn;
        this.itemCode = itcode;
        this.quantity = qu;
        this.returnAmount = ramount;
    }
}

class except {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Admin ad =  new Admin(110, "Gawd", "12102002", "Roof Street", "ETYC1293", "19112022", 2600000, 100)
        General gl = new General(121, "Normie", "21092003", "Window Colony", "AC1I121", "");
    }
}
