import java.util.Scanner;
public class Ques437a
{
    public static void main(String[] args)
    { 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number >> ");
        int fact = input.nextInt(); //
        int j = fact - 1; // used to set starting point for multiplication operation in factorial calculation
        if (fact == 0) // a scenario where zero is entered
            System.out.printf("The factorial of %d is equal to one", fact);
        if (fact > 0)
        { // when a positive number is entered
            while (j >= 1)
            { // loop to keep iterating until j is equal to one
                fact *= j; // multiplication operation for factorial
                j--; // reducing the value of j, as the loop operates
            }
            System.out.printf("The factorial value is %d", fact); // printing the final value
        }
        if (fact < 0) // when a negative number is entered
            System.out.println("The operation failed because you entered a negative number");
    }
}