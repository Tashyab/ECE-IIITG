import javax.swing.*;
import javax.swing.text.LabelView;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.net.*;
import java.io.*;

class MyFrame2 {
    private JButton submit;
    private JTextField sfield;
    private JLabel slabel;
    private JLabel statusLabel;

    MyFrame2() {

        JFrame fr = new JFrame("Delete Student Details");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        slabel = new JLabel("Enter Roll No.");
        slabel.setFont(new Font("Arial", Font.PLAIN, 20));
        slabel.setSize(100, 20);
        slabel.setLocation(100, 175);
        panel.add(slabel);

        sfield = new JTextField();
        sfield.setFont(new Font("Arial", Font.PLAIN, 15));
        sfield.setSize(150, 175);
        sfield.setLocation(200, 400);
        panel.add(sfield);

        submit = new JButton("Delete");
        submit.setLocation(150, 250);
        panel.add(submit);

        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);
        panel.add(statusLabel);

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("Enter valid roll number");
            }
        });

        fr.add(panel);
        fr.setSize(400, 400);
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}

class MyFrame extends JFrame implements ActionListener {
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel mno;
    private JLabel rno;
    private JTextField tmno;
    private JTextField rmno;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel add;
    private JTextArea tadd;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;

    private String dates[] = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private String months[] = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    private String years[] = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" };

    MyFrame() {
        setTitle("Add details");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Enter Details");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);

        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        c.add(tname);

        mno = new JLabel("Mobile");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(100, 20);
        mno.setLocation(100, 133);
        c.add(mno);

        rno = new JLabel("Roll No.");
        rno.setFont(new Font("Arial", Font.PLAIN, 20));
        rno.setSize(100, 20);
        rno.setLocation(100, 175);
        c.add(rno);

        rmno = new JTextField();
        rmno.setFont(new Font("Arial", Font.PLAIN, 15));
        rmno.setSize(150, 20);
        rmno.setLocation(200, 175);
        c.add(rmno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(150, 20);
        tmno.setLocation(200, 133);
        c.add(tmno);

        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 200);
        c.add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 200);
        c.add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 200);
        c.add(female);

        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);

        dob = new JLabel("DOB");
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setSize(100, 20);
        dob.setLocation(100, 250);
        c.add(dob);

        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(200, 250);
        c.add(date);

        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(250, 250);
        c.add(month);

        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(320, 250);
        c.add(year);

        add = new JLabel("Address");
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setSize(100, 20);
        add.setLocation(100, 300);
        c.add(add);

        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(200, 300);
        tadd.setLineWrap(true);
        c.add(tadd);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        c.add(sub);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        c.add(reset);

        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);

        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 500);
        c.add(res);

        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
                String data1;
                String data = "Name : "
                        + tname.getText() + "\n"
                        + "Mobile : "
                        + tmno.getText() + "\n"
                        + "Roll : "
                        + rmno.getText() + "\n";
                if (male.isSelected())
                    data1 = "Gender : Male"
                            + "\n";
                else
                    data1 = "Gender : Female"
                            + "\n";
                String data2 = "DOB : "
                        + (String) date.getSelectedItem()
                        + "/" + (String) month.getSelectedItem()
                        + "/" + (String) year.getSelectedItem()
                        + "\n";

                String data3 = "Address : " + tadd.getText();
                tout.setText(data + data1 + data2 + data3);
                tout.setEditable(false);
                res.setText("Registration Successfully..");
            } else {
                tout.setText("");
                resadd.setText("");
                res.setText("Please accept the"
                        + " terms & conditions..");
            }
        }

        else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tadd.setText(def);
            tmno.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            resadd.setText(def);
        }
    }
}

class MyFrame3 {
    private JButton submit;
    private JTextField sfield;
    private JLabel slabel;

    MyFrame3() {

        JFrame fr = new JFrame("Modify Student Details");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        slabel = new JLabel("Enter Roll No.");
        slabel.setFont(new Font("Arial", Font.PLAIN, 20));
        slabel.setSize(100, 20);
        slabel.setLocation(100, 175);
        panel.add(slabel);

        sfield = new JTextField();
        sfield.setFont(new Font("Arial", Font.PLAIN, 15));
        sfield.setSize(150, 175);
        sfield.setLocation(200, 400);
        panel.add(sfield);

        submit = new JButton("Modify");
        submit.setLocation(150, 250);
        panel.add(submit);

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame ff = new MyFrame();
            }
        });

        fr.add(panel);
        fr.setSize(400, 400);
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }

}

