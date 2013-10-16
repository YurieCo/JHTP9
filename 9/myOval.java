import java.awt.Color;
import java.awt.Graphics;
public class myOval
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