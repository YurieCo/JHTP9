// I am Baadoo. Not one of those boys! @Madara, _where
import java.util.Scanner;
public class Ques224
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // new Scanner object
        int fNum; // first number
        int sNum; // second number
        int tNum; // third number
        int frNum; // fourth number
        int fvNum; // fifth number
        int lNum; // largest number
        int ssNum; // smallest number
        System.out.println("First number >> ");
        fNum = input.nextInt(); 
        System.out.println("Second number >> ");
        sNum = input.nextInt();
        System.out.println("Third number >> ");
        tNum = input.nextInt();
        System.out.println("Fourth number >> ");
        frNum = input.nextInt();
        System.out.println("Fifth number >> ");
        fvNum = input.nextInt();
        
        lNum = fNum; // set largest number to equal first number
        if (sNum > lNum) // compare values and set largest number to equal second number
            lNum = sNum; // if second number is larger
        if (tNum > lNum) // compare values and set largest number to equal third number
            lNum = tNum; // if third number is larger
        if (frNum > lNum) // compare values and set largest number to equal fourth number
            lNum = frNum; // if fourth number is larger
        if (fvNum > lNum) // compare values and set largest number to equal fifth number
            lNum = fvNum; // if fifth number is larger
        
        ssNum = fNum; // set smallest number to equal first number
        if (sNum < ssNum) //compare values and set smallest number to equal second number
            ssNum = sNum; // if second number is smaller
        if (tNum < ssNum) // compare values and set smallest number to equal third number
            ssNum = tNum; // if third number is smaller
        if (frNum < ssNum) // compare values and set smallest number to equal fourth number
            ssNum = frNum; // if fourth number is smaller
        if (fvNum < ssNum) // compare values and set smallest number to equal fifth number
            ssNum = fvNum; // if fifth number is smaller
        
        System.out.printf("\nSmallest number is %d\nLargest number is %d", ssNum, lNum);
    }
}