class MenuFrame {

    private JButton ModifyDetails, DeleteDetails, AddDetails;

    MenuFrame() {

        JPanel mainCard = new JPanel();
        ModifyDetails = new JButton("Modify Details");
        DeleteDetails = new JButton("Delete Details");
        AddDetails = new JButton("Add Details");

        AddDetails.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame f = new MyFrame();
            }
        });

        DeleteDetails.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame2 f2 = new MyFrame2();
            }
        });

        ModifyDetails.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyFrame3 f3 = new MyFrame3();
            }
        });

        mainCard.add(AddDetails);
        mainCard.add(DeleteDetails);
        mainCard.add(ModifyDetails);

        ModifyDetails.setBounds(100, 100, 80, 30);
        DeleteDetails.setBounds(100, 200, 80, 30);
        AddDetails.setBounds(100, 300, 80, 30);

        JFrame window = new JFrame("Menu");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().add(mainCard);
        window.setSize(400, 400);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}

class nameframe {
    private JButton submit;
    private JTextField sfield;
    private JLabel slabel;
    private JLabel statusLabel;

    nameframe() {

        JFrame fr = new JFrame("Search Student Details");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        slabel = new JLabel("Enter Name");
        slabel.setFont(new Font("Arial", Font.PLAIN, 20));
        slabel.setSize(100, 20);
        slabel.setLocation(100, 175);
        panel.add(slabel);

        sfield = new JTextField();
        sfield.setFont(new Font("Arial", Font.PLAIN, 15));
        sfield.setSize(150, 175);
        sfield.setLocation(200, 400);
        panel.add(sfield);

        submit = new JButton("Search");
        submit.setLocation(150, 250);
        panel.add(submit);

        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);
        panel.add(statusLabel);

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("Enter valid name");
            }
        });

        fr.add(panel);
        fr.setSize(400, 400);
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}

class rollframe {
    private JButton submit;
    private JTextField sfield;
    private JLabel slabel;
    private JLabel statusLabel;

    rollframe() {

        JFrame fr = new JFrame("Search Student Details");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        slabel = new JLabel("Enter Roll No.");
        slabel.setFont(new Font("Arial", Font.PLAIN, 20));
        slabel.setSize(100, 20);
        slabel.setLocation(100, 175);
        panel.add(slabel);

        sfield = new JTextField();
        sfield.setFont(new Font("Arial", Font.PLAIN, 15));
        sfield.setSize(150, 175);
        sfield.setLocation(200, 400);
        panel.add(sfield);

        submit = new JButton("Search");
        submit.setLocation(150, 250);
        panel.add(submit);

        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);
        panel.add(statusLabel);

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("Enter valid roll no.");
            }
        });

        fr.add(panel);
        fr.setSize(400, 400);
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}

class UserMenuFrame {

    private JButton name, roll;

    UserMenuFrame() {

        JPanel mainCard = new JPanel();
        name = new JButton("Search by Name");
        roll = new JButton("Search by Roll");

        roll.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rollframe f2 = new rollframe();
            }
        });

        name.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nameframe f3 = new nameframe();
            }
        });

        mainCard.add(roll);
        mainCard.add(name);

        JFrame window = new JFrame("User Menu");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().add(mainCard);
        window.setSize(400, 400);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}

public class gui {
    public static void main(String[] args) throws Exception {
        JFrame fr = new JFrame("Student information records");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel l1 = new JLabel("Select an option:");
        panel.add(l1);

        JButton b1 = new JButton("Admin");
        b1.setBounds(50, 100, 80, 30);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuFrame f = new MenuFrame();
            }
        });

        panel.add(b1);

        JButton b2 = new JButton("User");
        b2.setBounds(100, 100, 80, 30);
        
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UserMenuFrame f = new UserMenuFrame();
            }
        });

        panel.add(b2);
        
        fr.add(panel);
        fr.setSize(400, 400);
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);

    }
}

