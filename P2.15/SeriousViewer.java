
/**
 * Write a description of class NameViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import javax.swing.JFrame;

public class SeriousViewer
{
   public static void main(String[] args)
   {
       JFrame frame = new JFrame();
       frame.setSize(300, 400);
       frame.setTitle("This face is a SERIOUS PANDA face!");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       SeriousComponent component = new SeriousComponent();
       frame.add (component);
       
       frame.setVisible(true);
       
    }
}
