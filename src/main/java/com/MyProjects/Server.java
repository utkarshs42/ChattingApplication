package com.MyProjects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Server extends JFrame implements ActionListener {

    public Server(){
         setLayout(null);
         JPanel p1 = new JPanel();
         p1.setBackground(new Color(7, 95, 85));
         p1.setBounds(0, 0, 450, 70);
         p1.setLayout(null);
         add(p1);

         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
         Image i1s = i1.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
         ImageIcon i1f = new ImageIcon(i1s);
         JLabel back = new JLabel(i1f);
         back.setBounds(5, 20, 25, 25);
         p1.add(back);

         back.addMouseListener(new MouseAdapter() {
              public void mouseClicked(MouseEvent ae) {
                   System.exit(0);
              }
         });

         ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("icons/1.png"));
         Image i2s = i2.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
         ImageIcon i2f = new ImageIcon(i2s);
         JLabel dp = new JLabel(i2f);
         dp.setBounds(40, 10, 50, 50);
         p1.add(dp);

         ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("icons/video.png"));
         Image i3s = i3.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
         ImageIcon i3f = new ImageIcon(i3s);
         JLabel vIcon = new JLabel(i3f);
         vIcon.setBounds(300, 20, 30, 30);
         p1.add(vIcon);

         ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/phone.png"));
         Image i4s = i4.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
         ImageIcon i4f = new ImageIcon(i4s);
         JLabel pIcon = new JLabel(i4f);
         pIcon.setBounds(360, 20, 30, 30);
         p1.add(pIcon);

         ImageIcon i5 = new ImageIcon(ClassLoader.getSystemResource("icons/3icon.png"));
         Image i5s = i5.getImage().getScaledInstance(10,25,Image.SCALE_DEFAULT);
         ImageIcon i5f = new ImageIcon(i5s);
         JLabel morevert = new JLabel(i5f);
         morevert.setBounds(410, 20, 10, 25);
         p1.add(morevert);


         JLabel name = new JLabel("Gaitonde");
         name.setBounds(110,15,100,18);
         name.setFont(new Font("Arial",Font.BOLD,18));
         name.setForeground(Color.WHITE);
         p1.add(name);

         JLabel status = new JLabel("Active Now");
         status.setBounds(110,40,100,14);
         status.setFont(new Font("Arial",Font.ITALIC,14));
         status.setForeground(Color.WHITE);
         p1.add(status);

         JPanel p2 = new JPanel();
         p2.setLayout(null);
         p2.setBounds(5,75,440,570);
         add(p2);

         JTextField text = new JTextField();
         text.setBounds(5,655,350,40);
         text.setFont(new Font("Arial",Font.PLAIN,16));
         add(text);

         JButton send = new JButton("Send");
         send.setBounds(360,655,80,40);
         send.setBackground(new Color(7, 95, 85));
         send.setFont(new Font("Arial",Font.PLAIN,16));
         send.setForeground(Color.WHITE);
         add(send);


         setSize(450,700);
         setLocation(200,50);
         setUndecorated(true);
         getContentPane().setBackground(Color.WHITE);
         setVisible(true);
    }

     @Override
     public void actionPerformed(ActionEvent e) {

     }
}
