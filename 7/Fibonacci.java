import javax.swing.JOptionPane;
public class Fibonacci
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, String.format("The fibonacci value is " +
         fibonacci(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Number >>"))))); 
    }
    public static String fibonacci(int n)
    {
        int t1 = 0;
        int t2 = 1;
        int t3 = 0;
        if (n < 0)
            return "undefined";
        if (n == 0)
            return "0";
        if (n == 1)
            return "1";
        for (int count = 2; count <= n; count++)
        {
            t3 = (t2 + t1);
            t1 = t2;
            t2 = t3;
        }
        return t3 + "";
    }
}