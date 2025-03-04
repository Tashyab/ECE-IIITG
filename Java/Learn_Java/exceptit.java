import java.util.*;

class myException extends Exception {
    public String toString() {
        return "Exception baby.";
    }

    public String getMessage() {
        return "Error message is Errorrrrrr....";
    }
}

public class exceptit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 12;
        int b = sc.nextInt();
        if (b == a) {
            try 
            {
                throw new myException();
            } 
            catch (myException e) 
            {
                System.out.println("Don't make a == b");
                System.out.println(e.toString()); //same as e
                System.out.println(e.getMessage());
                e.printStackTrace(); //prints line of exception
            }
        }
}
