/* The process works in the reverse order of the encryption process
 * For every digit being processed, it subtracts 7 from the digit
 * However, this could end up giving erroneous values if the digit is actually less
 * than 7. Thus a different process is use for situations such as this.
 * To do this, we add 3 - gotten by subtracting 7 from 10 - to these numbers
 */
import java.util.Scanner;
public class Ques438b
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // new Scanner object - input
        System.out.print("Enter number to decrypt >> ");
        int number = input.nextInt(); // number to decrypt
        
        int digit1 = number / 1000; // to get first digit
        int digit2 = (number - (digit1*1000))/100; // to get second digit
        int digit3 = (number - (digit1*1000+digit2*100))/10; // to get third digit
        int digit4 = number - (digit1*1000+digit2*100+digit3*10); // to get fourth digit
        
        int decrypt1;
        int decrypt2;
        int decrypt3;
        int decrypt4;
        
        // conditional loops to counter errors
        // for first digit
        if (digit3 >= 7) // 
            decrypt1 = digit3 - 7; 
        else
            decrypt1 = digit3 + 3;
        
        // for second digit
        if (digit4 >= 7)
            decrypt2 = digit4 - 7;
        else
            decrypt2 = digit4 + 3;
        
        // for third digit
        if (digit1 >= 7)
            decrypt3 = digit1 - 7; 
        else
            decrypt3 = digit1 + 3;
        
        // for fourth digit
        if (digit2 >= 7) 
            decrypt4 = digit2 - 7;
        else
            decrypt4 = digit2 + 3;
        
        int decrypted = (decrypt1*1000+decrypt2*100+decrypt3*10+decrypt4); // final value after decryption
        System.out.printf("The decrypted number is %d\n", decrypted);
    }
}