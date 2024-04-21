import java.io.*;
import java.util.*;
import java.net.*;
public class myserver {
    public static void main(String[] args) {
        ServerSocket ss = null;
        Socket s = null;
        DataInputStream ip = null;
        try {
            ss = new ServerSocket(5000);
            System.out.println("Server started");
            System.out.println("Waiting for a client.....");
            s = ss.accept();
            System.out.println("Client accepted");
            ip = new DataInputStream(new BufferedInputStream(s.getInputStream()));
        }
        catch (Exception e) {
            System.out.println("Can't connect.");
        }

        try {
            s.close();
            ip.close();
            System.out.println("Connection closed.");
        }
        catch (Exception e) {
            System.out.println("Cant close.");
        }

    }
}
