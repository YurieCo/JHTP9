public class Ques512
{
    public static void main(String[] args)
    {
        int i = 1;
        int oddproduct = 1;
        while ( i < 15)
        {
            if ((i % 2) != 0)
                oddproduct *= i;
            i++;
        }
        System.out.printf("Product of odd integers from 1 to 15 >> %d", oddproduct);
    }
}