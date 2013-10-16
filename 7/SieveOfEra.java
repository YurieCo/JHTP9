public class SieveOfEra
{
    public static void main(String[] args)
    {
        boolean[] primes = new boolean[1000];
        for (int b = 0; b < primes.length; b++)
            primes[b] = true;
        int c;
        for (int counter = 2; counter < 1000; counter++)
        {
            if (primes[counter] == true)
            {
                c = counter + counter;
                while ((c % counter == 0) && c < 1000)
                {
                    primes[c] = false;
                    c += counter;
                }
            }
        }
        System.out.println("Primes: ");
        for (int b = 0; b < primes.length; b++)
        {
            if (primes[b] == true)
                System.out.printf("%d, ", b);
        }
    }
}