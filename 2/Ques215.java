// I am Baadoo. Not one of those boys! @Madara, _where
import java.util.Scanner; // to import Scanner method
public class Ques215
{
    public static void main(String[] args) // main method
    {
        int fNum; // variable representing first input of the user
        int sNum; // variable representing second input of the user
        Scanner input = new Scanner(System.in); // new Scanner object
        System.out.println("First Integer >>  ");
        fNum = input.nextInt(); // for accepting first integer input
        System.out.println("Second Integer >>  ");
        sNum = input.nextInt(); // for accepting second integer input
        
        System.out.printf("\nSum is %d\nProduct is %d\nDifference is %d\nQuotient is %d",
                          fNum+sNum, fNum*sNum, fNum-sNum, fNum/sNum); // printing values
    }
}