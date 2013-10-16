import javax.swing.JFrame;
public class Ques4G2Test
{
    public static void main(String[] args)
    {
        JFrame application = new JFrame();
        Ques4G2 panel = new Ques4G2();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(250, 250);
        application.add(panel);
        application.setVisible(true);
    }
}