import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.Box;
public class Ques14p8 extends JFrame
{
    private JCheckBox check;
    private JCheckBox check1;
    private JLabel x;
    private JLabel y;
    private JTextField text;
    private JTextField text1;
    private JButton ok;
    private JButton cancel;
    private JButton help;
    
    public Ques14p8()
    {
        super("Align");
        setLayout(new BorderLayout(15,15));
        check = new JCheckBox("Snap to Grid");
        check1 = new JCheckBox("Show Grid");
        x = new JLabel("X: ");
        Box box = Box.createVerticalBox();
        Box box1 = Box.createVerticalBox();
        Box box2 = Box.createVerticalBox();
        y = new JLabel("Y: ");
        text = new JTextField(7);
        text1 = new JTextField(7);
        ok = new JButton(" OK ");
        cancel = new JButton("Cancel");
        help = new JButton("help");
        box.add(check);
        box.add(check1);
        add(box, BorderLayout.WEST);
        box1.add(x);
        box1.add(text);
        box1.add(y);
        box1.add(text1);
        add(box1, BorderLayout.CENTER);
        box2.add(ok);
        box2.add(cancel);
        box2.add(help);
        add(box2, BorderLayout.EAST);
    }
}