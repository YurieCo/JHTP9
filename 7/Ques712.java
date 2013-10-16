import java.util.Scanner;
public class Ques712
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // new Scanner object - input
        int[] numbers = new int[5]; // array to store values entered by user
        int determine; // to keep track of duplicates
        for (int counter = 0; counter < 5; counter++)
        { // loop to iterate five times
            while (numbers[counter] < 10 || numbers[counter] > 100)
            { // loop to keep iterating until user enters a value
                System.out.print("Enter number >> ");
                numbers[counter] = input.nextInt();
                if (numbers[counter] < 10 || numbers[counter] > 100)
                    System.out.print("Please enter a number between 10 and 100\n"); // if user enters a number not in range 10 - 100
            }
            System.out.printf("Numbers entered so far >> "); 
            for (int num = 0; num <= counter; num++)
            { // loops through elements in the numbers array before and including the current number to check for duplication
                determine = 0; // sets variable to zero at the beginning of every loop
                for (int num2 = 0; num2 < num; num2++)
                { // compares numbers entered before 'num' to see if duplication occurs
                    if (numbers[num] != numbers[num2]) // if no duplication, increment variable determine
                        determine++;
                }
                if (num == determine) // will only be equal if there is no duplication. if duplication occurs, determine will be < number
                    System.out.printf("%d ", numbers[num]); // print out the value of the number, if there is no duplicate before it
            }
            System.out.println();
        }
    }
}