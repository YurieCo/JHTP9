import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JFrame;
public class Random9
{
    public static void main(String[] args)
    {
        JFrame application = new JFrame();
        DrawPanel panel = new DrawPanel();
        JLabel textLabel = new JLabel(panel.labelDisplay());
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.add(textLabel, BorderLayout.SOUTH);
        application.setSize(300,300);
        application.setVisible(true);
    }
}