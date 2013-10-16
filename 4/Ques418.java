import java.util.Scanner;
public class Ques418
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // new Scanner object - input
        int newBalance; // variable representing new balance
        
        System.out.print("Account number >> ");
        int accnum = input.nextInt(); // variable representing account number
        System.out.print("Beginning balance >> ");
        int begBalance = input.nextInt(); // variable representing balance at the beginning of the month
        System.out.print("Charges >> ");
        int charges = input.nextInt(); // variable representing total of all items charged by the customer
        System.out.print("Credits >> "); 
        int credits = input.nextInt(); // variable representing total of all credits applied to the account
        System.out.print("Allowed Credit limit >> ");
        int allLimit = input.nextInt(); // variable representing allowed credit limit
        
        newBalance = begBalance + charges - credits;
        System.out.printf("\nNew Balance: %d\n", newBalance);
        if (newBalance > allLimit)
            System.out.println("Credit Limit Exceeded");
    }
}