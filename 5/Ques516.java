import java.util.Scanner;
public class Ques516
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // new Scanner object - input
        System.out.print("First number >> ");
        int bar1 = input.nextInt();
        System.out.print("Second number >> ");
        int bar2 = input.nextInt();
        System.out.print("Third number >> ");
        int bar3 = input.nextInt();
        System.out.print("Fourth number >> ");
        int bar4 = input.nextInt();
        System.out.print("Fifth number >> ");
        int bar5 = input.nextInt();
        System.out.println();
        if ((bar1 >= 1) && (bar1 <= 30))
        { // display bar chart for first number if it's within acceptable range
            System.out.printf("%15s", "First number: ");
            for (int counter = 0; counter < bar1; counter++)
            {
                System.out.print("*");
            }
        }
        System.out.println();
        if ((bar2 >= 1) && (bar2 <= 30))
        { // display bar chart for second number if it's within acceptable range
            System.out.printf("%15s", "Second number: ");
            for (int counter = 0; counter < bar2; counter++)
            {
                System.out.print("*");
            }
        }
        System.out.println();
        if ((bar3 >= 1) && (bar3 <= 30))
        { // display bar chart for third number if it's within acceptable range
            System.out.printf("%15s", "Third number: ");
            for (int counter = 0; counter < bar3; counter ++)
            {
                System.out.print("*");
            }
        }
        System.out.println();
        if ((bar4 >= 1) && (bar4 <= 30))
        { // display bar chart for fourth number if it's within acceptable range
            System.out.printf("%15s", "Fourth number: ");
            for (int counter = 0; counter < bar4; counter ++)
            {
                System.out.print("*");
            }
        }
        System.out.println();
        if ((bar5 >= 1) && (bar5 <= 30))
        { // display bar chart for fifth number if it's within acceptable range
            System.out.printf("%15s", "Fifth number: ");
            for (int counter = 0; counter < bar5; counter ++)
            {
                System.out.print("*");
            }
        }
        System.out.println(); 
    }
}