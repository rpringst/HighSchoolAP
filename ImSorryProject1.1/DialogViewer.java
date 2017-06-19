
/**
 * Parody of I can't do that Dave.
 * 
 * @Robert Ringstad
 * @v27 August 2009
 */

import javax.swing.JOptionPane;

public class DialogViewer
{
    public static void main(String [] args)
    {
        String name = JOptionPane.showInputDialog("What would you like me to do?");
        JOptionPane.showMessageDialog(null, "I'm sorry " + name + ". I can't do that.");
        
    }
}
