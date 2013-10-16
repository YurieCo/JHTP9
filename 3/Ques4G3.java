// The second GUI exercise - 4.2 a) 
import java.awt.Graphics;
import javax.swing.JPanel;
public class Ques4G3 extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        int counter = 0;
        
        while (counter < 15)
        {
            g.drawLine(0, counter*15, (counter+1) * 15, height);
            g.drawLine(width, height-(counter*15), width - (counter+1)*15, 0);
            g.drawLine(0, height-(counter*15), (counter+1)*15, 0);
            g.drawLine(width, height-(counter*15), (counter+1) * 15, height);
            counter++;
        }
    }
}