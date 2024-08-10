/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapplicationpack;
import java.awt.Dimension;
import javax.swing.JFrame;
class MainFrame1 extends JFrame{
    public static void main(String[] args) {
       MainFrame frame=new MainFrame();
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setTitle("My First Frame");
       frame.setSize(700,600);
       frame.setBounds(400, 400, 700, 600);
       frame.setLocation(150,50);
       frame.setLocationRelativeTo(null);
       frame.setMinimumSize(new Dimension(400, 400));
       
}
}