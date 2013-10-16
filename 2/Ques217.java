// I am Baadoo. Not one of those boys! @Madara, _where
import java.util.Scanner; // import Scanner method
public class Ques217
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // new Scanner object
        int fNum; // variable representing first number
        int sNum; // variable representing second number
        int tNum; // variable representing third number
        int lNum; // variable to store value of largest number
        int ssNum; // variable to store value of smallest number
        System.out.println("First number >> ");
        fNum = input.nextInt(); // accept input for first number
        System.out.println("Second number >> ");
        sNum = input.nextInt(); // accept input for second number
        System.out.println("Third number >> ");
        tNum = input.nextInt(); // accept input for third number
        
        System.out.printf("\nSum is %d\nAverage is %d\nProduct is %d",
                          fNum+sNum+tNum, (fNum+sNum+tNum)/3, fNum*sNum*tNum); // print values
        lNum = fNum; // set largest number to equal first number
        if (sNum > lNum) // compare second number to first number to determine which is larger
            lNum = sNum; // set largest number to equal second number if second number is larger
        if (tNum > lNum) // compare third number to largest number to determine which is larger
            lNum = tNum; // set largest number to equal third number if third number is larger
        System.out.printf("\nThe largest of the numbers is %d", lNum);
        ssNum = fNum; // set smallest numbr to equal first number
        if (sNum < ssNum) // compare second number to first number to determine which is smaller
            ssNum = sNum; // set smallest number to equal first number if second number is smaller
        if (tNum < ssNum) // compare third number to smallest number to determine which is smaller
            ssNum = tNum; // set smallest number to equal third number if third number is smaller
        System.out.printf("\nThe smallest of the numbers is %d", ssNum);
    }
}