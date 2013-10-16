import javax.swing.JFrame;
public class Ques4G3Test
{
    public static void main(String[] args)
    {
        JFrame application = new JFrame();
        Ques4G3 panel = new Ques4G3();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(250, 250);
        application.add(panel);
        application.setVisible(true);
    }
}