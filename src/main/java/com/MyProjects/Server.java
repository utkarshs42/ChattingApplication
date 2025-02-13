package com.MyProjects;

import javax.swing.*;
import java.awt.*;

public class Server extends JFrame {

    public Server(){
         setLayout(null);
         JPanel p1 = new JPanel();
         p1.setBackground(new Color(7, 95, 85));
         p1.setBounds(0, 0, 450, 70);
         p1.setLayout(null);
         add(p1);

         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
         JLabel back = new JLabel(i1);
         back.setBounds(5, 20, 25, 25);
         p1.add(back);

         setSize(450,700);
         setLocation(200,50);
         getContentPane().setBackground(Color.WHITE);
         setVisible(true);
    }
}
