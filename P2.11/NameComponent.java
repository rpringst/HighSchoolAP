
/**
 * Write a description of class NameComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JPanel;
import javax.swing.JComponent;

public class NameComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        //The Blue Rectangle
        Rectangle box = new Rectangle(25, 25, 75, 50);
        g2.setColor(Color.BLUE);
        g2.fill(box);
        
        //The Red Text
        g2.setColor(Color.RED);
        g2.drawString("Robert", 35, 50);
    }
}
