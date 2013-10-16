// The first GUI exercise - 4.1 a) 
import java.awt.Graphics;
import javax.swing.JPanel;
public class Ques4G1 extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int width = getWidth(); // to get full width of the frame being used
        int height = getHeight(); // to get full height of the frame being used
        int count = 1;
        
        while (count <= 15)
        {
            g.drawLine(0, 0, width/15 * count, height-(height/15 * count));
            count++;
        }
    }
}
