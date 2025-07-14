import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.awt.event.ActionEvent;

public class Deposite extends JFrame implements ActionListener {
    String pin;
    TextField textField;
    JButton b1, b2;
    Deposite(String pin) {
        super("Details Submite");
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 793);
        add(image);

        JLabel label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSITE");
        label1.setBounds(460, 180, 400, 35);
        label1.setFont(new Font("Raleway", Font.BOLD, 16));
        label1.setForeground(Color.WHITE);
        image.add(label1);

        textField = new TextField();
        textField.setBackground(new Color(65, 125, 128));
        textField.setBounds(460, 230, 320, 25);
        textField.setFont(new Font("Raleway", Font.BOLD, 16));
        textField.setForeground(Color.WHITE);
        image.add(textField);

        b1 = new JButton("Deposite");
        b1.setBounds(700, 362, 150, 35);
        b1.setFont(new Font("Raleway", Font.BOLD, 15));
        b1.setFocusPainted(false);
        b1.setBackground(new Color(65, 125, 128));
        b1.addActionListener(this);
        b1.setForeground(Color.WHITE);
        image.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(700, 406, 150, 35);
        b2.setFont(new Font("Raleway", Font.BOLD, 15));
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65, 125, 128));
        b2.addActionListener(this);
        b2.setFocusPainted(false);
        image.add(b2);

        setLayout(null);
        setSize(1550, 1080);
        setLocation(0, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount = textField.getText();
            Date date = new Date(System.currentTimeMillis());
            if (e.getSource() == b1) {
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposite");
                }else {
                    Conn c = new Conn();
                    c.statement.executeUpdate("insert into bank values('"+pin+"', '"+date+"','Deposite', '"+amount+"')");
                    JOptionPane.showMessageDialog(null, "Rs "+amount+" deposite successfully");
                    setVisible(false);
                    new mainclass(pin);
                }
            }else if(e.getSource() == b2){
                setVisible(false);
                new mainclass(pin);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String args[]) {
        new Deposite("");
    }
}
