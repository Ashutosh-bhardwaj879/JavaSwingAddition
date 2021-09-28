
package swingdemos;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstGUI {
        public static void main(String[] args){
        Abc obj = new Abc();
        
    }
}
class Abc extends JFrame
{
    public Abc()
    {
        
        
        
        JLabel l1 = new JLabel("Hello World");
        JLabel l2 = new JLabel("Welcome Naveen");
        //add text to screen
        add(l1);
        add(l2);
        
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