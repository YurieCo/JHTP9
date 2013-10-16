import javax.swing.JPanel;
import java.util.Random;
import java.awt.Graphics;
import java.awt.Color;
public class DrawPanel extends JPanel
{
    private static Random randomNumbers = new Random();
    private myLine[] lines;
    private myRectangle[] rectangles;
    private myOval[] ovals;
    public DrawPanel()
    {
        setBackground(Color.WHITE);
        lines = new myLine[1 + randomNumbers.nextInt(5)];
        rectangles = new myRectangle[1 + randomNumbers.nextInt(5)];
        ovals = new myOval[1 + randomNumbers.nextInt(5)];
        for (int counter = 0; counter < lines.length; counter++)
        {
            Color vcolor = new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256), 
                                     randomNumbers.nextInt(256));
            int x1 = randomNumbers.nextInt(300);
            int y1 = randomNumbers.nextInt(300);
            int x2 = randomNumbers.nextInt(300);
            int y2 = randomNumbers.nextInt(300);
            lines[counter] = new myLine(x1, y1, x2, y2, vcolor);
        }
        for (int counter = 0; counter < rectangles.length; counter++)
        {
            Color vcolor = new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256), 
                                     randomNumbers.nextInt(256));
            int x1 = randomNumbers.nextInt(300);
            int y1 = randomNumbers.nextInt(300);
            int x2 = randomNumbers.nextInt(300);
            int y2 = randomNumbers.nextInt(300);
            int flagConv = randomNumbers.nextInt(2);
            boolean flag;
            if (flagConv == 0)
                flag = false;
            else
                flag = true;
            rectangles[counter] = new myRectangle(x1, y1, x2, y2, vcolor, flag);
        }
        for (int counter = 0; counter < ovals.length; counter++)
        {
            Color vcolor = new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256), 
                                     randomNumbers.nextInt(256));
            int x1 = randomNumbers.nextInt(300);
            int y1 = randomNumbers.nextInt(300);
            int x2 = randomNumbers.nextInt(300);
            int y2 = randomNumbers.nextInt(300);
            int flagConv = randomNumbers.nextInt(2);
            boolean flag;
            if (flagConv == 0)
                flag = false;
            else
                flag = true;
            ovals[counter] = new myOval(x1, y1, x2, y2, vcolor, flag);
        }
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for (myLine line: lines)
            line.draw(g);
        for (myRectangle rectangle: rectangles)
            rectangle.draw(g);
        for (myOval oval: ovals)
            oval.draw(g);
    }
    public String labelDisplay()
    {
        return String.format("%s: %d, %s: %d, %s: %d", "Lines", lines.length,
                             "Ovals", ovals.length, "Rectangles", rectangles.length);
    }
}