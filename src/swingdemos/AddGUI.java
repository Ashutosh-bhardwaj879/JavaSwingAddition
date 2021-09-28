
package swingdemos;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddGUI {
    public static void main(String[] args){
        Addition obj = new Addition();
    }
}
class Addition extends JFrame
{
    public Addition()
    {
        JTextField t1 = new JTextField(10);
        
        JTextField t2 = new JTextField(10);
        
        
        JButton b = new JButton("OK");
        
        JLabel l1 = new JLabel("Result");
        
        add(t1);
        add(t2);
        add(b);
        add(l1);
        //layout helps in seeing Jframe 
        //default layout is Crd layout
        // import karna mat bhulnaa
        setLayout(new FlowLayout());
        //isse visible hoga box of app
        setVisible(true);
        //size of our app
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}