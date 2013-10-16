import java.util.Scanner;
public class Ques316Test
{
    public static void main(String[] args)
    {
        String fName; // variable representing first name
        String lName; // variable representing last name
        int monthVal; // variable representing month
        int dayVal; // variable representing day
        int yearVal; // variable representing year
        Scanner input = new Scanner(System.in); // new Scanner object
        System.out.println("First name >> ");
        fName = input.nextLine();
        System.out.println("Last name >> ");
        lName = input.nextLine();
        System.out.println("Month of birth >> ");
        monthVal = input.nextInt();
        System.out.println("Day of birth >> ");
        dayVal = input.nextInt();
        System.out.println("Year of birth >> ");
        yearVal = input.nextInt();;
        
        Ques316 test = new Ques316(fName, lName, monthVal, dayVal, yearVal); // new object, test of class Ques316
        System.out.printf("\n%s: %d\n%s: %d\n%s: %s", "Age in years", test.ageYear(),
                          "Maximum Heart Rate", test.maximumHeartRate(), "Target Heart Rate",
                          test.targetHeartRate());
    }
}