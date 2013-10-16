public class Ques716
{
    public static void main(String[] args)
    {
        if (args.length != 0) // if arguments are passed
        {
            double doubleSum = 0; // variable for holding sum of double values initialized to zero
            for (String number : args) // loop through arguments passed
                doubleSum += Double.parseDouble(number); // increment doubleSum with converted double number
            System.out.printf("Sum of values >> %f", doubleSum); // print sum
        }
        else // if no arguments are passed
            System.out.println("No arguments entered");
    }
}