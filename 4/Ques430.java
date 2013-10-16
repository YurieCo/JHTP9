import java.util.Scanner;
public class Ques430
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // new Scanner object - input
        System.out.print("Enter five-digit integer >> ");
        int number = input.nextInt(); // five digit integer entered
        int numtest = number / 10000; // to confirm if five digit integer was entered
        if (numtest > 9) // to set value to be less than 1 if it's more than five digits
            numtest = 0; // so as to meet condition for while loop which confirms values
        
        /* loop  confirms values by making sure the numtest variable is greater than one
         * (to counter a situation where digits are less than 5)
         * or to make sure the numtest variable is less than nine
         * (to counter a situation where digits are more than 5)
         */
        while (numtest < 1)
        { // loop to keep iterating until a five digit integer is entered
            System.out.printf("\n%d is not five digits long\n", number);
            System.out.print("\nEnter five-digit integer >> ");
            number = input.nextInt();
            numtest = number / 10000;
            if (numtest > 9) // to set value to be less than 1 if it's more than five digits
                numtest = 0; // so as to meet condition for while loop which confirms values
        }
        int a = number / 10000;
        int b = (number - (a * 10000)) / 1000;
        int c = (number - (a*10000+b*1000)) / 100;
        int d = (number - (a*10000+b*1000+c*100)) / 10;
        int e = (number - (a*10000+b*1000+c*100+d*10));
        
        int palin;
        palin = ((e*10000+d*1000+c*100+b*10+a));
        
        if (palin == number)
        {
            System.out.println("\nThe number entered is a palindrome");
        }
        else
            System.out.println("\nThe number entered is not a palindrome");
    }   
}