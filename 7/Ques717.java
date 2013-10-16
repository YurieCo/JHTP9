import java.util.Random;
public class Ques717
{
    public static void main(String[] args)
    {
        Random randomNumbers = new Random(); // new Random object - randomNumbers
        int firstRoll;
        int secondRoll;
        int[] tally = new int[13]; // for recording results, the elements we really need range from tally[2] to tally[12]
        
        for (int counter = 0; counter < 36000000; counter++)
        {
            firstRoll = 1 + randomNumbers.nextInt(6); // random number between 1 and 6
            secondRoll = 1 + randomNumbers.nextInt(6); // random number between 1 and 6
            tally[firstRoll + secondRoll]++; // increment appropriate element storing the sum of the two rolls
        }
        System.out.printf("\nVaue\tFrequency\n"); // header
        for (int counter = 2; counter < 13; counter++)
            System.out.printf("%d:\t%9d\n", counter, tally[counter]);
    }
}