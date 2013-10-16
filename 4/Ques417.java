import java.util.Scanner;
public class Ques417
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // new Scanner object - input
        int gallons = 0; // variable representing combined gallons used
        int gall; // variable representing gallons used for specific trip
        int miles = 0; // variable representing combined miles driven
        int mil; // variable representing miles driven for specific trip
        double mpg; // variable representing miles per gallon
        while (gallons != -5) // -5 used to keep track of when to break the while loop
        {
            System.out.print("Gallons used >> ");
            gall = input.nextInt();
            System.out.print("MIles driven >> ");
            mil = input.nextInt();
            gallons += gall;
            miles += mil;
            System.out.printf("\nMiles per gallon for this trip: %f\nCombined Miles per gallon: %f\n", 
                              (double)gall/mil, (double)gallons/miles);
        }
    }
}