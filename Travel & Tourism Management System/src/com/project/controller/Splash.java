/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.controller;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author USER
 */
public class Splash {

    public static void main(String[] args) {
        SplashFrame frame = new SplashFrame();
        frame.setVisible(true);
        int x = 1;
        for (int i = 1; i <= 700; i += 6, x += 7) {
            frame.setLocation(100, 100);
            frame.setSize(x + i, i);
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
        }

        frame.setVisible(true);
    }

}

class SplashFrame extends JFrame implements Runnable {

    Thread t1;

    SplashFrame() {
        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("com/project/icon/241395.jpg"));
        Image img = ic.getImage().getScaledInstance(1600, 700, Image.SCALE_DEFAULT);
        ImageIcon ic1 = new ImageIcon(img);
        JLabel l = new JLabel(ic1);
        add(l);
//        setBounds(200, 200, 1600, 700);
        t1 = new Thread(this);
        t1.start();
    }

    public void run() {
        try {
            Thread.sleep(7000);
            this.setVisible(false);
            new Start().setVisible(true);
        } catch (Exception e) {
        }
    }
}
