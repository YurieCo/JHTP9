// I am Baadoo. Not one of those boys. @Madara, _where
import java.util.Scanner;
public class Ques225
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // new Scanner object
        int fNum;
        System.out.println("Enter number >> ");
        fNum = input.nextInt();
        
        if ((fNum % 2) == 0) // even numbers usually have a remainder of zero when divided by two
            System.out.println("Tne number is an even number");
        if ((fNum % 2) == 1) // odd numbers usually have a remainder of one when divided by two
            System.out.println("The number is an odd number");
    }
}