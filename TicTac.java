/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package japps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TicTac extends JFrame {
    JButton t1,t2,t3,t4,t5,t6,t7,t8,t9,replay;
    JLabel l;
    public TicTac(){}
    public TicTac(String s)
    {
        super(s);
    }
    public void setComponents()
    {
        t1=new JButton();
        t2=new JButton();
        t3=new JButton();
        t4=new JButton();
        t5=new JButton();
        t6=new JButton();
        t7=new JButton();
        t8=new JButton();
        t9=new JButton();
        replay=new JButton();
        l=new JLabel();
      
        setLayout(null);
        t1.setBounds(100,100,50,50);
        t2.setBounds(150,100,50,50);
        t3.setBounds(200,100,50,50);
        t4.setBounds(100,150,50,50);
        t5.setBounds(150,150,50,50);
        t6.setBounds(200,150,50,50);
        t7.setBounds(100,200,50,50);
        t8.setBounds(150,200,50,50);
        t9.setBounds(200,200,50,50);
        replay.setBounds(130,270,100,20);
        l.setBounds(20,20,300,80);
        
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(t6);
        add(t7);
        add(t8);
        add(t9);
        add(replay);
        add(l);
        t1.addActionListener(new Handler());
        t2.addActionListener(new Handler());
        t3.addActionListener(new Handler());
        t4.addActionListener(new Handler());
        t5.addActionListener(new Handler());
        t6.addActionListener(new Handler());
        t7.addActionListener(new Handler());
        t8.addActionListener(new Handler());
        t9.addActionListener(new Handler());
        replay.addActionListener(new Handler());
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        t7.setText("");
        t8.setText("");
        t9.setText("");
        replay.setText("Play Again");
        
    }
    public void won()
    {
        if(t1.getText().equals("X")&&t2.getText().equals("X")&&t3.getText().equals("X"))
        {
          l.setText("Player 1 is the Winner");
    }
        else if(t4.getText().equals("X")&&t5.getText().equals("X")&&t6.getText().equals("X"))
        {
          l.setText("Player 1 is the Winner");  
        }
        else if(t7.getText().equals("X")&&t8.getText().equals("X")&&t9.getText().equals("X"))
        {
            l.setText("Player 1 is the Winner");
        }
        else if(t1.getText().equals("X")&&t4.getText().equals("X")&&t7.getText().equals("X"))
        {
            l.setText("Player 1 is the Winner");
        }
        else if(t2.getText().equals("X")&&t5.getText().equals("X")&&t8.getText().equals("X"))
        {
            l.setText("Player 1 is the Winner");
        }
        else if(t3.getText().equals("X")&&t6.getText().equals("X")&&t9.getText().equals("X"))
        {
            l.setText("Player 1 is the Winner");
        }
        else if(t1.getText().equals("X")&&t5.getText().equals("X")&&t9.getText().equals("X"))
        {
            l.setText("Player 1 is the Winner");
        }
        else if(t3.getText().equals("X")&&t5.getText().equals("X")&&t7.getText().equals("X"))
        {
            l.setText("Player 1 is the Winner");
        }
        if(t1.getText().equals("O")&&t2.getText().equals("O")&&t3.getText().equals("O"))
        {
          l.setText("Player 2 is the Winner");
    }
        else if(t4.getText().equals("O")&&t5.getText().equals("O")&&t6.getText().equals("O"))
        {
          l.setText("Player 2 is the Winner");  
        }
        else if(t7.getText().equals("O")&&t8.getText().equals("O")&&t9.getText().equals("O"))
        {
            l.setText("Player 2 is the Winner");
        }
        else if(t1.getText().equals("O")&&t4.getText().equals("O")&&t7.getText().equals("O"))
        {
            l.setText("Player 2 is the Winner");
        }
        else if(t2.getText().equals("O")&&t5.getText().equals("O")&&t8.getText().equals("O"))
        {
            l.setText("Player 2 is the Winner");
        }
        else if(t3.getText().equals("O")&&t6.getText().equals("O")&&t9.getText().equals("O"))
        {
            l.setText("Player 2 is the Winner");
        }
        else if(t1.getText().equals("O")&&t5.getText().equals("O")&&t9.getText().equals("O"))
        {
            l.setText("Player 2 is the Winner");
        }
        else if(t3.getText().equals("O")&&t5.getText().equals("O")&&t7.getText().equals("O"))
        {
            l.setText("Player 2 is the Winner");
        }
         if(!"".equals(t1.getText())&&!"".equals(t2.getText())&&!"".equals(t3.getText())&&!"".equals(t4.getText())&&!"".equals(t5.getText())&&!"".equals(t6.getText())&&!"".equals(t7.getText())&&!"".equals(t8.getText())&&!"".equals(t9.getText()))
         {
            if(t1.getText().equals("X")&&t5.getText().equals("X")&&t9.getText().equals("O")||t1.getText().equals("O")&&t5.getText().equals("O")&&t9.getText().equals("X")||t1.getText().equals("X")&&t5.getText().equals("O")&&t9.getText().equals("X")||t1.getText().equals("O")&&t5.getText().equals("X")&&t9.getText().equals("O")||t1.getText().equals("O")&&t5.getText().equals("X")&&t9.getText().equals("X")||t1.getText().equals("X")&&t5.getText().equals("O")&&t9.getText().equals("O")) 
            {
              l.setText("The match ends in a Draw");  
            }
        if(t1.getText().equals("X")&&t2.getText().equals("X")&&t3.getText().equals("X"))
        {
          l.setText("Player 1 is the Winner");
    }
        else if(t4.getText().equals("X")&&t5.getText().equals("X")&&t6.getText().equals("X"))
        {
          l.setText("Player 1 is the Winner");  
        }
        else if(t7.getText().equals("X")&&t8.getText().equals("X")&&t9.getText().equals("X"))
        {
            l.setText("Player 1 is the Winner");
        }
        else if(t1.getText().equals("X")&&t4.getText().equals("X")&&t7.getText().equals("X"))
        {
            l.setText("Player 1 is the Winner");
        }
        else if(t2.getText().equals("X")&&t5.getText().equals("X")&&t8.getText().equals("X"))
        {
            l.setText("Player 1 is the Winner");
        }
        else if(t3.getText().equals("X")&&t6.getText().equals("X")&&t9.getText().equals("X"))
        {
            l.setText("Player 1 is the Winner");
        }
        else if(t1.getText().equals("X")&&t5.getText().equals("X")&&t9.getText().equals("X"))
        {
            l.setText("Player 1 is the Winner");
        }
        else if(t3.getText().equals("X")&&t5.getText().equals("X")&&t7.getText().equals("X"))
        {
            l.setText("Player 1 is the Winner");
        }
        if(t1.getText().equals("O")&&t2.getText().equals("O")&&t3.getText().equals("O"))
        {
          l.setText("Player 2 is the Winner");
    }
        else if(t4.getText().equals("O")&&t5.getText().equals("O")&&t6.getText().equals("O"))
        {
          l.setText("Player 2 is the Winner");  
        }
        else if(t7.getText().equals("O")&&t8.getText().equals("O")&&t9.getText().equals("O"))
        {
            l.setText("Player 2 is the Winner");
        }
        else if(t1.getText().equals("O")&&t4.getText().equals("O")&&t7.getText().equals("O"))
        {
            l.setText("Player 2 is the Winner");
        }
        else if(t2.getText().equals("O")&&t5.getText().equals("O")&&t8.getText().equals("O"))
        {
            l.setText("Player 2 is the Winner");
        }
        else if(t3.getText().equals("O")&&t6.getText().equals("O")&&t9.getText().equals("O"))
        {
            l.setText("Player 2 is the Winner");
        }
        else if(t1.getText().equals("O")&&t5.getText().equals("O")&&t9.getText().equals("O"))
        {
            l.setText("Player 2 is the Winner");
        }
        else if(t3.getText().equals("O")&&t5.getText().equals("O")&&t7.getText().equals("O"))
        {
            l.setText("Player 2 is the Winner");
        }    
         }
    }      
    
    
       boolean player1turn=true;
       boolean player2turn=false;
    
    class Handler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
          if(e.getSource()==t1)
          {
              if(player1turn==true)
              {
                  if(t1.getText().equals(""))
                  {
                      t1.setText("X");
                      player1turn=false;
                      player2turn=true;
                      won();
                  }
              }
              else if(player2turn==true)
              {
                  if(t1.getText().equals(""))
                  {
                      t1.setText("O");
                      player2turn=false;
                      player1turn=true;
                      won();
                  }
              }
          }
          if(e.getSource()==t2)
          {
              if(player1turn==true)
              {
                  if(t2.getText().equals(""))
                  {
                      t2.setText("X");
                      player1turn=false;
                      player2turn=true;
                      won();
                  }
              }
              else if(player2turn==true)
              {
                  if(t2.getText().equals(""))
                  {
                      t2.setText("O");
                      player2turn=false;
                      player1turn=true;
                      won();
                  }
              }
          }
          if(e.getSource()==t3)
          {
              if(player1turn==true)
              {
                  if(t3.getText().equals(""))
                  {
                      t3.setText("X");
                      player1turn=false;
                      player2turn=true;
                      won();
                  }
              }
              else if(player2turn==true)
              {
                  if(t3.getText().equals(""))
                  {
                      t3.setText("O");
                      player2turn=false;
                      player1turn=true;
                      won();
                  }
              }
          }
          if(e.getSource()==t4)
          {
              if(player1turn==true)
              {
                  if(t4.getText().equals(""))
                  {
                      t4.setText("X");
                      player1turn=false;
                      player2turn=true;
                      won();
                  }
              }
              else if(player2turn==true)
              {
                  if(t4.getText().equals(""))
                  {
                      t4.setText("O");
                      player2turn=false;
                      player1turn=true;
                      won();
                  }
              }
          }
          if(e.getSource()==t5)
          {
              if(player1turn==true)
              {
                  if(t5.getText().equals(""))
                  {
                      t5.setText("X");
                      player1turn=false;
                      player2turn=true;
                      won();
                  }
              }
              else if(player2turn==true)
              {
                  if(t5.getText().equals(""))
                  {
                      t5.setText("O");
                      player2turn=false;
                      player1turn=true;
                      won();
                  }
              }
          }
          if(e.getSource()==t6)
          {
              if(player1turn==true)
              {
                  if(t6.getText().equals(""))
                  {
                      t6.setText("X");
                      player1turn=false;
                      player2turn=true;
                      won();
                  }
              }
              else if(player2turn==true)
              {
                  if(t6.getText().equals(""))
                  {
                      t6.setText("O");
                      player2turn=false;
                      player1turn=true;
                      won();
                  }
              }
          }
          if(e.getSource()==t7)
          {
              if(player1turn==true)
              {
                  if(t7.getText().equals(""))
                  {
                      t7.setText("X");
                      player1turn=false;
                      player2turn=true;
                      won();
                  }
              }
              else if(player2turn==true)
              {
                  if(t7.getText().equals(""))
                  {
                      t7.setText("O");
                      player2turn=false;
                      player1turn=true;
                      won();
                  }
              }
          }
          
          if(e.getSource()==t8)
          {
              if(player1turn==true)
              {
                  if(t8.getText().equals(""))
                  {
                      t8.setText("X");
                      player1turn=false;
                      player2turn=true;
                      won();
                  }
              }
              else if(player2turn==true)
              {
                  if(t8.getText().equals(""))
                  {
                      t8.setText("O");
                      player2turn=false;
                      player1turn=true;
                      won();
                  }
              }
          }
          if(e.getSource()==t9)
          {
              if(player1turn==true)
              {
                  if(t9.getText().equals(""))
                  {
                      t9.setText("X");
                      player1turn=false;
                      player2turn=true;
                      won();
                  }
              }
              else if(player2turn==true)
              {
                  if(t9.getText().equals(""))
                  {
                      t9.setText("O");
                      player2turn=false;
                      player1turn=true;
                      won();
                  }
              }
          }
          if(e.getSource()==replay)
          {
              t1.setText("");
              t2.setText("");
              t3.setText("");
              t4.setText("");
              t5.setText("");
              t6.setText("");
              t7.setText("");
              t8.setText("");
              t9.setText("");
              player1turn=true;
              player2turn=false;
              l.setText("");
          }
        }
    }
    public static void main(String args[])
    {
        
        TicTac c=new TicTac("TIC TAC TOE");
        c.setComponents();
     
        c.setSize(400,400);
        c.setVisible(true);
        c.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
