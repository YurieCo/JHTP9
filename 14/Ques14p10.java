import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Container;
public class Ques14p10 extends JFrame
{
    private JComboBox<String> combo;
    private Container box;
    private Container box1;
    private JCheckBox check;
    private JButton ok;
    private JButton cancel;
    private JCheckBox check1;
    private static final String[] names = {"RED", "GREEN", "BLUE", "BLACK", "WHITE"};
    public Ques14p10()
    {
        super("ColorSelect");
        combo = new JComboBox<String>(names);
        ok = new JButton("Ok");
        cancel = new JButton("Cancel");
        combo.setMaximumRowCount(3);
        check = new JCheckBox("Background");
        check1 = new JCheckBox("Foreground");
        box = new Container();
        box1 = new Container();
        box.setLayout(new FlowLayout());
        box.add(check);
        box.add(check1);
        box1.setLayout(new FlowLayout());
        box1.add(ok);
        box1.add(cancel);
        add(box, BorderLayout.CENTER);
        add(combo, BorderLayout.NORTH);
        add(box1, BorderLayout.SOUTH);
        
    }
}