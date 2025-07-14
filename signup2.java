import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;

public class signup2 extends JFrame implements ActionListener {
    JComboBox combobox, combobox2, combobox3, combobox4, combobox5;
    JTextField textField2, textField3;
    JRadioButton r1, r2, r4, r5;
    JButton button1;
    String formno;

    signup2(String formno) {
        super("Additional details");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("Additional Details");
        label1.setBounds(260, 73, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        label1.setForeground(Color.BLACK);
        add(label1);
        this.formno = formno;
        JLabel label2 = new JLabel("Form No. - ");
        label2.setBounds(260, 30, 600, 40);
        label2.setFont(new Font("Raleway", Font.BOLD, 30));
        label2.setForeground(Color.BLACK);
        add(label2);

        JLabel label13 = new JLabel(formno);
        label13.setBounds(320, 30, 600, 40);
        label13.setFont(new Font("Raleway", Font.BOLD, 30));
        label13.setForeground(Color.BLACK);
        add(label13);

        JLabel label3 = new JLabel("Page 2");
        label3.setBounds(730, 0, 600, 40);
        label3.setForeground(Color.BLACK);
        label3.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label3);

        JLabel label4 = new JLabel("Religion: ");
        label4.setBounds(80, 150, 600, 35);
        label4.setFont(new Font("Raleway", Font.BOLD, 22));
        label4.setForeground(Color.BLACK);
        add(label4);

        String religion[] = { "Hindu", "Muslim", "Sikh", "Christan", "Other" };
        combobox = new JComboBox<>(religion);
        combobox.setBackground(new Color(102, 125, 158));
        combobox.setFont(new Font("Raleway", Font.BOLD, 14));
        combobox.setBounds(350, 150, 320, 30);
        add(combobox);

        JLabel label5 = new JLabel("Category: ");
        label5.setBounds(80, 190, 600, 35);
        label5.setFont(new Font("Raleway", Font.BOLD, 22));
        label5.setForeground(Color.BLACK);
        add(label5);

        String category[] = { "General", "OBC", "SC", "ST", "Other" };
        combobox2 = new JComboBox<>(category);
        combobox2.setBackground(new Color(102, 125, 158));
        combobox2.setFont(new Font("Raleway", Font.BOLD, 14));
        combobox2.setBounds(350, 190, 320, 30);
        add(combobox2);

        JLabel label6 = new JLabel("Income: ");
        label6.setBounds(80, 230, 600, 35);
        label6.setFont(new Font("Raleway", Font.BOLD, 22));
        label6.setForeground(Color.BLACK);
        add(label6);

        String Income[] = { "Null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000", "Above 10,00,000" };
        combobox3 = new JComboBox<>(Income);
        combobox3.setBackground(new Color(102, 125, 158));
        combobox3.setFont(new Font("Raleway", Font.BOLD, 14));
        combobox3.setBounds(350, 230, 320, 30);
        add(combobox3);

        JLabel label7 = new JLabel("Education: ");
        label7.setBounds(80, 270, 600, 35);
        label7.setFont(new Font("Raleway", Font.BOLD, 22));
        label7.setForeground(Color.BLACK);
        add(label7);

        String education[] = { "Non-Graduate", "Graduate", "Post-Graduate", "Diploma", "Other" };
        combobox4 = new JComboBox<>(education);
        combobox4.setBackground(new Color(102, 125, 158));
        combobox4.setFont(new Font("Raleway", Font.BOLD, 14));
        combobox4.setBounds(350, 270, 320, 30);
        add(combobox4);

        JLabel label8 = new JLabel("Occupation: ");
        label8.setBounds(80, 310, 600, 35);
        label8.setFont(new Font("Raleway", Font.BOLD, 22));
        label8.setForeground(Color.BLACK);
        add(label8);

        String occupation[] = { "Salaried", "Self-Employed", "Business", "Student", "Retired", "Other" };
        combobox5 = new JComboBox<>(occupation);
        combobox5.setBackground(new Color(102, 125, 158));
        combobox5.setFont(new Font("Raleway", Font.BOLD, 14));
        combobox5.setBounds(350, 310, 320, 30);
        add(combobox5);

        JLabel label9 = new JLabel("PAN Number: ");
        label9.setBounds(80, 350, 600, 35);
        label9.setFont(new Font("Raleway", Font.BOLD, 22));
        label9.setForeground(Color.BLACK);
        add(label9);

        textField2 = new JTextField(15);
        textField2.setBounds(350, 350, 320, 30);
        textField2.setFont(new Font("Arial", Font.BOLD, 22));
        add(textField2);

        JLabel label10 = new JLabel("Aadhar Number: ");
        label10.setBounds(80, 390, 600, 35);
        label10.setFont(new Font("Raleway", Font.BOLD, 22));
        label10.setForeground(Color.BLACK);
        add(label10);

        textField3 = new JTextField(15);
        textField3.setBounds(350, 390, 320, 30);
        textField3.setFont(new Font("Arial", Font.BOLD, 22));
        add(textField3);

        JLabel label11 = new JLabel("Senior Citizen: ");
        label11.setBounds(80, 430, 600, 35);
        label11.setFont(new Font("Raleway", Font.BOLD, 22));
        label11.setForeground(Color.BLACK);
        add(label11);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD, 20));
        r1.setBounds(350, 425, 100, 45);
        r1.setForeground(Color.BLACK);
        r1.setOpaque(false);
        r1.setContentAreaFilled(false);
        r1.setBorderPainted(false);
        r1.setFocusPainted(false);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD, 20));
        r2.setBounds(500, 425, 100, 45);
        r2.setForeground(Color.BLACK);
        r2.setOpaque(false);
        r2.setContentAreaFilled(false);
        r2.setBorderPainted(false);
        r2.setFocusPainted(false);
        add(r2);

        JLabel label12 = new JLabel("Exsiting Account: ");
        label12.setBounds(80, 470, 600, 35);
        label12.setFont(new Font("Raleway", Font.BOLD, 22));
        label12.setForeground(Color.BLACK);
        add(label12);

        r4 = new JRadioButton("Yes");
        r4.setFont(new Font("Raleway", Font.BOLD, 20));
        r4.setBounds(350, 465, 100, 50);
        r4.setForeground(Color.BLACK);
        r4.setOpaque(false);
        r4.setContentAreaFilled(false);
        r4.setBorderPainted(false);
        r4.setFocusPainted(false);
        add(r4);

        r5 = new JRadioButton("No");
        r5.setFont(new Font("Raleway", Font.BOLD, 20));
        r5.setBounds(500, 465, 100, 50);
        r5.setForeground(Color.BLACK);
        r5.setOpaque(false);
        r5.setContentAreaFilled(false);
        r5.setBorderPainted(false);
        r5.setFocusPainted(false);
        add(r5);

        button1 = new JButton("NEXT");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(700, 570, 100, 30);
        button1.addActionListener(this);
        button1.setFocusPainted(false);
        add(button1);

        setSize(850, 700);
        setLayout(null);
        setLocation(450, 80);
        getContentPane().setBackground(new Color(102, 125, 158));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) combobox.getSelectedItem();
        String cate = (String) combobox2.getSelectedItem();
        String income = (String) combobox3.getSelectedItem();
        String education = (String) combobox4.getSelectedItem();
        String occupation = (String) combobox5.getSelectedItem();

        String pan = textField2.getText();
        String aadhar = textField3.getText();

        String scitizen = " ";
        if (r1.isSelected()) {
            scitizen = "Yes";
        } else if (r2.isSelected()) {
            scitizen = "No";
        }

        String eAccount = " ";
        if (r4.isSelected()) {
            eAccount = "Yes";
        } else if (r5.isSelected()) {
            eAccount = "No";
        }

        try {
            if (textField2.getText().equals("") || textField3.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            } else {
                Conn c1 = new Conn();
                String q = "insert into Signuptwo values('" + formno + "', '" + rel + "', '" + cate + "', '" + income
                        + "', '" + education + "', '" + occupation + "', '" + pan + "', '" + aadhar + "', '" + scitizen
                        + "', '" + eAccount + "')";
                c1.statement.executeUpdate(q);
                new signup3(formno);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String args[]) {
        new signup2("");
    }
}
