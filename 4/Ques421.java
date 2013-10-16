import java.util.Scanner;
public class Ques421
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int counter = 0; // counter variable
        int number; // number most recently input by user
        int largest = 0; // largest number initialized to zero
        
        while (counter < 10)
        {
            System.out.print("Enter number >> ");
            number = input.nextInt();
            if (largest < number)
                largest = number; // set largest equal to the value entered if it's less than the number
            counter++;
        }
        System.out.printf("\nThe largest of the numbers entered so far is: %d", largest);
    }
}