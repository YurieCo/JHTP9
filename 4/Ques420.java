import java.util.Scanner;
public class Ques420
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // new Scanner object - input
        int counter = 1; // counter to keep track of employees
        int hoursWorked; // number of hours worked by employee
        double hourRates; //  hourly rates
        while (counter < 4)
        { // loop to run thrice in order to operate for three employees
            System.out.printf("Employee %d:\n", counter);
            System.out.print("Number of hours worked >> ");
            hoursWorked = input.nextInt();
            System.out.print("Hourly Rates >> ");
            hourRates = input.nextDouble(); // to accept numbers of type double
            
            if (hoursWorked > 40) // calculation if employee works more than 40 hours
                System.out.printf("\nGross Pay for Employee %d: %f\n", counter,
                                  (40*hourRates)+((hourRates/2)*(hoursWorked-40)));
            else // calculation if employee works  40 hours or less
                System.out.printf("\nGross Pay for Employee %d: %f\n", counter, 
                                  hoursWorked * hourRates);
            counter++;
        }
    }
}