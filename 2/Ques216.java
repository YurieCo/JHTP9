// I am Baadoo. Not one of those boys! @Madara, _where
import java.util.Scanner; // import Scanner method
public class Ques216
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // new Scanner object
        int fNum; // variable representing first number
        int sNum; // variable representing second number
        System.out.println("Enter first number >> "); 
        fNum = input.nextInt(); // accept first number input
        System.out.println("Enter second number >> ");
        sNum = input.nextInt(); // accept second number input
        // number comparison conditions
        if (fNum > sNum)
            System.out.printf("\n%d is larger", fNum);
        if (sNum > fNum)
            System.out.printf("\n%d is larger", sNum);
        if (sNum == fNum)
            System.out.println("\nThese numbers are equal");
    }
}