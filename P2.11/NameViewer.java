
/**
 * Write a description of class NameViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import javax.swing.JFrame;

public class NameViewer
{
   public static void main(String[] args)
   {
       JFrame frame = new JFrame();
       frame.setSize(300, 400);
       frame.setTitle("My Name is Robert");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       NameComponent component = new NameComponent();
       frame.add (component);
       
       frame.setVisible(true);
       
    }
}
