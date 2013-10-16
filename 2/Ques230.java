// I am Baadoo. Not one of those boys! @Madara, _where
/* The procedure used here is simple to grasp. Let's use the number 54321 as an example
 * The placement of the first digit(5) is in the hundreds-of-thousands position, the second(4) is tens-of-thousands,
 * the third(3) is thousands, the fourth(2) is tens and the last(1) is units.
 * The value of the first digit(5) is gotten by dividing by 10000, since it's a five-digit number
 * Then the value of the first digit times 10000(that is 50000), is subtracted from the original number,
 * in order to get the value from the tens-of-thousands digit. This gives us 4321.
 * Then this value is divided by 1000, to get the value, 4. 
 * Now, we subtract the these values (50000 and 4000) from the original number.
 * This gives us 321.
 * Applying the process again, in this case by dividing by 100, will give us the value 3.
 * Subtracting values already gotten from the original value will give us 21.
 * We apply this process again to get the value 2.
 * The final value is thus gotten by subtracting the prior values from the original value.
 */
import java.util.Scanner;
public class Ques230
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // new Scanner object
        int num; // variable to store number entered by user
        int d1; // variable to store first digit
        int d2; // variable to store second digit
        int d3; // variable to store third digit
        int d4; // variable to store fourth digit
        int d5; // variable to store fifth digit
        
        System.out.println("Enter number >> ");
        num = input.nextInt();
        d1 = num / 10000; // to store first digit
        d2 = (num - (d1 * 10000)) / 1000;
        d3 = (num - (d1 * 10000) - (d2 * 1000)) / 100;
        d4 = (num - (d1 * 10000) - (d2 * 1000) - (d3 * 100)) / 10;
        d5 = (num - (d1 * 10000) - (d2 * 1000) - (d3 * 100) - (d4 * 10));
        
        System.out.printf("\n%d %d %d %d %d", d1, d2, d3, d4, d5);
    }
}