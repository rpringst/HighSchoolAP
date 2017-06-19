
/**
 * A Hello, World variant that requires input from the user.
 * 
 * @Robert Ringstad
 * @27 August 2009
 */

import javax.swing.JOptionPane;

public class DialogViewer
{
    public static void main(String [] args)
    {
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.print("Hello, ");
        System.out.print(name);
        System.out.print("!");
    }
}
