/* Application used to encrypt transmitted data
 * Inputs four digit integers. Adds seven to all the digits of the integer
 * Then it replaces each digit with the remainder value after dividing each digit by 10
 * After that, it swaps the first digit with the third digit
 * and the second digit with the fourth digit
 */
import java.util.Scanner;
public class Ques438a
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // new Scanner object - input
        System.out.print("Enter four digit number >> ");
        int number = input.nextInt(); // number to encrypt
        int digit1; // variable to store first digit
        int digit2; // variable to store second digit
        int digit3; // variable to store third digit
        int digit4; // variable to store fourth digit
        digit1 = number / 1000;  // to get the first digit
        digit2 = (number - (digit1*1000))/100; // to get the second digit
        digit3 = (number - (digit1*1000+digit2*100))/10; // to get the third digit
        digit4 = number - (digit1*1000+digit2*100+digit3*10); // to get the fourth digit
        int encrypt1 = (digit1+7) % 10; // encrypting the first digit
        int encrypt2 = (digit2+7) % 10; // encrypting the second digit
        int encrypt3 = (digit3+7) % 10; // encrypting the third digit
        int encrypt4 = (digit4+7) % 10; // encrypting the fourth digit
        
        int encrypted = (encrypt3*1000+encrypt4*100+encrypt1*10+encrypt2); // the full encryted number
        
        System.out.printf("The encrypted number is %d\n", encrypted);
    }
}