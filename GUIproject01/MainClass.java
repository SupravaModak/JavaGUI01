package guiapplicationpack;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
class MainFrame extends JFrame{
    
}
public class MainClass {
    public static void main(String[] args) {
        Toolkit tk=Toolkit.getDefaultToolkit();
        Image img =tk.getImage("download.jpeg");
       MainFrame frame=new MainFrame();
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.getContentPane().setBackground(Color.BLACK);
       //frame.setSize(700,500);
      // frame.setLocation(300,200);
      // frame.setLocationRelativeTo(null);
       frame.setTitle("My first window");
       frame.setBounds(300, 200, 700, 500);
       frame.setIconImage(img);
       
    }
}
