//using NETBEANS AND TELUSKO

/https://www.youtube.com/watch?v=QLNYiW2PBGM&list=PLsyeobzWxl7pVZdyDXj0arOdTzo4MYekh&index=7
package swingdemos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddGUI {
    public static void main(String[] args){
        Addition obj = new Addition();
    }
}
class Addition extends JFrame implements ActionListener
{
    JTextField t1,t2;
    JButton b;
    JTextField l1;
    public Addition()
    {
        t1 = new JTextField(10);
        
        t2 = new JTextField(10);
        
        
        b = new JButton("OK");
        
        l1 = new JTextField("Result");
        
        add(t1);
        add(t2);
        add(b);
        add(l1);
        
        //action listener is an interface
        b.addActionListener(this);
        
        
        
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
    
    public void actionPerformed(ActionEvent ae)
    {
        //getText returns string convert   it to int using INteger .parseInt
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int value = num1 + num2;
        //set Text needs string so added "" with value
        l1.setText(value + "");
    
        
    }
}