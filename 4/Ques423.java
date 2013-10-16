import java.util.Scanner;
public class Ques423
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int counter = 0; // counter variable
        int number; // number most recently input by user
        int largest = 0; // largest number initialized to zero
        int large = 0; // second largest number initialized to zero
        
        while (counter < 10)
        {
            System.out.print("Enter number >> ");
            number = input.nextInt();
            if (largest < number)
            {
                large = largest; // set large to equal largest number before changing value of largest number
                largest = number; // set largest equal to the value entered if it's less than the number
            }
            else 
            { // still compare value of number to large, even if it's smaller than the largest number
                if (large < number)
                    large = number; // set large equal to number i it's less than number
            }
            counter++;
        }
        System.out.printf("\nThe largest of the numbers entered so far is: %d", largest);
        System.out.printf("\nThe second largest of the numbers entered so far is %d", large);
    }
}