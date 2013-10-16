import java.util.Scanner;
public class Ques513
{
    public static void main(String[] args)
    { 
        Scanner input = new Scanner(System.in); // new Scanner object  
        int j = 1;
        long factValue;
        System.out.printf("%5s\t%s", "Year", "Value");
        for (int counter = 1; counter <= 20; counter++)
        {
            j = counter-1;
            factValue = counter;
            while (j >= 1)
            {
                factValue *= j;
                j--;
            }
            System.out.printf("\n%5s\t%d", counter, factValue);
        }
    }
}