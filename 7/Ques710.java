public class Ques710
{
    public static void main(String[] args)
    {
        int[] sales = {4000, 2000, 5000, 2400, 4500, 6000, 1000, 1500, 10000, 70000, 5000,
            56000, 88000, 20000};
        double commission;
        int[] commissionArray = new int[9];
        for (int sale : sales)
        {
            commission = 200 + sale * 9/100;
            if (commission >= 200 && commission < 300)
                commissionArray[0]++;
            else if (commission >= 300 && commission < 400)
                commissionArray[1]++;
            else if (commission >= 400 && commission < 500)
                commissionArray[2]++;
            else if (commission >= 500 && commission < 600)
                commissionArray[3]++;
            else if (commission >= 600 && commission < 700)
                commissionArray[4]++;
            else if (commission >= 700 && commission < 800)
                commissionArray[5]++;
            else if (commission >= 800 && commission < 900)
                commissionArray[6]++;
            else if (commission >= 900 && commission < 1000)
                commissionArray[7]++;
            else
                commissionArray[8]++;
                
        }
        System.out.printf("\n%s: %d\n%s: %d\n%s: %d\n%s: %d\n%s: %d\n%s: %d\n%s: %d\n%s: %d\n%s: %d",
                          "$200 - 299", commissionArray[0], "$300 - 399", commissionArray[1], 
                          "$400 - 499", commissionArray[2], "$500 - 599", commissionArray[3], 
                          "$600 - 699", commissionArray[4], "$700 - 799", commissionArray[5], 
                          "$800 - 899", commissionArray[6], "$900 - 999", commissionArray[7], 
                          "$1000 and over", commissionArray[8]);
    }
}