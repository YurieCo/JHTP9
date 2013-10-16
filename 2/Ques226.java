// I am Baadoo. Not one of those boys! @Madara, _where
import java.util.Scanner;
public class Ques226
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int fNum; // first number
        int sNum; // second number
        System.out.println("First number >> ");
        fNum = input.nextInt();
        System.out.println("Second number >> ");
        sNum = input.nextInt();
        
        if ((fNum % sNum) == 0) // check for whether first number is a multiple of the second number
            System.out.println("The first number is a multiple of the second");
    }
}