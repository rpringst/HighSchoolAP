import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
import java.awt.Color;

public class RoachComponent extends JComponent
{
    private Roach roach;
    private int x;
    private int y;
    
    public RoachComponent()
    {    
       Random gen = new Random();
       x = gen.nextInt(780);
       y = gen.nextInt(980);
       roach = new Roach(x, y);
    }
    
    public RoachComponent(int dx, int dy)
    {
        x = dx;
        y = dy;
    }        

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        roach.draw(g2);
    }
    
    public void setRandomLocation()
    {
        Random gen = new Random();
        x = gen.nextInt(780);
        y = gen.nextInt(980);
    }
}