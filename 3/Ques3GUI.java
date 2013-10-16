import javax.swing.JOptionPane; // import JOptionPane method
public class Ques3GUI
{ 
   public static void main( String[] args ) 
   {
      int number1; // first number
      int number2; // second number
      
     // converting Strings into integers using parseInt method
      number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first integer"));
      number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second integer"));
      
      // display result of adddition
      JOptionPane.showMessageDialog(null, String.format("Sum is %d", number1+number2));
   }
}