import java.util.Scanner;
public class Ques437b
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // new Scanner object - input
        System.out.print("Enter number >> ");
        int number = input.nextInt();
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
            evalue += (double)1/jStore; // increment evalue by adding the inverse of corresponding factorial of j
            j++;                        // the (double) cast operator is used to convert the inverse to type double
        }
        System.out.printf("Final value of constant, e: %f", evalue);
    }
}