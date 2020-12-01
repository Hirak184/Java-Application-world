/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package japps;
import javax.swing.*;
import java.awt.event.*;
public class JApps extends JFrame
{TicTac ob;
Editor ob1;
IP ob2;
Calc ob3;
    public JApps(String s)
    {
        super(s);
        this.ob=new TicTac("TIC TAC TOE");
        this.ob1=new Editor("NOTEPAD");
        this.ob2=new IP("IP FINDER");
        this.ob3=new Calc("CALCULATOR");
    }
    JButton b1,b2,b3,b4;
    JLabel l1;
public void setComponents()
{
    ImageIcon calc=new ImageIcon("C:\\Users\\Hirak\\Documents\\NetBeansProjects\\JApps\\src\\japps\\download (1).png");
    ImageIcon tictac=new ImageIcon("C:\\Users\\Hirak\\Documents\\NetBeansProjects\\JApps\\src\\japps\\download.png");
    ImageIcon note=new ImageIcon("C:\\Users\\Hirak\\Documents\\NetBeansProjects\\JApps\\src\\japps\\download (2).png");
    ImageIcon ip=new ImageIcon("C:\\Users\\Hirak\\Documents\\NetBeansProjects\\JApps\\src\\japps\\ip.jpg");
    b1=new JButton("CALC",calc);
    b2=new JButton("TiTaTo",tictac);
    b3=new JButton("NOTE",note);
    b4=new JButton("",ip);
    l1=new JLabel(new ImageIcon("C:\\Users\\Hirak\\Documents\\NetBeansProjects\\JApps\\src\\japps\\depositphotos_212108280-stock-illustration-statistics-big-data-analytical-indicator.jpg"));
    setLayout(null);
    b1.setBounds(200,100,200,200);
    b2.setBounds(500,100,200,200);
    b3.setBounds(500,400,200,200);
    b4.setBounds(200,400,200,200);
    l1.setBounds(0,0,1000,1000);
    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(l1);
    b1.addActionListener(new Handler());
    b2.addActionListener(new Handler());
    b3.addActionListener(new Handler());
    b4.addActionListener(new Handler());
}
    class Handler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==b2)
            {
                ob.setVisible(true);
                ob.setSize(400,400);
                ob.setComponents();
            }
            else if(e.getSource()==b3)
            {
                ob1.setVisible(true);
                ob1.setSize(1000,1000);
                ob1.setComponents();
            }
            else if(e.getSource()==b4)
            {
                ob2.setVisible(true);
                ob2.setSize(500,500);
                ob2.setcomponents();
            }
            else if(e.getSource()==b1)
            {
                ob3.setVisible(true);
                ob3.component();
                ob3.setSize(400,550);
            }
        }
    }
    public static void main(String[] args)
    {
    JApps j=new JApps("JAPPS WORLD");
        j.setSize(1000,1000);
        j.setComponents();
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.setVisible(true);
    }
    
}
