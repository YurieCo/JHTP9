import java.util.Scanner;
public class Ques317Test
{
    public static void main(String[] args)
    {
        String fName;
        String lName;
        String gen;
        int mVal;
        int dVal;
        int yVal;
        int hVal;
        int wVal;
        Scanner input = new Scanner(System.in);
        System.out.println("First name >> ");
        fName = input.nextLine();
        System.out.println("Last name >> ");
        lName = input.nextLine();
        System.out.println("Gender >> ");
        gen = input.nextLine();
        System.out.println("Month of birth >> ");
        mVal = input.nextInt();
        System.out.println("Day of birth >> ");
        dVal = input.nextInt();
        System.out.println("Year of birth >> ");
        yVal = input.nextInt();
        System.out.println("Height in inches >> ");
        hVal = input.nextInt();
        System.out.println("Weight in pounds >> ");
        wVal = input.nextInt();
        
        Ques317 test = new Ques317(fName, lName, gen, mVal, dVal, yVal, hVal, wVal);
        System.out.printf("\n%s: %s\n%s: %s\n%s: %s\n%s: %d/%d/%d\n%s: %d\n%s: %d",
                          "First name", test.getFirstName(), "Last name", test.getLastName(),
                          "Gender", test.getGender(), "Date of birth", test.getMonth(), test.getDay(),
                          test.getYear(), "Height in inches", test.getHeight(), "Weight in pounds", 
                          test.getWeight());
        System.out.printf("\n%s: %d\n%s: %f\n%s: %d\n%s: %s\n", "Age in years", test.ageYear(), 
                          "Body Mass Index", test.bodyMassIndex(), "Maximum Heart Rate", 
                          test.maximumHeartRate(), "Target Heart Rate", test.targetHeartRate());
        System.out.printf("\n%s\nUnderweight: %s\nNormal:      %s\nOverweight:  %s\nObese:       %s", 
                          "BMI VALUES", "less than 18.5", "between 18.5 and 24.9", "between 25 and 29.9",
                          "30 or greater"); // BMI chart
    }
}