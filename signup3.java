import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

import java.awt.*;

public class signup3 extends JFrame implements ActionListener {
    JRadioButton r1, r2, r3, r4;
    JCheckBox r5, r6, r7, r8, r9, r10, r11;
    JButton button1, button2;
    String formno;

    signup3(String formno) {
        super("Additional details");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50, 10, 100, 100);
        add(image);
        this.formno = formno;
        JLabel label1 = new JLabel("Account Details");
        label1.setBounds(270, 73, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        label1.setForeground(Color.BLACK);
        add(label1);

        JLabel label2 = new JLabel("Account Type: ");
        label2.setBounds(80, 150, 600, 35);
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setForeground(Color.BLACK);
        add(label2);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 17));
        r1.setBounds(100, 200, 200, 35);
        r1.setForeground(Color.BLACK);
        r1.setOpaque(false);
        r1.setContentAreaFilled(false);
        r1.setBorderPainted(false);
        r1.setFocusPainted(false);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 17));
        r2.setBounds(330, 200, 230, 35);
        r2.setForeground(Color.BLACK);
        r2.setOpaque(false);
        r2.setContentAreaFilled(false);
        r2.setBorderPainted(false);
        r2.setFocusPainted(false);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 17));
        r3.setBounds(100, 250, 200, 35);
        r3.setForeground(Color.BLACK);
        r3.setOpaque(false);
        r3.setContentAreaFilled(false);
        r3.setBorderPainted(false);
        r3.setFocusPainted(false);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 17));
        r4.setBounds(330, 250, 250, 35);
        r4.setForeground(Color.BLACK);
        r4.setOpaque(false);
        r4.setContentAreaFilled(false);
        r4.setBorderPainted(false);
        r4.setFocusPainted(false);
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel label3 = new JLabel("Card Number: ");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(80, 320, 250, 35);
        label3.setForeground(Color.BLACK);
        add(label3);

        JLabel label10 = new JLabel("XXXX-XXXX-XXXX-4841");
        label10.setFont(new Font("Raleway", Font.BOLD, 22));
        label10.setBounds(320, 320, 270, 35);
        label10.setForeground(Color.BLACK);
        add(label10);

        JLabel label4 = new JLabel("(Your 16-digit card number)");
        label4.setFont(new Font("Raleway", Font.BOLD, 15));
        label4.setBounds(80, 335, 300, 49);
        label4.setForeground(Color.BLACK);
        add(label4);

        JLabel label5 = new JLabel("It would be appear on ATM Card/Cheque Book and statement");
        label5.setFont(new Font("Raleway", Font.BOLD, 15));
        label5.setBounds(320, 335, 455, 49);
        label5.setForeground(Color.BLACK);
        add(label5);

        JLabel label6 = new JLabel("PIN: ");
        label6.setFont(new Font("Raleway", Font.BOLD, 22));
        label6.setBounds(80, 400, 100, 49);
        label6.setForeground(Color.BLACK);
        add(label6);

        JLabel label7 = new JLabel("(4-digit password)");
        label7.setFont(new Font("Raleway", Font.BOLD, 15));
        label7.setBounds(80, 420, 150, 50);
        label7.setForeground(Color.BLACK);
        add(label7);

        JLabel label8 = new JLabel("XXXX");
        label8.setFont(new Font("Raleway", Font.BOLD, 22));
        label8.setBounds(320, 400, 100, 49);
        label8.setForeground(Color.BLACK);
        add(label8);

        JLabel label9 = new JLabel("Service Required: ");
        label9.setFont(new Font("Raleway", Font.BOLD, 22));
        label9.setBounds(80, 450, 200, 49);
        label9.setForeground(Color.BLACK);
        add(label9);

        r5 = new JCheckBox("ATM CARD");
        r5.setFont(new Font("Raleway", Font.BOLD, 17));
        r5.setBounds(100, 500, 200, 35);
        r5.setForeground(Color.BLACK);
        r5.setOpaque(false);
        r5.setContentAreaFilled(false);
        r5.setBorderPainted(false);
        r5.setFocusPainted(false);
        add(r5);

        r6 = new JCheckBox("Internet Banking");
        r6.setFont(new Font("Raleway", Font.BOLD, 17));
        r6.setBounds(330, 500, 230, 35);
        r6.setForeground(Color.BLACK);
        r6.setOpaque(false);
        r6.setContentAreaFilled(false);
        r6.setBorderPainted(false);
        r6.setFocusPainted(false);
        add(r6);

        r7 = new JCheckBox("Mobile Banking");
        r7.setFont(new Font("Raleway", Font.BOLD, 17));
        r7.setBounds(100, 550, 200, 35);
        r7.setForeground(Color.BLACK);
        r7.setOpaque(false);
        r7.setContentAreaFilled(false);
        r7.setBorderPainted(false);
        r7.setFocusPainted(false);
        add(r7);

        r8 = new JCheckBox("EMAIL Alert");
        r8.setFont(new Font("Raleway", Font.BOLD, 17));
        r8.setBounds(330, 550, 250, 35);
        r8.setForeground(Color.BLACK);
        r8.setOpaque(false);
        r8.setContentAreaFilled(false);
        r8.setBorderPainted(false);
        r8.setFocusPainted(false);
        add(r8);

        r9 = new JCheckBox("Cheque Book");
        r9.setFont(new Font("Raleway", Font.BOLD, 17));
        r9.setBounds(100, 600, 250, 35);
        r9.setForeground(Color.BLACK);
        r9.setOpaque(false);
        r9.setContentAreaFilled(false);
        r9.setBorderPainted(false);
        r9.setFocusPainted(false);
        add(r9);

        r10 = new JCheckBox("E-Statement");
        r10.setFont(new Font("Raleway", Font.BOLD, 17));
        r10.setBounds(330, 600, 250, 35);
        r10.setForeground(Color.BLACK);
        r10.setOpaque(false);
        r10.setContentAreaFilled(false);
        r10.setBorderPainted(false);
        r10.setFocusPainted(false);
        add(r10);

        r11 = new JCheckBox("I hereby declare that the above entered details correct to the best of knowledge.");
        r11.setFont(new Font("Raleway", Font.BOLD, 17));
        r11.setBounds(80, 640, 670, 35);
        r11.setForeground(Color.BLACK);
        r11.setOpaque(false);
        r11.setContentAreaFilled(false);
        r11.setBorderPainted(false);
        r11.setFocusPainted(false);
        add(r11);

        button1 = new JButton("Cancel");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(700, 690, 100, 30);
        button1.addActionListener(this);
        button1.setFocusPainted(false);
        add(button1);

        button2 = new JButton("Submit");
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(580, 690, 100, 30);
        button2.addActionListener(this);
        button2.setFocusPainted(false);
        add(button2);

        JLabel label11 = new JLabel("Form No. - ");
        label11.setBounds(270, 30, 600, 40);
        label11.setFont(new Font("Raleway", Font.BOLD, 30));
        label11.setForeground(Color.BLACK);
        add(label11);

        JLabel label12 = new JLabel("Page 3");
        label12.setBounds(730, 0, 600, 40);
        label12.setForeground(Color.BLACK);
        label12.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label12);

        // ButtonGroup buttonGroup2 = new ButtonGroup();
        // buttonGroup2.add(r5);
        // buttonGroup2.add(r6);
        // buttonGroup2.add(r7);
        // buttonGroup2.add(r8);
        // buttonGroup2.add(r9);
        // buttonGroup2.add(r10);

        getContentPane().setBackground(new Color(102, 125, 158));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String aType = null;
        if (r1.isSelected()) {
            aType = "Saving Account";
        } else if (r2.isSelected()) {
            aType = "Fixed Deposit Account";
        } else if (r3.isSelected()) {
            aType = "Current Account";
        } else if (r4.isSelected()) {
            aType = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000) + 1409963000000000L;
        String cardno = " " + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);

        String fac = "";
        if (r5.isSelected()) {
            fac = fac + "ATM CARD";
        } else if (r6.isSelected()) {
            fac = fac + "Internet Banking";
        } else if (r7.isSelected()) {
            fac = fac + "Mobile Banking";
        } else if (r8.isSelected()) {
            fac = fac + "EMAIL Alert";
        } else if (r9.isSelected()) {
            fac = fac + "Cheque Book";
        } else if (r10.isSelected()) {
            fac = fac + "E-Statement";
        }

        try {
            if (e.getSource() == button2) {
                if (aType.equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill all the fields");
                } else {
                    Conn c1 = new Conn();
                    String q1 = "insert into signupthree values('" + formno + "','" + aType + "', '" + cardno + "', '"
                            + pin + "', '" + fac + "')";
                    String q2 = "insert into login values('"+formno+"', '"+cardno+"', '"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number : " +cardno+"\n Pin : " + pin);
                    new Deposite(pin);
                    setVisible(false);
                }
            }else if(e.getSource() == button1) {
                System.exit(0);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String args[]) {
        new signup3("");

    }
}
