import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Withdraw extends JFrame implements ActionListener{
    String pin;
    TextField textField;
    JButton b1, b2;

    Withdraw(){
         super("Cash Withdrawl");
        // this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 793);
        add(image);

        JLabel label1 = new JLabel("> MAXIMUM WITHDRAWL AMOUNT IS RS. 10000");
        label1.setBounds(440, 140, 400, 35);
        label1.setFont(new Font("Raleway", Font.BOLD, 14));
        label1.setForeground(Color.WHITE);
        image.add(label1);

        JLabel label2 = new JLabel("(At A Time)");
        label2.setBounds(453, 153, 400, 35);
        label2.setFont(new Font("Raleway", Font.BOLD, 10));
        label2.setForeground(Color.WHITE);
        image.add(label2);

        JLabel label3 = new JLabel("> Please Enter Your Amount");
        label3.setBounds(440, 190, 400, 35);
        label3.setFont(new Font("Raleway", Font.BOLD, 15));
        label3.setForeground(Color.WHITE);
        image.add(label3);

        textField = new TextField();
        textField.setBackground(new Color(65, 125, 128));
        textField.setBounds(440, 230, 320, 25);
        textField.setFont(new Font("Raleway", Font.BOLD, 16));
        textField.setForeground(Color.WHITE);
        image.add(textField);

        b1 = new JButton("Withdraw");
        b1.setBounds(700, 362, 150, 35);
        b1.setFont(new Font("Raleway", Font.BOLD, 15));
        b1.setFocusPainted(false);
        b1.setBackground(new Color(65, 125, 128));
        // b1.addActionListener(this);
        b1.setForeground(Color.WHITE);
        image.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(700, 406, 150, 35);
        b2.setFont(new Font("Raleway", Font.BOLD, 15));
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65, 125, 128));
        // b2.addActionListener(this);
        b2.setFocusPainted(false);
        image.add(b2);

        setLayout(null);
        setSize(1550, 1080);
        setLocation(0, 0);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){

    }
    public static void main(String args[]){
        new Withdraw();
    }
}
