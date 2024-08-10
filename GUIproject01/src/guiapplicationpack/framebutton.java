/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapplicationpack;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.xml.bind.Marshaller.Listener;
/**
 *
 * @author Suprava Modak
 */
class MyListener implements ActionListener{
    private MainPanel mpanel;
    private int mode;
    public MyListener(MainPanel mp,int m){
        mpanel=mp;
        mode=m;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mpanel.setBackground(Color.RED);
    }
    
}
class MainPanel extends JPanel
{
       private JButton btnBlue,btnGreen,btnRed;
       private MyListener actRed=new MyListener(this,1);
       private MyListener actGreen=new MyListener(this,2);
       private MyListener actBlue=new MyListener(this,3);
       public MainPanel(){
           // btnBlue =new JButton("Blue");
           ActionListener act=new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   Object ob=e.getSource();
                   if(ob==btnBlue)
                       setBackground(Color.GREEN);
                   else if(ob==btnGreen)
                        setBackground(Color.BLUE);
                   else if(ob==btnRed)
                        setBackground(Color.RED);
                   
                   
               }
           };
           btnRed=new JButton("RED");
           btnRed.addActionListener(act);
           super.add(btnRed);
           
           btnGreen=new JButton("BLUE");
           btnGreen.addActionListener(act);
           super.add(btnGreen);
           
           btnBlue=new JButton("GREEN");
           btnBlue.addActionListener(act);
           super.add(btnBlue);
           
           
       }
}
class MainFrame3 extends JFrame{
    private MainPanel panel;
    public MainFrame3(){
        panel =new MainPanel();
        panel.setBackground(Color.yellow);
        super.add(panel);
    }
}
public class framebutton{
    public static void main(String[] args) {
       MainFrame3 frame=new MainFrame3();
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLocationRelativeTo(null);
       frame.setSize(700, 400);
       frame.setTitle(" first button");
       frame.getContentPane().setBackground(Color.yellow);
    }
}
