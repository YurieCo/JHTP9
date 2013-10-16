import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.JFrame;
public class Ques8GUI
{
    public static void main(String[] args)
    {
        JFrame application = new JFrame();
        DrawPanel panel = new DrawPanel();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300,300);
        application.setVisible(true);
    }
}
class myLine
{
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private Color myColor;
    
    public myLine()
    {
        x1 = 0;
        x2 = 0;
        y1 = 0;
        y2 = 0;
        myColor = Color.BLACK;
    }
    public myLine(int x1, int y1, int x2, int y2, Color color)
    {
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
        setMyColor(color);
    }
    public void setX1(int x1)
    {
        if (x1 < 0)
            this.x1 = 0;
        else
            this.x1 = x1;
    }
    public void setX2(int x2)
    {
        if (x2 < 0)
            this.x2 = 0;
        else
            this.x2 = x2;
    }
    public void setY1(int y1)
    {
        if (y1 < 0)
            this.y1 = 0;
        else
            this.y1 = y1;
    }
    public void setY2(int y2)
    {
        if (y2 < 0)
            this.y2 = 0;
        else
            this.y2 = y2;
    }
    public void setMyColor(Color color)
    {
        myColor = color;
    }
    public int getX1()
    {
        return x1;
    }
    public int getY1()
    {
        return y1;
    }
    public int getX2()
    {
        return x2;
    }
    public int getY2()
    {
        return y2;
    }
    public Color getMyColor()
    {
        return myColor;
    }
    public void draw(Graphics g)
    {
        g.setColor(myColor);
        g.drawLine(getX1(), getY1(), getX2(), getY2());
    }
}
class myRectangle
{
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private Color myColor;
    private boolean flag;
    public myRectangle()
    {
        x1 = 0;
        x2 = 0;
        y1 = 0;
        y2 = 0;
        myColor = Color.BLACK;
        flag = false;
    }
    public myRectangle(int x1,int y1,int x2, int y2,Color color, boolean flag)
    {
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
        setMyColor(color);
        setFlag(flag);
    }
    public void setX1(int x1)
    {
        if (x1 < 0)
            this.x1 = 0;
        else
            this.x1 = x1;
    }
    public void setX2(int x2)
    {
        if (x2 < 0)
            this.x2 = 0;
        else
            this.x2 = x2;
    }
    public void setY1(int y1)
    {
        if (y1 < 0)
            this.y1 = 0;
        else
            this.y1 = y1;
    }
    public void setY2(int y2)
    {
        if (y2 < 0)
            this.y2 = 0;
        else
            this.y2 = y2;
    }
    public void setMyColor(Color color)
    {
        myColor = color;
    }
    public void setFlag(boolean flag)
    {
        this.flag = flag;
    }
    public int getX1()
    {
        return x1;
    }
    public int getY1()
    {
        return y1;
    }
    public int getX2()
    {
        return x2;
    }
    public int getY2()
    {
        return y2;
    }
    public Color getMyColor()
    {
        return myColor;
    }
    public boolean getFlag()
    {
        return flag;
    }
    public int getUpperLeftX(int x1, int x2)
    {
        int ulx = x1;
        if (x2 < ulx)
            ulx = x2;
        return ulx;
    }
    public int getUpperLeftY(int y1, int y2)
    {
        int uly = y1;
        if (y2 < uly)
            uly = y2;
        return uly;
    }
    public int getWidth(int x1, int x2)
    {
        int width = x1 - x2;
        if (width < 0)
            width *= -1;
        return width;
    }
    public int getHeight(int y1, int y2)
    {
        int height = y1 - y2;
        if (height < 0)
            height *= -1;
        return height;
    }
    public void draw(Graphics g)
    {
        g.setColor(getMyColor());
        if (getFlag() == true)
            g.fillRect(getUpperLeftX(getX1(),getX2()), getUpperLeftY(getY1(),getY2()), 
                       getWidth(getX1(),getX2()), getHeight(getY1(),getY2()));
        else
            g.drawRect(getUpperLeftX(getX1(),getX2()), getUpperLeftY(getY1(),getY2()), 
                       getWidth(getX1(),getX2()), getHeight(getY1(),getY2()));
    }
}
class myOval
{
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private Color myColor;
    private boolean flag;
    public myOval()
    {
        x1 = 0;
        x2 = 0;
        y1 = 0;
        y2 = 0;
        myColor = Color.BLACK;
        flag = false;
    }
    public myOval(int x1,int y1,int x2, int y2,Color color, boolean flag)
    {
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
        setMyColor(color);
        setFlag(flag);
    }
    public void setX1(int x1)
    {
        if (x1 < 0)
            this.x1 = 0;
        else
            this.x1 = x1;
    }
    public void setX2(int x2)
    {
        if (x2 < 0)
            this.x2 = 0;
        else
            this.x2 = x2;
    }
    public void setY1(int y1)
    {
        if (y1 < 0)
            this.y1 = 0;
        else
            this.y1 = y1;
    }
    public void setY2(int y2)
    {
        if (y2 < 0)
            this.y2 = 0;
        else
            this.y2 = y2;
    }
    public void setMyColor(Color color)
    {
        myColor = color;
    }
    public void setFlag(boolean flag)
    {
        this.flag = flag;
    }
    public int getX1()
    {
        return x1;
    }
    public int getY1()
    {
        return y1;
    }
    public int getX2()
    {
        return x2;
    }
    public int getY2()
    {
        return y2;
    }
    public Color getMyColor()
    {
        return myColor;
    }
    public boolean getFlag()
    {
        return flag;
    }
    public int getUpperLeftX(int x1, int x2)
    {
        int ulx = x1;
        if (x2 < ulx)
            ulx = x2;
        return ulx;
    }
    public int getUpperLeftY(int y1, int y2)
    {
        int uly = y1;
        if (y2 < uly)
            uly = y2;
        return uly;
    }
    public int getWidth(int x1, int x2)
    {
        int width = x1 - x2;
        if (width < 0)
            width *= -1;
        return width;
    }
    public int getHeight(int y1, int y2)
    {
        int height = y1 - y2;
        if (height < 0)
            height *= -1;
        return height;
    }
    public void draw(Graphics g)
    {
        g.setColor(getMyColor());
        if (getFlag() == true)
            g.fillOval(getUpperLeftX(getX1(),getX2()), getUpperLeftY(getY1(),getY2()), 
                       getWidth(getX1(),getX2()), getHeight(getY1(),getY2()));
        else
            g.drawOval(getUpperLeftX(getX1(),getX2()), getUpperLeftY(getY1(),getY2()), 
                       getWidth(getX1(),getX2()), getHeight(getY1(),getY2()));
    }
}
class DrawPanel extends JPanel
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
}