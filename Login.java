import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.*;
import java.io.*;
import java.sql.ResultSet;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {
    JLabel label1, label2, label3;

    JTextField textField2;

    JPasswordField passwordField3;

    JButton button1, button2, button3;

    Login() {
        super("Online Banking System");

        // Icon 1 - bank
        // ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        // Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        // ImageIcon i3 = new ImageIcon(i2);
        // JLabel image = new JLabel(i3);
        // image.setBounds(362, 10, 100, 100);
        // add(image);

        // Icon 2 - card
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icons/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630, 350, 100, 100);
        add(iimage);

        // Label
        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGrade", Font.BOLD, 38));
        label1.setBounds(230, 90, 450, 40);
        add(label1);

        // label2
        label2 = new JLabel("Card No. : ");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("AvantGrade", Font.BOLD, 38));
        label2.setBounds(100, 160, 350, 40);
        add(label2);

        // testfield
        textField2 = new JTextField(15);
        textField2.setBounds(325, 170, 230, 30);
        textField2.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField2);

        // label3
        label3 = new JLabel("PIN : ");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("AvantGrade", Font.BOLD, 38));
        label3.setBounds(100, 220, 350, 40);
        add(label3);

        // paddwordfield
        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(325, 230, 230, 30);
        passwordField3.setFont(new Font("Arial", Font.BOLD, 14));
        add(passwordField3);

        // Button1--------->
        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(325, 287, 100, 30);
        button1.addActionListener(this);
        button1.setFocusPainted(false);
        add(button1);

        // Button2---------->
        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(455, 287, 100, 30);
        button2.addActionListener(this);
        button2.setFocusPainted(false);
        add(button2);

        // Button3----------->
        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arial", Font.BOLD, 14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(325, 345, 230, 30);
        button3.addActionListener(this);
        button3.setFocusPainted(false);
        add(button3);

        // Background Image with Blur
        try {
            BufferedImage bimg = ImageIO.read(new File("icons/background images.png"));

            // Apply blur
            float[] matrix = {
                    1f / 9, 1f / 9, 1f / 9,
                    1f / 9, 1f / 9, 1f / 9,
                    1f / 9, 1f / 9, 1f / 9
            };
            BufferedImageOp op = new ConvolveOp(new Kernel(3, 3, matrix));
            BufferedImage blurred = op.filter(bimg, null);

            Image scaledBlur = blurred.getScaledInstance(850, 480, Image.SCALE_SMOOTH);
            ImageIcon iii3 = new ImageIcon(scaledBlur);
            JLabel iiimage = new JLabel(iii3);
            iiimage.setBounds(-12, 0, 850, 480);
            add(iiimage);
        } catch (IOException e) {
            e.printStackTrace();
        }

        setLayout(null);
        setSize(830, 480);
        setLocation(350, 190);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == button1) {
                Conn c1 = new Conn();
                String cardno = textField2.getText();
                String pin = passwordField3.getText();
                String q = "select * from login where card_number = '" + cardno + "' and pin = '" + pin + "'";
                ResultSet resultSet = c1.statement.executeQuery(q);
                if (resultSet.next()) {
                    setVisible(false);
                    new mainclass(pin);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect card number or pin");
                }
            } else if (e.getSource() == button2) {
                textField2.setText("");
                passwordField3.setText("");
            } else if (e.getSource() == button3) {
                new Signup();
                dispose();
            }
        } catch (Exception E) {
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Login();

    }
}
