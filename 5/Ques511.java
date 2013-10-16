import java.util.Scanner;
public class Ques511
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // new Scanner object - input
        System.out.print("How many values do you intend to enter >> ");
        int choice = input.nextInt(); // to determine number of times to loop
        int j = 0; // counter variable, to keep track of while loop
        System.out.print("Enter value >> ");
        int newe = input.nextInt(); // first value entered by user
        int smallest = newe; // initialize smallest by setting it equal to the first value entered
        while (j < choice)
        {
            System.out.print("Enter value >> ");
            int newest = input.nextInt();
            if (newest < smallest)       // to change smallest value if the value entered is less than the 
                smallest = newest;       // current smallest number
            j++; // increment counter value
        }
        System.out.printf("\nThe Smallest number you entered was %d", smallest); // print smallest number
    }
}