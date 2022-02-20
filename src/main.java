import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class main {

    public static void main(String[] args){
        //IP Finder App

        JFrame jFrame = new JFrame("IP Finder Program");
        jFrame.setBounds(100, 100, 300, 300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

        JLabel label = new JLabel("Enter URL: ");
        label.setBounds(50,70,150,20);
        //label.setVisible(true);

        JTextField textField = new JTextField();
        textField.setBounds(50, 100, 200, 20);
        //textField.setVisible(true);

        JButton button = new JButton("Find IP");
        button.setBounds(50,150,80,30);
        //button.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = textField.getText();
                try {
                        InetAddress ia = InetAddress.getByName(url);
                        String ip = ia.getHostAddress();
                        JOptionPane.showMessageDialog(jFrame, ip);
                    } catch (UnknownHostException ex) {
                        ex.printStackTrace();
                    }
            }
        });

        jFrame.add(textField);
        jFrame.add(label);
        jFrame.add(button);

        jFrame.setLayout(new GridLayout());
    }
}
