import java.util.Scanner;
public class Ques232
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int d1; // first number
        int d2; // second number
        int d3; // third number
        int d4; // fourth number
        int d5; // fifth number
        int neg = 0; // to take note of negative numbers
        int pos = 0; // to take note of positive numbers
        int zero = 0; // to take note of number of zero inputs
        
        System.out.println("First number >> ");
        d1 = input.nextInt();
        System.out.println("Second number >> ");
        d2 = input.nextInt();
        System.out.println("Third number >> ");
        d3 = input.nextInt();
        System.out.println("Fourth number >> ");
        d4 = input.nextInt();
        System.out.println("Fifth number >> ");
        d5 = input.nextInt();
        
        // to take note of number of negative numbers
        if (d1 < 0)
            neg = neg + 1; // adds one to neg if it's negative
        if (d2 < 0)
            neg = neg + 1; // adds one to neg if it's negative
        if (d3 < 0)
            neg = neg + 1; // adds one to neg if it's negative
        if (d4 < 0)
            neg = neg + 1; // adds one to neg if it's negative
        if (d5 < 0)
            neg = neg + 1; // adds one to neg if it's negative
        
        // to take note of number of positive numbers
        if (d1 > 0)
            pos = pos + 1; // to take note of positive numbers
        if (d2 > 0)
            pos = pos + 1; // to take note of positive numbers
        if (d3 > 0)
            pos = pos + 1; // to take note of positive numbers
        if (d4 > 0)
            pos = pos + 1; // to take note of positive numbers
        if (d5 > 0)
            pos = pos + 1; // to take note of positive numbers
        
        // to take note of number of zero input
        if (d1 == 0)
            zero = zero + 1; // to take note of number of zero input
        if (d2 == 0)
            zero = zero + 1; // to take note of number of zero input
        if (d3 == 0)
            zero = zero + 1; // to take note of number of zero input
        if (d4 == 0)
            zero = zero + 1; // to take note of number of zero input
        if (d5 == 0)
            zero = zero + 1; // to take note of number of zero input
        
        System.out.printf("\nPositive numbers: %d\nNegative numbers: %d\nZero input: %d", 
                          pos, neg, zero);
        
    }
}