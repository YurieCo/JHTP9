public class Ques520
{
    public static void main(String[] args)
    {
        int denom = 3; // denominator value, starts with 3, and increases by two for each iteration
        double pivalue = 4; // first term of the series
        System.out.println("S/N\t\tValue"); // headers
        for (int counter = 1; counter <= 200000; counter++) // loop that iterates 200000 times
        {
            pivalue = pivalue - (double)4/denom + (double)4/(denom+2); // subtract value from original pivalue
            System.out.printf("%d\t\t%f\n", counter, pivalue);
            denom += 4; // increment denominator value
        }
    }
}