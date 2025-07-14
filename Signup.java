import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.toedter.calendar.JDateChooser;

import java.awt.*;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    JRadioButton r1;
    JRadioButton r2;
    JRadioButton r3;
    JRadioButton r4;
    JRadioButton r5;

    JTextField textField2;

    JTextField textField3;

    JTextField textField4;

    JTextField textField5;

    JTextField textField6;

    JTextField textField7;

    JTextField textField8;

    JDateChooser dateChooser;

    JButton button1;
    JButton button2;
    JButton button3;

    Signup() {
        super("APPLICATION FORM");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("Application Form No. : " + first);
        label1.setForeground(Color.WHITE);
        label1.setBounds(175, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(740, 0, 600, 40);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(330, 90, 600, 30);
        add(label3);

        JLabel labelName = new JLabel("Name : ");
        labelName.setBounds(90, 150, 600, 30);
        labelName.setFont(new Font("Raleway", Font.BOLD, 22));
        labelName.setForeground(Color.WHITE);
        add(labelName);

        textField2 = new JTextField(15);
        textField2.setBounds(290, 150, 480, 30);
        textField2.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField2);

        JLabel labelFather = new JLabel("Father's Name : ");
        labelFather.setBounds(90, 205, 600, 30);
        labelFather.setFont(new Font("Raleway", Font.BOLD, 22));
        labelFather.setForeground(Color.WHITE);
        add(labelFather);

        textField3 = new JTextField(15);
        textField3.setBounds(290, 200, 480, 30);
        textField3.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField3);

        JLabel labelGen = new JLabel("Gender : ");
        labelGen.setBounds(90, 305, 600, 30);
        labelGen.setFont(new Font("Raleway", Font.BOLD, 22));
        labelGen.setForeground(Color.WHITE);
        add(labelGen);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 20));
        r1.setBounds(290, 295, 100, 50);
        r1.setForeground(Color.WHITE);
        r1.setOpaque(false);
        r1.setContentAreaFilled(false);
        r1.setBorderPainted(false);
        r1.setFocusPainted(false);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 20));
        r2.setBounds(440, 295, 100, 50);
        r2.setForeground(Color.WHITE);
        r2.setOpaque(false);
        r2.setContentAreaFilled(false);
        r2.setBorderPainted(false);
        r2.setFocusPainted(false);
        add(r2);

        r3 = new JRadioButton("Other");
        r3.setFont(new Font("Raleway", Font.BOLD, 20));
        r3.setBounds(590, 295, 100, 50);
        r3.setForeground(Color.WHITE);
        r3.setOpaque(false);
        r3.setContentAreaFilled(false);
        r3.setBorderPainted(false);
        r3.setFocusPainted(false);
        add(r3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r1);
        buttonGroup1.add(r2);
        buttonGroup1.add(r3);

        JLabel labelDate = new JLabel("Date Of Birth : ");
        labelDate.setBounds(90, 255, 600, 30);
        labelDate.setFont(new Font("Raleway", Font.BOLD, 22));
        labelDate.setForeground(Color.WHITE);
        add(labelDate);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(290, 250, 480, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);

        JLabel labelEmail = new JLabel("Email Address : ");
        labelEmail.setBounds(90, 350, 600, 30);
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 22));
        labelEmail.setForeground(Color.WHITE);
        add(labelEmail);

        textField4 = new JTextField(15);
        textField4.setBounds(290, 345, 480, 30);
        textField4.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField4);

        JLabel labelMarital = new JLabel("Marital Status : ");
        labelMarital.setBounds(90, 405, 600, 30);
        labelMarital.setFont(new Font("Raleway", Font.BOLD, 22));
        labelMarital.setForeground(Color.WHITE);
        add(labelMarital);

        r4 = new JRadioButton("Married");
        r4.setBounds(290, 400, 100, 50);
        r4.setFont(new Font("Raleway", Font.BOLD, 20));
        r4.setForeground(Color.WHITE);
        r4.setOpaque(false);
        r4.setContentAreaFilled(false);
        r4.setBorderPainted(false);
        r4.setFocusPainted(false);
        add(r4);

        r5 = new JRadioButton("Unmarried");
        r5.setBounds(430, 400, 130, 50);
        r5.setFont(new Font("Raleway", Font.BOLD, 20));
        r5.setForeground(Color.WHITE);
        r5.setOpaque(false);
        r5.setContentAreaFilled(false);
        r5.setBorderPainted(false);
        r5.setFocusPainted(false);
        add(r5);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r4);
        buttonGroup.add(r5);

        JLabel labelAddress = new JLabel("Address : ");
        labelAddress.setBounds(90, 455, 600, 30);
        labelAddress.setFont(new Font("Raleway", Font.BOLD, 22));
        labelAddress.setForeground(Color.WHITE);
        add(labelAddress);

        textField5 = new JTextField(15);
        textField5.setBounds(290, 450, 480, 30);
        textField5.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField5);

        JLabel labelCity = new JLabel("City : ");
        labelCity.setBounds(90, 505, 600, 30);
        labelCity.setFont(new Font("Raleway", Font.BOLD, 22));
        labelCity.setForeground(Color.WHITE);
        add(labelCity);

        textField6 = new JTextField(15);
        textField6.setBounds(290, 500, 480, 30);
        textField6.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField6);

        JLabel labelState = new JLabel("State : ");
        labelState.setBounds(90, 555, 600, 30);
        labelState.setFont(new Font("Raleway", Font.BOLD, 22));
        labelState.setForeground(Color.WHITE);
        add(labelState);

        textField7 = new JTextField(15);
        textField7.setBounds(290, 550, 480, 30);
        textField7.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField7);

        JLabel labelPin = new JLabel("Pin Code : ");
        labelPin.setBounds(90, 605, 600, 30);
        labelPin.setFont(new Font("Raleway", Font.BOLD, 22));
        labelPin.setForeground(Color.WHITE);
        add(labelPin);

        textField8 = new JTextField(15);
        textField8.setBounds(290, 600, 480, 30);
        textField8.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField8);

        button1 = new JButton("NEXT");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(700, 670, 100, 30);
        button1.addActionListener(this);
        button1.setFocusPainted(false);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(580, 670, 100, 30);
        button2.addActionListener(this);
        button2.setFocusPainted(false);
        add(button2);

        button3 = new JButton("<--BACK");
        button3.setFont(new Font("Arial", Font.BOLD, 14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(700, 720, 100, 30);
        button3.addActionListener(this);
        button3.setFocusPainted(false);
        add(button3);

        getContentPane().setBackground(new Color(23, 44, 61));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == button1) {

            } else if (e.getSource() == button2) {
                textField2.setText(" ");
                textField3.setText(" ");
                textField4.setText(" ");
                textField5.setText(" ");
                textField6.setText(" ");
                textField7.setText(" ");
                textField8.setText(" ");
                ButtonGroup genderGroup = new ButtonGroup();
                genderGroup.add(r1);
                genderGroup.add(r2);
                genderGroup.clearSelection();
                ButtonGroup genderGroup2 = new ButtonGroup();
                genderGroup2.add(r3);
                genderGroup2.add(r4);
                genderGroup2.add(r5);
                genderGroup2.clearSelection();
                dateChooser.setDate(null);
            } else if (e.getSource() == button3) {
                new Login();
                dispose();
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
        String formno = first;
        String name = textField2.getText();
        String fname = textField3.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = "Male";
        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        } else if (r3.isSelected()) {
            gender = "Other";
        }
        String email = textField4.getText();
        String marital = null;
        if (r4.isSelected()) {
            marital = "Married";
        } else if (r5.isSelected()) {
            marital = "Unmarried";
        }
        String address = textField5.getText();
        String city = textField6.getText();
        String state = textField7.getText();
        String pinCode = textField8.getText();

        try {
            if (textField2.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "fill all the fields");
            } else {
                Conn con1 = new Conn();
                String q = "insert into signup values('" + formno + "', '" + name + "', '" + fname + "''', '" + dob
                        + "', '" + gender + "', '" + email + "', '" + marital + "', '" + address + "', '" + city + "','"
                        + state + "', '" + pinCode + "')";
                con1.statement.executeUpdate(q);
                new signup2(formno);
                setVisible(false);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String args[]) {
        new Signup();
    }
}
