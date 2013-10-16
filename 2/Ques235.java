// I am Baadoo. Not one of those boys! @Madara, _where
/* The cost of driving daily is the cost of the total miles driven plus parking fees and tolls
 * The cost of total miles is gotten by multiplying the cost per gallon of gasoline
 * by the number of gallons it'll take to cover the distance (total miles)
 * This gallon number is gotten by dividing the distance by the average number of miles per gallon
 */
import java.util.Scanner;
public class Ques235
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int tmiles; // total miles driven daily
        int cpg;    // cost per gallon of gasoline
        int avg;    // average miles per gallon
        int pfee;   // parking fees per day
        int toll;   // tolls per day
        
        System.out.println("Total miles driven daily  >> ");
        tmiles = input.nextInt();
        System.out.println("Cost per gallon of gasoline >> ");
        cpg = input.nextInt();
        System.out.println("Average miles per gallon  >> ");
        avg = input.nextInt();
        System.out.println("Parking fees per day  >> ");
        pfee = input.nextInt();
        System.out.println("Tolls per day  >> ");
        toll = input.nextInt();
        
        System.out.printf("\nCost of driving per day: %d", ((tmiles/avg) * cpg) + pfee + toll);
    }
}