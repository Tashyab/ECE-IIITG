import java.util.*;
import java.net.*;
import java.io.*;
public class myclient {
    public static void main(String[] args) {
        Socket s = null;
        DataInputStream ip = null;
        DataOutputStream op =null;
        try {
            String address = "127.0.0.1";
            int port = 5000;
            s = new Socket(address, port);
            System.out.println("Connected");
            ip = new DataInputStream(s.getInputStream());
            op = new DataOutputStream(s.getOutputStream());
        }
        catch (Exception e) {
            System.out.println("Can't connect to the server");
        }


        try {
            ip.close();
            op.close();
            s.close();
        }
        catch (Exception e) {
            System.out.println("Can't close the network.");
        }

    }
}
