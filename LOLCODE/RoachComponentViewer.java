import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComponent;

public class RoachComponentViewer
{
    public static void main(String[] args)
    {
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,75);
        final JFrame roachFrame = new JFrame();
        class PressListener implements ActionListener
        {
            private int roachCount;
            public PressListener()
            {
                roachCount = 1;
            }

            public void actionPerformed(ActionEvent event)
            {                
                for(int i = 0; i < roachCount; i++)
                {
                   RoachComponent temp = new RoachComponent();
                   roachFrame.add(temp);
                   roachFrame.setVisible(true);
                }
                roachCount = roachCount * 2;
            }
        }
        
        RoachComponent roach1 = new RoachComponent();
        
        JButton button = new JButton("Double the roaches!");
        ActionListener listener = new PressListener();
        button.addActionListener(listener);
        roachFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        roachFrame.setSize(700,1000);
        roachFrame.setLocation(300,0);
        
        roachFrame.add(roach1);
        roachFrame.setVisible(true);
        frame.add(button);
        frame.setVisible(true);
        
    }
}