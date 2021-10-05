/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.controller;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author USER
 */
public class CheckPackage  extends JFrame{
   CheckPackage(){
   setBounds(600, 250, 900, 600);
   
   String[] package1 = new String[]{"GOLD PACKAGE", "6 Days and 7 Nights", "Transport Assistance", "Half Day Tour", "Daily Buffet", "BOOK NOW", "SUMMER SPECIAL", "Tk. 12000/-", "img4.jpg"};
   String[] package2 = new String[]{"SILVER PACKAGE", "5 Days and 6 Nights", "Transport Assistance", "Full Day Tour", "Lunch with Dinner", "BOOK NOW", "WINTER SPECIAL", "Tk. 24000/-", "img5.jpg"};
   String[] package3 = new String[]{"BRONZE PACKAGE", "6 Days and 5 Nights", "Transport Assistance", "Free Return Ticket", "Whole Day's Meal", "BOOK NOW", "WINTER SPECIAL", "Tk. 32000/-", "img6.jpg"};
   
   JTabbedPane pane = new JTabbedPane();
   JPanel p1 = createPackage(package1); 
   pane.addTab("Package 1", null, p1);
   
   JPanel p2 = createPackage(package2);
   pane.addTab("Package 2", null, p2);
   
   JPanel p3 = createPackage(package3);
   pane.addTab("Package 3", null, p3);
   add(pane, BorderLayout.CENTER);
   }
    
   
   public JPanel createPackage(String[] pack){
       JPanel p1 = new JPanel();
       p1.setLayout(null);
       p1.setBackground(Color.WHITE);
       
       JLabel l1 = new JLabel(pack[0]);
       l1.setBounds(50, 10, 300, 30);
       l1.setFont(new Font("Tahoma", Font.PLAIN, 30));
       p1.add(l1);
       
       JLabel l2 = new JLabel(pack[1]);
       l2.setBounds(30, 60, 300, 30);
       l2.setForeground(Color.RED);
       l2.setFont(new Font("Tahoma", Font.PLAIN, 30));
       p1.add(l2);
       
       JLabel l3 = new JLabel(pack[2]);
       l3.setBounds(30, 120, 300, 30);
       l3.setForeground(Color.BLUE);
       l3.setFont(new Font("Tahoma", Font.PLAIN, 30));
       p1.add(l3);
       
       JLabel l4 = new JLabel(pack[3]);
       l4.setBounds(30, 180, 300, 30);
       l4.setForeground(Color.RED);
       l4.setFont(new Font("Tahoma", Font.PLAIN, 30));
       p1.add(l4);
       
       JLabel l5 = new JLabel(pack[4]);
       l5.setBounds(30, 240, 300, 30);
       l5.setForeground(Color.BLUE);
       l5.setFont(new Font("Tahoma", Font.PLAIN, 30));
       p1.add(l5);
       
       JLabel l6 = new JLabel(pack[5]);
       l6.setBounds(30, 330, 300, 30);
       l6.setForeground(Color.RED);
       l6.setFont(new Font("Tahoma", Font.PLAIN, 30));
       p1.add(l6);
       
       JLabel l7 = new JLabel(pack[6]);
       l7.setBounds(30, 420, 300, 30);
       l7.setForeground(Color.BLUE);
       l7.setFont(new Font("Tahoma", Font.PLAIN, 30));
       p1.add(l7);
       
       JLabel l8 = new JLabel(pack[7]);
       l8.setBounds(700, 420, 300, 30);
       l8.setForeground(Color.RED);
       l8.setFont(new Font("Tahoma", Font.PLAIN, 30));
       p1.add(l8);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/project/icon/"+pack[8]));
       Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel l9 = new JLabel(i3);
       l9.setBounds(350, 20, 500, 300);
       p1.add(l9);
       return p1;
   }
           
    public static void main(String[] args) {
        new CheckPackage().setVisible(true);
    }
}
