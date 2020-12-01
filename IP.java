/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japps;

import java.net.*;
import java.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IP extends JFrame {

    JTextField t;
    JButton b, a;
    JLabel l,l1;

    public IP(String s) {
        super(s);
    }

    public void setcomponents() {
        t = new JTextField();
        b = new JButton("FIND IP");
        a = new JButton("ADD NEW URL");
        l = new JLabel();
        l1=new JLabel("ENTER URL");
        setLayout(null);
        t.setBounds(50,50,200,20);
        b.setBounds(80,120,80,30);
        a.setBounds(80,190,130,30);
        l.setBounds(50,250,400,20);
        l1.setBounds(50,75,100,20);
        add(t);
        add(l1);
        add(b);
        add(a);
        add(l);
        b.addActionListener(new Handler());
        a.addActionListener(new Handler());
    }

    public void find() throws UnknownHostException {

        // The URL for which IP address needs to be fetched 
        String s1 = t.getText();

        try {
            // Fetch IP address by getByName() 
            InetAddress ip = InetAddress.getByName(new URL(s1)
                    .getHost());

            // Print the IP address 
            l.setText("Public IP Address of: " + ip);
        } catch (MalformedURLException e) {
            // It means the URL is invalid 
            l.setText("Invalid URL");
        }
    }

    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b) {
                try {
                    find();
                } catch (UnknownHostException ex) {
                    Logger.getLogger(IP.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (e.getSource() == a) {
                t.setText("");
                l.setText("");
            }
        }
    }

    public static void main(String args[]) {
        IP p = new IP("IP Finder");
        p.setcomponents();
        p.setSize(500, 500);
        p.setVisible(true);
        p.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
