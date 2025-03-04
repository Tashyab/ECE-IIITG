import java.util.*;
class account {
    private int accountNumber, customerId;
    private float minimumBalance = 500, availableBalance;
    private String accountType, serviceBranchIFSC = "IDB243400D2", customerName;
    public static int totalAccountCreated;

    account(int x) {
        totalAccountCreated += 1;
        serviceBranchIFSC = "IDB243400D2";
        customerId = x;
    }

    Scanner sc = new Scanner(System.in);

    public void setDetails() {
        System.out.print("Enter Account No: ");
        accountNumber = sc.nextInt();
        System.out.print("Enter Account type: ");
        accountType = sc.next();
        System.out.print("Enter Name: ");
        customerName = sc.next();
        System.out.print("Enter Balance: ");
        float bal = sc.nextFloat();
        if (bal >= minimumBalance)
            availableBalance = bal;
        else
            System.out.print("Insufficient amount to open the account");
    }

    public void updateDetails() {
        System.out.print("Enter the NEW Account type: ");
        accountType = sc.next();
        System.out.print("Enter the NEW Name: ");
        customerName = sc.next();
    }

    public void getDetails() {
        System.out.println("Name of account holder: " + customerName);
        System.out.println("Account no.: " + accountNumber);
        System.out.println("Account type: " + accountType);
        System.out.println("Balance: " + availableBalance);
        System.out.println("Customer Id: " + customerId);
        System.out.println("Branch IFSC code: " + serviceBranchIFSC);

    }

    public void deposit() {
        float amt;
        System.out.println("Enter the amount you want to deposit: ");
        amt = sc.nextFloat();
        availableBalance = availableBalance + amt;
    }

    public void withdrawal() {
        float amt;
        System.out.println("Enter the amount you want to withdraw: ");
        amt = sc.nextLong();
        if (availableBalance >= amt) {
            availableBalance = availableBalance - amt;
            System.out.println("Balance after withdrawal: " + availableBalance);
        } else {
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!");
        }
    }

    public boolean search(int ac_no) {
        if (accountNumber == (ac_no)) {
            getDetails();
            return (true);
        }
        return (false);
    }
}

public class banker {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of customers ");
        int n = sc.nextInt();
        account cust[] = new account[n];
        for (int i = 0; i < n; i++) {
            cust[i] = new account(i + 1);
            cust[i].setDetails();
        }
        int ch = 0;
        while (ch != 6) {
            System.out.println("\n *************");
            System.out.println("1. Display all account details");
            System.out.println("2. Update details");
            System.out.println("3. Deposit the amount");
            System.out.println("4. Withdraw the amount");
            System.out.println("5. To know total Number of account created");
            System.out.println("6.Exit ");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    for (int i = 0; i < cust.length; i++) {
                        cust[i].getDetails();
                    }
                    break;
                case 2:
                    System.out.print("Enter Account no. : ");
                    int ac_no = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < cust.length; i++) {
                        found = cust[i].search(ac_no);
                        if (found) {
                            cust[i].updateDetails();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 3:
                    System.out.print("Enter Account no. : ");
                    ac_no = sc.nextInt();
                    found = false;
                    for (int i = 0; i < cust.length; i++) {
                        found = cust[i].search(ac_no);
                        if (found) {
                            cust[i].deposit();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 4:
                    System.out.print("Enter Account No : ");
                    ac_no = sc.nextInt();
                    found = false;
                    for (int i = 0; i < cust.length; i++) {
                        found = cust[i].search(ac_no);
                        if (found) {
                            cust[i].withdrawal();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 5:
                    System.out.println("Total account created: " + account.totalAccountCreated);
                    break;
            }
        }
        sc.close();
    }
}