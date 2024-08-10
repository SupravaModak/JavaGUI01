package guiapplicationpack;
import java.awt.Color;
import javax.swing.JFrame;
class MainFrame extends JFrame{
    
}
public class MainClass {
    public static void main(String[] args) {
       MainFrame frame=new MainFrame();
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(700,500);
       frame.setLocation(300,200);
       frame.setLocationRelativeTo(null);
       frame.setTitle("My first window");
       frame.setBounds(300, 200, 700, 500);
       frame.getContentPane().setBackground(Color.RED);
    }
}
