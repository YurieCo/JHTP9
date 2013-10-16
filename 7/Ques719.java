import java.util.Scanner;
public class Ques719
{
    private static boolean[] seat = new boolean[11];
    private static int first = 0;
    private static int economy = 0;
    private static Scanner input = new Scanner(System.in); // new Scanner object - input
    private static int choice;
    private static int choice2;
    public static void main(String[] args)
    {
        for (int counter = 0; counter < 10; counter++)
        {
            System.out.printf("%s\n%s >>  ", "\nPlease type 1 for First Class",
                              "Please type 2 for Economy");
            choice = input.nextInt();
            processSeat(choice);
        }
    }
    public static void processSeat(int value)
    {
        if (value == 1)
        {
            if (first >= 5)
            {
                System.out.printf("%s\n%s\n%s", "Seats in this section are full, Do you want a seat in Economy?",
                                   "Please type 1 if Yes >>  ", "Please type 2 if No >>  ");
                choice2 = input.nextInt();
                if (choice2 == 1)
                    processSeat(2);
                else
                    System.out.println("Next flight leaves in 3 hours");
            }
            else
            {
                seat[1 + first] = true;
                System.out.printf("\nSeat number >> %d\nSection: >> First Class", 1+first);
                first++;
            }
        }
        else
        {
            if (economy >= 5)
            {
                System.out.printf("%s\n%s\n%s", "Seats in this section are full, Do you want a seat in First Class?",
                                   "Please type 1 if Yes >>  ", "Please type 2 if No >>  ");
                choice2 = input.nextInt();
                if (choice2 == 1)
                    processSeat(1);
                else
                    System.out.println("\nNext flight leaves in 3 hours");
            }
            else
            {
                seat[6 + economy] = true;
                System.out.printf("\nSeat number >> %d\nSection: >> Economy", 6+economy);
                economy++;
            }
        }
    }
}
    