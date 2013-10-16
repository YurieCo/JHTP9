/*Application to draw a spiral of circles
 * Starting with the middle, with each next circle bigger than the previous one
 */
import java.awt.Graphics;
import javax.swing.JPanel;
public class Ques5GUI extends JPanel // necessary syntax
{
    public void paintComponent(Graphics g) // paintComponent method of JPanel
    {
        super.paintComponent(g);
        int width = getWidth(); // to get total width of frame from test class
        int height = getHeight();  // to get total height of frame from test class
        
        int d = width / 2;  // midpoint of frame (width)
        int e = height / 2;  // midpoint of frame (height)
        
        for (int i = 0; i < 12; i++)
        { // loop to draw 12 circles, difference between radii is 10
            int f = i*10 + 10; // ascertain difference from midpoint (width). loop's 10,20,30...
            int k = 2*(i*10) + 20; //the values of the respective radii. loop's 22,40,60...
            g.drawOval(d-f,e-f, k,k);
        }
    }
}