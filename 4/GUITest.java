import javax.swing.JFrame;
public class GUITest
{
    public static void main(String[] args)
    {
        Ques5GUI panel = new Ques5GUI();
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(400, 300);
        application.setVisible(true);
    }
}