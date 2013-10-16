// I am Baadoo. Not one of those boys! @Madara, _where
/* This procedure will be making use of the first method for calculating the BMI:
 * (WeightInPounds * 703) / (HeightInInches * HeightInInches)
 */
import java.util.Scanner;
public class Ques233
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int weight; // for storing weight in pounds
        int height; // for storing height in inches
        System.out.println("Enter weight in pounds >> ");
        weight = input.nextInt();
        System.out.println("Enter height in inches >> ");
        height = input.nextInt();
        
        System.out.printf("\nBody Mass Index:  %d", (weight * 703) / (height*height)); // to print BMI value
        System.out.printf("\n%s\nUnderweight: %s\nNormal:      %s\nOverweight:  %s\nObese:       %s", 
                           "BMI VALUES", "less than 18.5", "between 18.5 and 24.9", "between 25 and 29.9",
                           "30 or greater");
    }
}