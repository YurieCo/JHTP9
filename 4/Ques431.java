/*The procedure used involves picking off the remainders after dividing
 * the binary number by ten. It picks off digits from right to left, and then
 * sets the number to the quotient, after dividing by ten
 * The positional value is obtained by raising two to the power of the corresponding
 * position. That is 2^0, 2^1, 2^2, 2^3, etc.
 * The variable, power helps to achieve this, by starting out at zero, and then increasing
 * by one, everytime the while loop runs.
 */
import java.util.Scanner;
public class Ques431
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // new Scanner object - input
        System.out.print("Enter Binary number >> ");
        int binary = input.nextInt(); // variable representing binary number entered by user
        int remain; // remainder in binary conversion operation
        int decimal = 0; // final decimal value
        int power = 0; // positional value iterator
        
        while (binary != 0)
        { // loop to keep iterating until the quotient, after dividing by ten, is zero
            remain = binary % 10; // remainder used to multiply positional value with respect to base 2
            binary /= 10; // setting the number to its quotient after dividing by 10
            decimal += remain*Math.pow(2, power); // increasing decimal value by adding corresponding value
            power++; // increases by one in order to effect change in positional value
        }
        System.out.printf("\nThe decimal equivalent is %d", decimal); // prints final value after conversion
    }
}