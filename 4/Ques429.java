import java.util.Scanner;
public class Ques429
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // new Scanner object - input
        int firstcount = 0; // variable to keep track of while loop for first line of asterisks
        int lastcount = 0;
        int innercount; // variable to keep track of while loop for last line of asterisks
        int outercount = 0;
        
        System.out.print("Size of Square >> ");
        int size = input.nextInt(); // variable to obtain proposed size of the square
        
        while (firstcount < size)
        { // loop to draw the first line of asterisks, which is the same length as the size
            System.out.print("*"); // to print an asterisk for each iteration
            firstcount++; // to increment after printing each asterisk
        }
        System.out.printf("\n"); // to move to the next line after drawing first line of asterisks
        
        /* This loop draws the lines between the first and last line of the square
         * Each of these lines usually include spaces to maintain hollow property of the square
         */
        while (outercount < size-2)
        { // loop uses (size - 2) in order to exclude the first and the last line of asterisks that don't include spaces
            System.out.print("*"); // draws the first asterisk for line
            innercount = 0; // sets innercount to zero everytime so as to start from zero before next loop executes
            while (innercount < size-2)
            { // gives spaces for each iteration. uses (size-2) to exclude first and last asterisk drawn on the line
                System.out.print(" "); // gives a space between the first and last asterisk, for each iteration
                innercount++; // increment after printing each space
            }
            System.out.print("*"); // draws the last asterisk for line
            System.out.printf("\n"); // to move to the next line after drawing each line
            outercount++; // increment after printing each line
        }
        
        while (lastcount < size)
        {// loop to draw the last line of asterisks, which is the same length as the size
            System.out.print("*"); // to print an asterisk for each iteration
            lastcount++; // to increment after printing each astersk
        }
    }
}
    
