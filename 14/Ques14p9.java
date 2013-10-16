import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Container;
public class Ques14p9 extends JFrame
{
    private JButton[] buttons;
    private JTextField text;
    private final static String[] names = {"7", "8", "9", "/", "4",
        "5", "6", "*", "1", "2", "3", "-", "0", ".","=", "+"};
    private Container box;
    public Ques14p9()
    {
        super("Calculator");
        text = new JTextField(18);
        box = new Container();
        add(text, BorderLayout.NORTH);
        box.setLayout(new GridLayout(4,4,3,3));
        buttons = new JButton[names.length];
        for (int counter = 0; counter < names.length; counter++)
        {
            buttons[counter] = new JButton(names[counter]);
            box.add(buttons[counter]);
        }
        add(box, BorderLayout.CENTER);
    }
}