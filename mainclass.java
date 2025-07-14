import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainclass extends JFrame implements ActionListener{
    JButton b1, b2, b3, b4, b5, b6, b7, b8;
    String pin;
    mainclass(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 793);
        add(image);

        JLabel label1 = new JLabel("Please Select Your Transaction");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Raleway", Font.BOLD, 26));
        label1.setBounds(435, 100, 400, 150);
        image.add(label1);

        b1 = new JButton("DEPOSITE");
        b1.setBounds(425, 248, 150, 35);
        b1.setFont(new Font("Raleway", Font.BOLD, 12));
        b1.setFocusPainted(false);
        b1.setBackground(new Color(65, 125, 128));
        b1.addActionListener(this);
        b1.setForeground(Color.WHITE);
        image.add(b1);

        b2 = new JButton("FAST CASH");
        b2.setBounds(425, 294, 150, 35);
        b2.setFont(new Font("Raleway", Font.BOLD, 12));
        b2.setFocusPainted(false);
        b2.setBackground(new Color(65, 125, 128));
        b2.addActionListener(this);
        b2.setForeground(Color.WHITE);
        image.add(b2);

        b3 = new JButton("FAST CASH");
        b3.setBounds(425, 344, 150, 35);
        b3.setFont(new Font("Raleway", Font.BOLD, 12));
        b3.setFocusPainted(false);
        b3.setBackground(new Color(65, 125, 128));
        b3.addActionListener(this);
        b3.setForeground(Color.WHITE);
        image.add(b3);

        b4 = new JButton("CASH WITHDRAWL");
        b4.setBounds(700, 248, 150, 35);
        b4.setFont(new Font("Raleway", Font.BOLD, 12));
        b4.setFocusPainted(false);
        b4.setBackground(new Color(65, 125, 128));
        b4.addActionListener(this);
        b4.setForeground(Color.WHITE);
        image.add(b4);

        b5 = new JButton("MINI STATEMENT");
        b5.setBounds(700, 294, 150, 35);
        b5.setFont(new Font("Raleway", Font.BOLD, 12));
        b5.setFocusPainted(false);
        b5.setBackground(new Color(65, 125, 128));
        b5.addActionListener(this);
        b5.setForeground(Color.WHITE);
        image.add(b5);

        b6 = new JButton("BALANCE ENQUIRY");
        b6.setBounds(700, 344, 150, 35);
        b6.setFont(new Font("Raleway", Font.BOLD, 12));
        b6.setFocusPainted(false);
        b6.setBackground(new Color(65, 125, 128));
        b6.addActionListener(this);
        b6.setForeground(Color.WHITE);
        image.add(b6);

        b7 = new JButton("EXIT");
        b7.setBounds(700, 394, 150, 35);
        b7.setFont(new Font("Raleway", Font.BOLD, 12));
        b7.setFocusPainted(false);
        b7.setBackground(new Color(65, 125, 128));
        b7.addActionListener(this);
        b7.setForeground(Color.WHITE);
        image.add(b7);
        
        setLayout(null);
        setSize(1550, 1080);
        setLocation(0, 0);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
            new Deposite(pin);
            setVisible(false);
        }
        else if(e.getSource() == b7){
            System.exit(0);
        }
    }
    public static void main(String args[]){
        new mainclass("");
    }
}
