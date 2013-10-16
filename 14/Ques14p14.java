import javax.swing.JButton;
import java.awt.Color;
import java.util.Random;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Container;
public class Ques14p14 extends JFrame implements ActionListener
{
    private JButton button = new JButton("New Number");
    private JTextField text = new JTextField(5);
    private JLabel label = new JLabel("Press Enter after entering number");
    private JLabel label1 = new JLabel();
    private JLabel label2 = new JLabel();
    private Container box = new Container();
    private static int guess;
    private static int value;
    private Random randomNumber = new Random();
    public Ques14p14()
    {
        super("Guess the Number");
        setLayout(new FlowLayout());
        box.setLayout(new GridLayout(3,1));
        box.add(new JLabel("I have a number between 1 and 1000."));
        box.add(new JLabel("Can you guess my number?"));
        box.add(new JLabel("Please enter your Guess."));
        add(box, BorderLayout.NORTH);
        add(label1);
        add(text);
        add(button);
        add(label2);
        guess = 1 + randomNumber.nextInt(1000);
        text.addActionListener(this);
        button.addActionListener(this);
    }
    public void actionPerformed(ActionEvent event)
    {
        if (event.getSource() == text)
        {
            value = Integer.parseInt(text.getText());
            if (value > guess)
            {
                getContentPane().setBackground(Color.BLUE);
                label2.setText("Too high");
                text.setText("");
            }
            if (value < guess)
            {
                getContentPane().setBackground(Color.RED);
                label2.setText("Too low");
                text.setText("");
            }
            if (value == guess)
            {
                label2.setText("Correct!");
                text.setText("");
                text.setEditable(false);
            }
        }
        else
        {
            guess = 1 + randomNumber.nextInt(1000);
            text.setEditable(true);
            label2.setText("New Game Loaded");
        }
    }
}