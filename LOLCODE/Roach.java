import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
/**
 * Write a description of class Roach here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Roach
{
    private int xLeft;
    private int yTop;
    
    public Roach(int x, int y)
    {
        xLeft = x; 
        yTop = y;
    }
    
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double body = new Ellipse2D.Double(xLeft, yTop, 10, 20);
        Color brown = new Color(85,62,44);
        g2.setColor(brown);
        g2.fill(body);
        g2.draw(body);
    }
}