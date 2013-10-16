import java.util.Scanner;
public class Ques419
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // new Scanner object - input
        System.out.print("Number of Item One items sold >> ");
        int itemOne = input.nextInt();
        System.out.print("Number of Item Two items sold >> ");
        int itemTwo = input.nextInt();
        System.out.print("Number of Item Three items sold >> ");
        int itemThree = input.nextInt();
        System.out.print("Number of Item Four items sold >> ");
        int itemFour = input.nextInt();
        int earnings;
        
        System.out.printf("\nSales Earnings: %f", ((double)itemOne*239.99 +
                          (double)itemTwo*129.75 + (double)itemThree*99.95 + 
                          (double)itemFour*350.89)*0.09 + 200); // sales commission calculation
    }
}