public class Ques714
{
    private static int productNum = 1; // initialize variable productNum to store product of numbers
    public static void main(String[] args)
    {
        System.out.printf("Product >> %d", product(5,5,3,2,1));
    }
    public static int product(int... array)
    {
        for (int number : array) // loop through values in the variable-argument list and multiply
            productNum *= number;
        return productNum;
    }
}