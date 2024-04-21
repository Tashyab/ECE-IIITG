import java.util.*;
class Account {
    private int accountNumber;
    private String accountType;
    private String serivceBranchIFSC;
    private float availBalance;
    private float minBalance;
    private int customerID;
    private String customerName;

    Account() {
        customerName = "Unknown";
    }

    public void setDetails(int acn, String act, String ifsc, float avlb, float minb, int cid, String cname) {
        accountNumber = acn;
        accountType = act;
        serivceBranchIFSC = ifsc;
        availBalance = avlb;
        minBalance = minb;
        customerID = cid;
        customerName = cname;
    }

    public void getdetails() {
        System.out.println("Account holders id: " + customerID);
        System.out.println("Account Holders name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("IFSC Code: " + serivceBranchIFSC);
        System.out.println("Available balance: " + availBalance);
        System.out.println("Minimum balance: " + minBalance);
    }

    public void updateDetails(int acn) {

    }
}

public class banking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the bank. How may I help you?");
        Account[] bk = new Account[100];
        bk[0] = new Account();
        bk[0].setDetails(9424, "current", "SBIN0005242", 822344134.28f, 10000.00f, 21342, "IIIT Guwahati");
        sc.close();
    }
}