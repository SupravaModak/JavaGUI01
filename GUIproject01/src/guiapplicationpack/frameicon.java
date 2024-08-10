/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapplicationpack;

/**
 *
 * @author Suprava Modak
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
class MainFrame2 extends JFrame{
    public static void main(String[] args) {
       MainFrame frame=new MainFrame();
       Toolkit tk=Toolkit.getDefaultToolkit();
       frame.setVisible(true);
       int w=tk.getScreenSize().height;
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.getContentPane().setBackground(Color.YELLOW);
       frame.setLocationRelativeTo(null);
       frame.setResizable(false);
       frame.setSize(tk.getScreenSize().width/2,tk.getScreenSize().height/2);
       frame.setBounds(400, 400, 700, 600);
       frame.setLocation(150,50);
}
}
