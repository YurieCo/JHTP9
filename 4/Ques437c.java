import java.util.Scanner;
public class Ques437c
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // new Scanner object - input
        System.out.print("Enter number of terms >> ");
        int number = input.nextInt();
        System.out.print("Enter x-value >> ");
        int number2 = input.nextInt();
        int j = 1; 
        double evalue = 1;
        
        while (j <= number)
        { // loop to keep increasing j until it's equal to the value entered by the user
            int jStore = j; // store the value of j to be used in calcula
            int jVal = jStore - 1;
            while (jVal >= 1)
            { // loop to calculate factorial of j-value
                jStore *= jVal;
                jVal--;
            }
            evalue += (double)Math.pow(number2, j)/jStore; // increment evalue by adding the x-value raised to the 
            j++;                                           // power of j divided by j!
        }                                                  // the (double) cast operator is used to convert the inverse
        System.out.printf("Final value: %f", evalue);      // to type double
    }
}