package guiapp04;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class MainPanel extends JPanel
{
    private JTextField      txtName;
    private JPasswordField  txtPwd;
    private JTextArea txtAddress;
    private JScrollPane spnAddress;
    
    private JComponent makeTextBox(int x,int y,int w,int h,int mode)
    {
        JComponent temp = null;
        if(mode == 0)
            temp = new JTextField();
        else if(mode == 1)
            temp = new JPasswordField();
        temp.setFont(new Font("Courier New",1,16));
        temp.setBounds(x,y,w,h);
        super.add(temp);
        return temp;
    }
    
    public MainPanel()
    {
        txtName = (JTextField)makeTextBox(10,10,350,30,0);//system defined class is allowed for downcasting 
        txtName.setHorizontalAlignment(JTextField.CENTER);
        
        txtPwd = (JPasswordField)makeTextBox(10,60,350,30,1);
        txtPwd.setHorizontalAlignment(JTextField.CENTER);
        txtPwd.setEchoChar('*');
        txtAddress=new JTextArea();
        txtAddress.setLineWrap(true);
        txtAddress.setFont(new Font("Courier New",1,16));
        spnAddress=new JScrollPane(txtAddress);
        spnAddress.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        txtAddress.setBounds(10,110,350,100);
        super.add(spnAddress);
    }
}
class MainFrame extends JFrame
{
    private MainPanel panel;
    public MainFrame()
    {
        panel = new MainPanel();
        panel.setBackground(Color.YELLOW);
        panel.setLayout(new BorderLayout());
        super.add(panel);
    }
}
public class MainClass
{
    public static void main(String[] args)
    {
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("New User Regestration");
        frame.setSize(600, 400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
}

