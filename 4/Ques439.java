// program to calculate and interprete world population
public class Ques439
{
    public static void main(String[] args)
    {
        int counter = 1;
        double worldpop = 600000;
        double current = worldpop;
        int doubleYear = 0;
        System.out.printf("%5s\t\t%20s\t\t%20s", "Year", "Anticipated Population",
                          "Numerical Increase");
        while (counter < 74)
        {
            current = worldpop * Math.pow(1.15, counter);
            if (current == worldpop*2)
            {
                doubleYear = counter;
            }
            System.out.printf("\n%5d\t\t%20f\t\t%20f", counter,current,current-worldpop);
            counter++;
        }
        if (doubleYear > 0)
            System.out.printf("\nPopulation was double its initial value in Year %d", doubleYear);
    }
}